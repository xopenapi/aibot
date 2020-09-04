#!/bin/sh
docker run --rm -v "${PWD}:/local" xopenapi/openapi-generator-cli generate \
    -i /local/tanyibot.yaml \
    --git-repo-id tanyibot-api-go \
    --git-user-id xopenapi \
    --package-name tanyibot \
    -g go \
    -o /local/out/tanyibot-api-go
