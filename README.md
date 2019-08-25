# Spring boot

```
[baptiste@DESKTOP-FUI7H3K target]$ ls -alhs
total 17M
4,0K drwxrwxr-x. 9 baptiste baptiste 4,0K 25 août  19:21 .
4,0K drwxrwxr-x. 6 baptiste baptiste 4,0K 25 août  19:21 ..
4,0K drwxrwxr-x. 3 baptiste baptiste 4,0K 25 août  19:21 classes
4,0K drwxrwxr-x. 3 baptiste baptiste 4,0K 25 août  19:21 generated-sources
4,0K drwxrwxr-x. 3 baptiste baptiste 4,0K 25 août  19:21 generated-test-sources
 17M -rw-rw-r--. 1 baptiste baptiste  17M 25 août  19:21 library-0.0.1-SNAPSHOT.jar
8,0K -rw-rw-r--. 1 baptiste baptiste 6,2K 25 août  19:21 library-0.0.1-SNAPSHOT.jar.original
4,0K drwxrwxr-x. 2 baptiste baptiste 4,0K 25 août  19:21 maven-archiver
4,0K drwxrwxr-x. 3 baptiste baptiste 4,0K 25 août  19:21 maven-status
4,0K drwxrwxr-x. 2 baptiste baptiste 4,0K 25 août  19:21 surefire-reports
4,0K drwxrwxr-x. 3 baptiste baptiste 4,0K 25 août  19:21 test-classes



[baptiste@DESKTOP target]$ java -jar library-0.0.1-SNAPSHOT.jar 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.6.RELEASE)

2019-08-25 19:24:15.399  INFO 31611 --- [           main] org.spring.boot.library.Application      : Starting Application v0.0.1-SNAPSHOT on DESKTOP-FUI7H3K with PID 31611 (/home/baptiste/IdeaProjects/SpringBootTest/target/library-0.0.1-SNAPSHOT.jar started by baptiste in /home/baptiste/IdeaProjects/SpringBootTest/target)
2019-08-25 19:24:15.411  INFO 31611 --- [           main] org.spring.boot.library.Application      : No active profile set, falling back to default profiles: default
2019-08-25 19:24:16.762  INFO 31611 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2019-08-25 19:24:16.799  INFO 31611 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-08-25 19:24:16.799  INFO 31611 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.21]
2019-08-25 19:24:16.902  INFO 31611 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-08-25 19:24:16.903  INFO 31611 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1406 ms
2019-08-25 19:24:17.225  INFO 31611 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-08-25 19:24:17.442  INFO 31611 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2019-08-25 19:24:17.445  INFO 31611 --- [           main] org.spring.boot.library.Application      : Started Application in 2.704 seconds (JVM running for 3.08)

```