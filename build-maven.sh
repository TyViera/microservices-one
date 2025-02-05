#!/bin/bash

cd api-gateway
mvn clean install

cd ../calculator
mvn clean install

cd ../discovery-service
mvn clean install

cd ../sum
mvn clean install

cd ..