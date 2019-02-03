#!/bin/env sh
docker run --rm \
  -v ${PWD}:/local openapitools/openapi-generator-cli generate \
  -i /local/src/main/resources/openapi.yaml \
  -g spring \
  -o /local \
  -c /local/generator.json \
  -DdebugOpenAPI \
  -DdebugModels \
  -DdebugSupportingFiles \
  -DhideGenerationTimestamp=true
