# Usa una imagen base de OpenJDK
FROM openjdk:21-jdk-slim

ARG JAR_FILE=target/ProBiblioteca-0.0.1.jar

# Copia el archivo JAR de tu aplicación al contenedor
COPY ${JAR_FILE} app_probiblioteca.jar

# Expone el puerto en el que tu aplicación se ejecuta
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app_probiblioteca.jarr"]
