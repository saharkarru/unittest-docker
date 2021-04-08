FROM openjdk:8
EXPOSE 8080
ADD target/webbased-0.0.1-SNAPSHOT.jar /webbased-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/webbased-0.0.1-SNAPSHOT.jar"]
