#!/bin/bash

set -e

ORG=galleyltd
BACKEND_IMAGE=boost-detector-backend
BACKEND_IMAGE_VERSIONED=$BACKEND_IMAGE:$TRAVIS_BUILD_NUMBER-$TRAVIS_COMMIT

docker build -t $ORG/$BACKEND_IMAGE_VERSIONED .
docker tag $ORG/$BACKEND_IMAGE_VERSIONED $ORG/$BACKEND_IMAGE:latest

echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker push $ORG/$BACKEND_IMAGE

az login --service-principal --username "$AZURE_USERNAME" --password "$AZURE_PASSWORD" --tenant "$AZURE_TENANT"
sudo az aks install-cli
az aks get-credentials --resource-group "$AZURE_RESOURCEGROUPNAME" --name "$AZURE_KUBERNETESCLUSTERNAME"

kubectl set image deployment boost-detector-backend $BACKEND_IMAGE=$ORG/$BACKEND_IMAGE_VERSIONED
