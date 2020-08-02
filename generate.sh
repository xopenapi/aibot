#!/bin/sh
docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/tanyibot.yaml \
    --git-repo-id tanyibot \
    --git-user-id xopenapi \
    --package-name tanyibot \
    -g go \
    -o /local/out/tanyibot-api

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/tanyibot.yaml \
    --git-repo-id tanyibot-api-server \
    --git-user-id xopenapi \
    -g kotlin-spring \
    -o /local/out/tanyibot-api-server

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/tanyibot.yaml \
    --git-repo-id tanyibot-api-java \
    --git-user-id xopenapi \
    -g java \
    -o /local/out/tanyibot-api-java