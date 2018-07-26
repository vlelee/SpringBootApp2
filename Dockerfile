
FROM openjdk:8-alpine

WORKDIR /app

COPY target/VickiChrisL2-1.0-SNAPSHOT.jar /app/VickiChrisRelease.jar

CMD ["java", "-jar", "/app/VickiChrisRelease.jar"]
