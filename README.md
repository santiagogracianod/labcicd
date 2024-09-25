#  Test application

[![CI/CD Pipeline](https://github.com/santiagogracianod/labcicd/actions/workflows/build.yml/badge.svg?branch=main)](https://github.com/santiagogracianod/labcicd/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=santiagogracianod_labcicd&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=santiagogracianod_labcicd)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=santiagogracianod_labcicd&metric=bugs)](https://sonarcloud.io/summary/new_code?id=santiagogracianod_labcicd)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=santiagogracianod_labcicd&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=santiagogracianod_labcicd)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=santiagogracianod_labcicd&metric=coverage)](https://sonarcloud.io/summary/new_code?id=santiagogracianod_labcicd)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=santiagogracianod_labcicd&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=santiagogracianod_labcicd)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=santiagogracianod_labcicd&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=santiagogracianod_labcicd)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=santiagogracianod_labcicd&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=santiagogracianod_labcicd)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=santiagogracianod_labcicd&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=santiagogracianod_labcicd)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=santiagogracianod_labcicd&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=santiagogracianod_labcicd)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=santiagogracianod_labcicd&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=santiagogracianod_labcicd)

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