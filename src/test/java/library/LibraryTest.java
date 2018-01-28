package library;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;

import org.spring.boot.library.model.Book;
import org.spring.boot.library.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LibraryTest {

	@Autowired
	private TestRestTemplate restTemplate;


	@Test
	public void shouldFindAllBooks()throws Exception {
		Book[] books = this.restTemplate.getForObject("/api/v1/books", Book[].class);
		assertThat(books).isNotEmpty();

	}
	

	@Test
	public void shouldFindAllBooks2()throws Exception {
		ResponseEntity<Book[]> booksResponse = this.restTemplate.getForEntity("/api/v1/books", Book[].class);
		Book[] books = booksResponse.getBody();
		assertThat(books).isNotEmpty();

	}
	
	@Test
	public void shouldFindBook()throws Exception {
		Book book = this.restTemplate.getForObject("/api/v1/books/Zaire", Book.class);
		assertThat(book.getName()).isEqualTo("Zaire");

	}


}
