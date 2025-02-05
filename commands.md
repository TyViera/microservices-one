## Commands used:

```shell

docker pull <image> # to pull an image from a central repository
docker image ls # to list the images
docker ps # to see the running containers
docker ps -a # to see all the containers
docker build <params> <dockerfile-location> # to build a new image
  docker build -t service-discovery . #Example
docker run <params> <image-name> # to run an image into a container
  docker run -e SERVER_PORT=1234 -p 8080:1234 api-gateway #Example
docker start <container-id> # to re-start an existent container
docker stop <container-id> # to stop a running container
docker image rm <image-name> # to remove an image
docker container rm <container-id> # to remove a stopped container

```