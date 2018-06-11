FROM java:8

RUN apt-get update && apt-get install -y dos2unix

WORKDIR /opt/app
COPY ./build/libs/app-api-0.0.1-SNAPSHOT.jar ./app-api-0.0.1-SNAPSHOT.jar
COPY ./docker/scripts ./scripts

RUN chmod 755 ./scripts/wait-for-it.sh && \
	find ./scripts -type f -print0 | xargs -0 dos2unix

EXPOSE 8080 5080
ENTRYPOINT java -Xdebug -Xrunjdwp:server=y,transport=dt_socket,suspend=n,address=5080 -Dserver.port=8080 -jar app-api-0.0.1-SNAPSHOT.jar
