FROM openjdk:17
LABEL maintainer="dummy"
ADD  target/data.jar data.jar
ENTRYPOINT [ "java","-jar","data.jar" ]
