FROM amazoncorretto:17-alpine-jdk
COPY target/practica1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app.jar"]
