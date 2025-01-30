# Dockerfile
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY . .
RUN ./gradlew build -x test
ENTRYPOINT ["./gradlew", "bootRun"]