FROM openjdk:18-jdk-alpine
COPY appcds*.jar /opt/appcds.jar
COPY appcds*.jar.original /opt/appcds.jar.original
WORKDIR /opt
RUN ["/bin/sh", "-c", "jar -xf appcds.jar"]
ENTRYPOINT ["/bin/sh", "-c", "java -cp appcds.jar.original:BOOT-INF/lib/* com.bojug.appcds.AppcdsApplication"]