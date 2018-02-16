FROM java:8
WORKDIR /app
COPY target/dockerawstest-1.0-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
CMD ["java","-jar","app.jar"]