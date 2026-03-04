FROM maven:3.9.6-eclipse-temurin-11 AS build
WORKDIR /app

COPY pom.xml .
RUN mvn -q -DskipTests dependency:go-offline

COPY src ./src
RUN mvn -q -DskipTests package

FROM eclipse-temurin:11-jre
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar.

EXPOSE 8081
ENTRYPOINT ["java","-jar","/app/app.jar"]
