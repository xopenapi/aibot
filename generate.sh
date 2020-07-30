#!/bin/sh
docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/tanyibot.yaml \
    --git-repo-id aibot \
    --git-user-id xopenapi \
    --package-name aibot \
    -g go \
    -o /local/out/tanyibot-api

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/tanyibot.yaml \
    --git-repo-id tanyibot-api-server \
    --git-user-id xopenapi \
    -g kotlin-spring \
    -o /local/out/tanyibot-api-server
