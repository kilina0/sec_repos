# Use official Golang image as the base
FROM maven:3.9.9 AS builder

# Run tests as part of the build process
RUN mvn clean test
