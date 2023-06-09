test-keycloack
==============

This is a show-case setup of server to server authentication
using [Keycloack](https://www.keycloak.org).

Prerequisites
-------------

-   OpenJDK 17 - gradle does not support yet JdK 20.
-   Docker - a recent version.

Components
----------

-   *Keycloack* service.
-   *test-oauth2-client* - a sample Java - Spring Boot service
    consuming resources exposed by the resource server.
-   *test-outh2-server* - a sample resource server written in
    Java with Spring Boot.

Building and running
--------------------

The setup of the applications is done with the help of docker compose. The
`ompose.yaml` in the project root directory builds and runs the 3 components
described above.

To build:

    docker-compose build

To run:

    docker-compose up

`docker-compose up` command also mounts the file `realm-export.json` in
the keycloack container so keycloack will import configuration when starting.

To access keycloack settings just go to:

    http://localhost:8080/admin

and use `admin/admin` to authenticate. Select the realm `mihaitest`.

To test the software, use:

    curl -v http://localhost:8000/testoauth2client/v1/resources/abcd

You can also use `get-tocken` shell script to directly authenticate and
verify the token returned by keycloack.


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

We are using a pre-buiilt dockerized version of keycloack:

    quay.io/keycloak/keycloak:21.1.1

The settings for keycloack server are in the file:

    realm-export.json

in the root folder of the project.


macOS notes
-----------

Install OpenJDK 17:

    brew install openjdk@17
    sudo ln -s /usr/local/opt/openjdk@17/libexec/openjdk.jdk/ \
      /Library/Java/JavaVirtualMachines/openjdk-17.jdk
    export JAVA_HOME=$(/usr/libexec/java_home -v 17.0.7)
