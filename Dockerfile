# Use official Golang image as the base
FROM maven:3.9.9 AS builder

# Set the working directory in the container
WORKDIR /app

# Copy go.mod and go.sum first to cache dependencies
COPY . .

# Run tests as part of the build process
RUN mvn clean test
