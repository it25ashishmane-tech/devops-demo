FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/devops-demo-1.0.jar app.jar

EXPOSE 8081

CMD ["java", "-cp", "app.jar", "com.example.App"]