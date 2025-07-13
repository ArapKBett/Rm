FROM openjdk:17-jdk-slim
WORKDIR /app
COPY src/*.java .
RUN javac *.java
EXPOSE 1099
CMD ["java", "MathServer"]
