# syntax=docker/dockerfile:1

# Stage 1: Build stage
FROM eclipse-temurin:17 AS build
WORKDIR /app

# Copy the pom.xml file
ADD build.gradle .
ADD gradlew .
ADD settings.gradle .
ADD gradle ./gradle
ADD src ./src

# Build the application
RUN ./gradlew build

# Stage 2: Runtime stage
FROM eclipse-temurin:17
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/build/libs/test-oauth2-server-0.0.1-SNAPSHOT.jar .

EXPOSE 8080/tcp

# Specify the command to run the application
CMD ["java", "-jar", "test-oauth2-server-0.0.1-SNAPSHOT.jar"]
