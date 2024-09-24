#  Test application

[![CI/CD Pipeline](https://github.com/santiagogracianod/labcicd/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/santiagogracianod/labcicd/actions/workflows/build.yml)

Implementation of a Simple App with the next operations:

* Get random nations
* Get random currencies
* Get random airplanes
* Get application version
* health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:
```shell
$ mvnw spring-boot:runto download the node dependencies
```
### How to test it

Execute:
shell
$ mvnw clean install
### How to get coverage test

Execute:
```shell
$ mvwn -B package -DskipTests --file pom.xml
```