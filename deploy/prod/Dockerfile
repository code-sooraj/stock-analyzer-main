FROM docker.io/openjdk:17-alpine
LABEL maintainer="conserwit.com"
ENV SPRING_PROFILES_ACTIVE="prod"
EXPOSE 8080
WORKDIR .
COPY ../../target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
