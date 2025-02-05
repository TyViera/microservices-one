#!/bin/bash

waitTime=3
eurekaHostName=172.31.173.129
eurekaPort=8761
clusterHostName=172.31.173.129

docker run -p $eurekaPort:9999 -d discovery-service-ms
sleep $waitTime

sumPort=31000
docker run -p $sumPort:$sumPort -e EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://$eurekaHostName:$eurekaPort/eureka -e EUREKA_INSTANCE_HOSTNAME=$clusterHostName -e SERVER_PORT=$sumPort -d sum-ms
sleep $waitTime

gatewayPort=9000
docker run -p $gatewayPort:$gatewayPort -e EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://$eurekaHostName:$eurekaPort/eureka -e EUREKA_INSTANCE_HOSTNAME=$clusterHostName -e SERVER_PORT=$gatewayPort -d api-gateway-ms
sleep $waitTime

calculatorPort=21000
docker run -p $calculatorPort:$calculatorPort -e EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://$eurekaHostName:$eurekaPort/eureka -e EUREKA_INSTANCE_HOSTNAME=$clusterHostName -e SERVER_PORT=$calculatorPort -d calculator-ms