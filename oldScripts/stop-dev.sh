#!/bin/bash
export MYSQL_USER=birthdayreminderuser
export MYSQL_PASSWORD=examplepass
export MYSQL_DATABASE=birthdayreminder
export MYSQL_ROOT_PASSWORD=test12

./payara/glassfish/bin/asadmin stop-domain birthday-rem-domain

docker compose --file only-db.yml down