FROM openjdk:17-jdk-slim
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN apt-get update && apt-get install -y maven
RUN mvn package
EXPOSE 8080
CMD ["java", "-jar", "target/rmi-webapp-0.0.1-SNAPSHOT.jar"]
