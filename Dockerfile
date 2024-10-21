FROM openjdk:17-jdk-alpine
ARG JAR_FILE=build/libs/\*.jar
COPY ${JAR_FILE} greeting-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","greeting-0.0.1-SNAPSHOT.jar"]
