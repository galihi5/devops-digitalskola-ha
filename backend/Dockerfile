FROM openjdk:17-jdk-slim

WORKDIR /app

COPY demo-ha/demo-ha-0.0.1.jar /app/app.jar

EXPOSE 8080

# Jalankan aplikasi
CMD ["java", "-jar", "/app/app.jar"]