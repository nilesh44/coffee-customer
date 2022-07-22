FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} coffee-customer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/coffee-customer-0.0.1-SNAPSHOT.jar"]