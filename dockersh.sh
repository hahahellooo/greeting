#!/bin/bash

echo "Docker STOP"
docker stop greeting

echo "Docker REMOVE"
docker rm -f greeting

echo "Docker pull"
docker pull meiun/greeting:0.1.0


