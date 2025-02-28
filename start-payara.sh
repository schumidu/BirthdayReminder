#!/bin/bash

set -a
source .env
set +a

./payara/bin/asadmin start-domain --debug birthday-rem-domain