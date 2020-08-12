#!/bin/sh
docker run --rm -v "${PWD}:/local" xopenapi/openapi-generator-cli generate \
    -i /local/aibot.yaml \
    --git-repo-id aibot \
    --git-user-id xopenapi \
    --package-name aibot \
    -g go \
    -o /local/out/aibot-api-go
