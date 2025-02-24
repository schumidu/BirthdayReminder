#!/bin/bash

docker compose --file dev-compose.yml rm --force
docker compose --file dev-compose.yml up --build --force-recreate --remove-orphans 
# docker compose --file dev-compose.yml rm