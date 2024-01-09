FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-ea-17-jdk-slim-bullseye
COPY --from=build /target/Assign2-0.0.1-SNAPSHOT.jar Assign.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/Assign.jar"]
