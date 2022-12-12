FROM openjdk:11
VOLUME /tmp
ADD ./target/customer-service-1.0-SNAPSHOT.jar customer.jar
ENTRYPOINT ["java","-jar","customer.jar"]