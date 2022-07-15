FROM openjdk:12-alpine
RUN apk update && apk add ca-certificates && rm -rf /var/cache/apk/*
COPY ca.pem /usr/local/share/ca-certificates/ca.crt
RUN update-ca-certificates
COPY target/app.jar /usr/app/app.jar
WORKDIR /usr/app
EXPOSE 443
ENTRYPOINT ["java","-jar","app.jar"]