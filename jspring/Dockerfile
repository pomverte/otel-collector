FROM eclipse-temurin:17-alpine AS builder
COPY . .
RUN ./gradlew --no-daemon bootJar

FROM eclipse-temurin:17.0.13_11-jre-alpine
EXPOSE 8080
ARG OTEL_JAVA_AGENT_VERSION=1.24.0
ADD https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v${OTEL_JAVA_AGENT_VERSION}/opentelemetry-javaagent.jar /app/opentelemetry-javaagent.jar
COPY --from=builder /build/libs/jspring-0.0.1-SNAPSHOT.jar /app/jspring.jar
CMD ["java", "-javaagent:/app/opentelemetry-javaagent.jar", "-jar", "/app/jspring.jar"]
