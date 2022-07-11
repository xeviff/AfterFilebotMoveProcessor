FROM maven:alpine as build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
RUN mvn clean package

FROM openjdk:8-jdk-alpine
COPY --from=build /usr/app/target/mangrana-content-tools-1.0-SNAPSHOT-jar-with-dependencies.jar /app/runner.jar
ENTRYPOINT java -jar /app/runner.jar