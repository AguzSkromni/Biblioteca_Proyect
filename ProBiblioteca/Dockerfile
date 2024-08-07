# Usa una imagen base de Java
FROM eclipse-temurin:21-jdk AS builder

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo pom.xml y mvnw, así como la carpeta .mvn
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline

# Copia el resto del código fuente
COPY src ./src

# Construye la aplicación
RUN ./mvnw package -DskipTests

# Usa una imagen base de Java para ejecutar la aplicación
FROM eclipse-temurin:21-jre

# Copia el JAR construido desde la etapa anterior
COPY --from=builder /app/target/*.jar app.jar

# Expone el puerto en el que tu aplicación escucha
EXPOSE 8080

# Define el comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]
