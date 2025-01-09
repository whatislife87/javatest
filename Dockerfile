FROM openjdk:17-jdk-slim
WORKDIR /app
COPY CalculatorApplication.java /app/
RUN javac CalculatorApplication.java
EXPOSE 8000
ENTRYPOINT ["java", "CalculatorApplication"]
