# Food Ordering System

A simple Java Maven project for demonstrating:

- Maven build
- JUnit testing
- Git/GitHub
- Jenkins CI
- Docker image creation

## Run locally

```bash
mvn clean test
mvn package
java -cp target/classes com.foodorder.FoodOrderApp
```

## Docker

```bash
docker build -t food-ordering-system:latest .
docker run --rm food-ordering-system:latest
```
