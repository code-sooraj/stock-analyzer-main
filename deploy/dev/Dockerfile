FROM docker.io/openjdk:17-alpine
LABEL maintainer="conserwit.com"
ENV SPRING_PROFILES_ACTIVE="dev"
EXPOSE 8080
WORKDIR .
RUN mkdir /db
COPY ../../db/stock-metadata.db /db/stock-metadata.db
COPY ../../target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
