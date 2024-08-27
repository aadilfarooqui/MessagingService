#!/bin/bash

echo "Starting..."

# Path to your JAR file
JAR_PATH="MessagingService/out/artifacts/messaging_service_jar/messaging-service.jar"

# Java options (optional)
JAVA_OPTS="-Xmx512m"

# Check if the JAR file exists
if [ -f "$JAR_PATH" ]; then
  echo "Executing JAR file..."
  java $JAVA_OPTS -jar "$JAR_PATH" "Aadil" "Shahzaib"
else
  echo "Error: JAR file not found at $JAR_PATH"
  exit 1
fi
