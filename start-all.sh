#!/bin/bash

./start-db.sh
./start-payara.sh
./gradlew war
./deploy-war.sh