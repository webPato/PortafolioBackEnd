FROM amazoncorretto:20-alpine-jdk
COPY target/portfolio-0.0.1-SNAPSHOT.jar app_portfolio.jar
ENTRYPOINT ["java","-jar","/app_portfolio.jar"]
