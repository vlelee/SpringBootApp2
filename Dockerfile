
FROM openjdk:8-alpine

WORKDIR /app

COPY . .

RUN ./MVNW package

CMD ["java", "-jar", "/app/target/VickiChrisRelease.jar"]