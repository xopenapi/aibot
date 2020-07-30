#!/bin/sh
docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/aibot.yaml \
    --git-repo-id aibot \
    --git-user-id xopenapi \
    --package-name aibot \
    -g go \
    -o /local/out/aibot-api

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/aibot.yaml \
    --git-repo-id aibot-api-server \
    --git-user-id xopenapi \
    -g kotlin-spring \
    -o /local/out/aibot-api-server
