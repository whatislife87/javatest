FROM openjdk:11-jdk-slim-buster

WORKDIR /app

COPY Calculator.java /app/src/

RUN javac -d classes src/Calculator.java

ENTRYPOINT ["java", "-cp", "classes", "Calculator"]
