FROM openjdk:18-jdk-alpine
COPY target/appcds-0.0.1-SNAPSHOT.jar /opt/appcds.jar
WORKDIR /opt
ENTRYPOINT ["java", "-jar", "/opt/appcds.jar"]