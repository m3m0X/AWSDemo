# lab-spring-api-1
API example to use @RestController annotation Spring Boot


# Requirements

- Maven 3.6 or later
- Java 8 or later

# Use

Go to root project folder & execute the command `mvn spring-boot:run`,
you will get a similar next screen


```
[INFO] <<< spring-boot-maven-plugin:2.5.3:run (default-cli) < test-compile @ hello-lab1 <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.5.3:run (default-cli) @ hello-lab1 ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.3)

2021-08-07 16:02:21.574  INFO 3029476 --- [           main] com.hvs.api.hello.HelloApplication       : Starting HelloApplication using Java 11.0.11 on cotetec099 with PID 3029476 (/home/hmartinez/projects/labs/lab-api-1/target/classes started by hmartinez in /home/hmartinez/projects/labs/lab-api-1)
2021-08-07 16:02:21.576  INFO 3029476 --- [           main] com.hvs.api.hello.HelloApplication       : No active profile set, falling back to default profiles: default
2021-08-07 16:02:22.558  INFO 3029476 --- [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port 8080
2021-08-07 16:02:22.570  INFO 3029476 --- [           main] com.hvs.api.hello.HelloApplication       : Started HelloApplication in 1.34 seconds (JVM running for 1.636)
```


Now, go to your browser with the URL `http://localhost:8080/`. You should see a scren lika a this:

![hell2.jpg](https://cdn.hashnode.com/res/hashnode/image/upload/v1628521484159/_3LsG0pIH9.jpeg)