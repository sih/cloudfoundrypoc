FROM java:8
VOLUME /tmp
VOLUME /target
ADD build/libs/simple-country-svc-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8909
ENTRYPOINT ["java", "-jar", "/app.jar"]