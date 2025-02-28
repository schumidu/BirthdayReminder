#!/bin/bash

set -a
source .env
set +a

docker compose --file only-db.yml rm --force
docker compose --file only-db.yml up --force-recreate --remove-orphans -d