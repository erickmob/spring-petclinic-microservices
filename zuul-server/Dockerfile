FROM maven:3.6.3-adoptopenjdk-11 as build

WORKDIR /usr/src/pet-clinic/
COPY . /usr/src/pet-clinic/

WORKDIR zuul-server/

RUN mvn clean package

FROM adoptopenjdk/openjdk11:alpine-jre
RUN apk --no-cache add curl

RUN addgroup -S spring && adduser -S spring -G spring

RUN mkdir -p /files &&  \
	chown -R spring:spring /files

USER spring:spring

VOLUME /files

WORKDIR /app

COPY --from=build /usr/src/pet-clinic/zuul-server/target/zuul-server-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]