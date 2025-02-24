FROM gradle:8.8.0-jdk21 AS builder
WORKDIR /usr/app
COPY ./app .
RUN gradle war

FROM payara/server-full:6.2024.5-jdk21

LABEL contactmail="schumann.lukas@gmx.de"
COPY ./config/resources/mysql-connector-j-8.1.0.jar /opt/payara/appserver/glassfish/lib/mysql-connector-j-8.1.0.jar
COPY ./config/payara/docker/pre-boot-commands.asadmin ${PREBOOT_COMMANDS}
COPY ./config/payara/docker/post-boot-commands.asadmin ${POSTBOOT_COMMANDS}

COPY --from=builder /usr/app/build/libs/birthday-reminder.war ${DEPLOY_DIR}

ENV TZ=Europe/Berlin