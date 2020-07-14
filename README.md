# springboot-gradle-java
Spring Boot web app, coded with Java, built using Gradle

## How to build

From the root project directory:  
* `./gradlew clean build` (build the Spring Boot app)
* `docker image build -t foobar ./app-springboot-helloworld` (build a Docker image that can run the app)

## How to run

From the root project directory after building with Gradle:  
* `java -jar .\app-springboot-helloworld\build\libs\springboot-helloworld.jar`
