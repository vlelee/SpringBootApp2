
FROM openjdk:8-alpine

WORKDIR /app

COPY . .

CMD ["java", "-jar", "/app/target/VickiChrisRelease.jar"]