FROM openjdk:17

COPY . /usr/src/expense

WORKDIR /usr/src/expense


RUN ./mvnw clean install -DskipTests

ENTRYPOINT ["./mvnw","spring-boot:run"]
