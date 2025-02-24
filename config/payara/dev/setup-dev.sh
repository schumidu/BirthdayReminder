#!/bin/bash

PROJECT_DIR=../../..

PAYARA_MAJOR=6
PAYARA_VERION=$PAYARA_MAJOR.2025.1
PAYARA_ZIP=payara-$PAYARA_VERION.zip
PAYARA_DIR=$PROJECT_DIR/payara
ASADMIN=$PAYARA_DIR/bin/asadmin

JDK_DIR=$PAYARA_DIR/jdk21
JDK_VERSION=21.0.6

MYSQL_CON=mysql-connector-j-8.1.0.jar

RESOURCES=../../resources

echo "Start setup payara for dev"
echo "Remove old payara"
rm -rf $PAYARA_DIR

echo "Unzip payara"
unzip -oq $RESOURCES/$PAYARA_ZIP
mv payara$PAYARA_MAJOR $PAYARA_DIR

echo "Move MySQL-Connector.jar to payara"
cp $RESOURCES/$MYSQL_CON $PAYARA_DIR/glassfish/lib/$MYSQL_CON

echo "Setup payara"
$ASADMIN --port 2248 multimode --file setup.asadmin