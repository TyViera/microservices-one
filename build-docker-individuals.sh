#!/bin/bash

docker build -t api-gateway-ms api-gateway
docker build -t calculator-ms calculator
docker build -t discovery-service-ms discovery-service
docker build -t sum-ms sum