FROM maven:3.8.4-jdk-11 as builder
WORKDIR /usr/src/
COPY ./pom.xml ./pom.xml
RUN mvn -B package

COPY ./src ./src
RUN mvn -B package

#FROM tomcat:8.5.77-jre11-openjdk-slim-buster
FROM tomcat:9.0.60-jdk11-openjdk
EXPOSE 8080
COPY ./entrypoint.sh ./entrypoint.sh
RUN ["chmod", "+x", "entrypoint.sh"]
ENTRYPOINT [ "./entrypoint.sh" ]
COPY --from=builder /usr/src/target/vulnerable.war /usr/local/tomcat/webapps/vulnerable.war
