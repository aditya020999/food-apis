
FROM openjdk:22
ADD target/food-apis.jar food-apis.jar
ENTRYPOINT ["java", "-jar", "food-apis.jar"]
