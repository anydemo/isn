#!/bin/env sh
docker run --rm \
  -v ${PWD}:/local openapitools/openapi-generator-cli generate \
  -i openapi.yaml \
  -g spring \
  -o /local
