# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add a volume pointing to /tmp
VOLUME /tmp

# Add the application's jar to the container
ADD target/driveyourway.jar driveyourway.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "driveyourway.jar"]