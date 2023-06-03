test-keycloack
==============

This is a show-case setup of server to server authentication
using [Keycloack](https://www.keycloak.org).

Prerequisites
-------------

-   OpenJDK 17 - gradle does not support yet JdK 20.

Components
----------

-   *Keycloack* service.
-   *test-oauth2-client* - a sample Java - Spring Boot service
    consuming resources exposed by the resource server.
-   *test-outh2-server* - a sample resource server written in
    Java with Spring Boot.

test-oauth2-client
------------------

To build, use:

    cd test-oauth2-client
    gradle build

Run it with:

    java -jar build/libs/test-oauth2-client-0.0.1-SNAPSHOT.jar

test-oauth2-server
------------------

To build, use:

    cd test-oauth2-server
    gradle build

Run it with:

    java -jar build/libs/test-oauth2-server-0.0.1-SNAPSHOT.jar


Keycloack
---------

macOS notes
-----------

Install OpenJDK 17:

    brew install openjdk@17
    sudo ln -s /usr/local/opt/openjdk@17/libexec/openjdk.jdk/ \
      /Library/Java/JavaVirtualMachines/openjdk-17.jdk
    export JAVA_HOME=$(/usr/libexec/java_home -v 17.0.7)
