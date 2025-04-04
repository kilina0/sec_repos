# Use official Golang image as the base
FROM maven:3.9.9 AS builder

# Copy go.mod and go.sum first to cache dependencies
COPY pom.xml ./

# Run tests as part of the build process
RUN mvn clean test
