FROM openjdk:8
ARG JAR_FILE=target/*.jar

ENTRYPOINT ["java","-jar","/devops.jar"]
EXPOSE 2001
