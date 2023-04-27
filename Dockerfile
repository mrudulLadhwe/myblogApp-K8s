FROM eclipse-temurin:17

LABEL org.opencontainers.image.authors="ladhwe.m@northeastern.edu"

EXPOSE 8080

WORKDIR /app

COPY target/springboot-blog-rest-api-0.0.1-SNAPSHOT.jar /app/springbootmql-docker-demo.jar

ENTRYPOINT ["java","-jar", "springbootmql-docker-demo.jar"]