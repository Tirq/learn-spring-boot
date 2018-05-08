# spring-consuming-restfull-web-service
This guide provides a sampling of how Spring Boot helps you accelerate and facilitate application development. This example is based on the Spring guides, available in https://spring.io/guides/gs/spring-boot/. 

## Build and Run project
To build this project, you need to have Gradle installed in your system because I decided to not use the Gradle wrapper commands.

In the root of the project execute:
```
gradle build
```
And then to start the embedded server execute:
```
java -jar build/libs/four-spring-boot.jar
```
The name of the jar is declared in the _build.gradle_ file in the _bootJar_ section. 

There is also a Groovy example. To run this example, you will need have Spring CLI installed in your system. 
```
spring run app.groovy
```

## Create a first REST Controller 

This project only create a controller who returns a welcome message (Greetings from Spring Boot!). 

There are also two tests using this controller.

Finally it was used the actuator module, to see some informations about the application. For example, you can see if the application is up using the address:
```
http://localhost:80080/actuator/health
```
Or using the CURL command:
```
curl http://localhost:80080/actuator/health
```