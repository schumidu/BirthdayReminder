#!/bin/bash

export MYSQL_USER=birthdayreminderuser
export MYSQL_PASSWORD=examplepass
export MYSQL_DATABASE=birthdayreminder
export MYSQL_ROOT_PASSWORD=test12

export DATABASE_USER=birthdayreminderuser
export DATABASE_PASSWORD=examplepass
export DATABASE_NAME=birthdayreminder
export DATABASE_HOST=localhost
export DATABASE_PORT=3306

docker compose --file only-db.yml down

./gradlew build war

docker compose --file only-db.yml rm --force
docker compose --file only-db.yml up --force-recreate --remove-orphans -d

./payara/glassfish/bin/asadmin start-domain --debug=true birthday-rem-domain
./payara/glassfish/bin/asadmin --port 2248 deploy --force=true ./app/build/libs/birthday-reminder.war