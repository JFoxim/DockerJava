FROM openjdk:8-jdk-alpine
ADD target/hello-world-api.jar hello-world-api.jar
ENTRYPOINT ["sh", "-c", "java -jar /hello-world-api.jar"]