# OpenJDK 이미지를 기반으로 사용
FROM openjdk:17

# 작업 디렉토리 생성
WORKDIR /app

# Java 소스 코드 복사
COPY Calculator.java .

# 소스 코드 컴파일
RUN javac Calculator.java

# 실행 파일 지정
CMD ["java", "Calculator"]
