#!/bin/bash

echo "Docker STOP"
docker stop temurin

echo "Docker REMOVE"
docker rm -f temurin

echo "Docker pull"
docker pull meiun/greeting:temurin

echo "Docker run"
docker run -p 8080:8080 --name temurin meiun/greeting:temurin

