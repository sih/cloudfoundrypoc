# Cloudfoundry PoC

## Whats in here
In this repo you will find a bunch of microservicey apps that serve the purpose of demonstrating how to build apps that work in a cloud environment.  They are a first go at them so assume they are not sufficiently good enough to release anywhere sensible.

## What are they

### EurekaServer
This is a super simple implementation of a Eureka Server (Netflix) that is used for service registry and location.

### Sample-Java-Service
This is a simple greeting app that when started, looks for a Eureka and registers itself as a service.  It does not have the capability to look up another service.

There is a /v2 service that can also take a country code as a parameter and return a country-appropriate greeting.

### Country-Service
This is a simple service that returns country information (code, name, salutation) for a number of countries. Currently supports [GB,FR,ES,CH,US]

### EurekaClient
This is a java service that when employed will envoke the services of the simple-java-service through the service registry.

## How do I use them
All parts of this project work with Gradle.  The basic operation for them all is
1. Build with `gradle`
2. Execute with `java -jar build/libs/<name>.jar`

## Docker container cleanup
docker rm `docker ps --no-trunc -aq`

## Usefull cloudfoundry calls
* `cf delete-orphaned-routes`
* `cf delete app-name`
* `cf delete-service service-name`
* `cf logs service-name --recent`
