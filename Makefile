
build:
	./mvnw clean package

run: build
	./mvnw spring-boot:run