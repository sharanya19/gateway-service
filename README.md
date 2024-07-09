# Gateway Service

This project is the Gateway Service for a microservices architecture, built with Spring Boot and Spring Cloud Gateway. It acts as a reverse proxy to route requests to the appropriate microservices. The Gateway Service also registers with Eureka for service discovery and uses Zipkin for distributed tracing.

## Project Structure

The project includes the following main components:

- **application.properties**: Configuration file for setting up the gateway routes, Eureka client, and Zipkin tracing.
- **pom.xml**: Maven configuration file with dependencies and properties for the project.
