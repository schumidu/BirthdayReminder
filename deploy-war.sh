#!/bin/bash

./payara/bin/asadmin --port 2248 deploy --force=true ./app/build/libs/birthday-reminder.war
./payara/bin/asadmin --port 2248 list-applications