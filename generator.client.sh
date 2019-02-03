#!/bin/env sh
docker run --rm \
  -v ${PWD}:/local openapitools/openapi-generator-cli generate \
  -i /local/src/main/resources/openapi.yaml \
  -g javascript \
  -o /local/js \
  -DdebugOpenAPI \
  -DdebugModels \
  -DdebugSupportingFiles \
  -DhideGenerationTimestamp=true
