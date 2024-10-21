#!/bin/bash

echo "Docker STOP"
docker stop greeting-0.0.1-SNAPSHOT.jar

echo "Docker REMOVE"
docker rm greeting-0.0.1-SNAPSHOT.jar

echo "Docker RUN"
docker run --name greeting -p 8080:8080 meiun/greeting:0.1.0
