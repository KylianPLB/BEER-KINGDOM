# Utiliser une image de base Java
FROM openjdk:21-jdk-slim

# Définir le répertoire de travail
WORKDIR /app

# Copier le JAR généré avec le nom correct
COPY target/app.jar app.jar

# Exposer le port sur lequel l'application écoute
EXPOSE 8080

# Définir la commande de démarrage de l'application
CMD ["java", "-jar", "app.jar"]