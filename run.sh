#!/usr/bin/env bash

mvn clean install
pushd web-app
mvn spring-boot:run
popd