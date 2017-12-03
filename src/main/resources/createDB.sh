#!/usr/bin/env bash
docker run -e POSTGRES_DB=sampleDB -e POSTGRES_USER=sampleDB -e POSTGRES_PASSWORD=sampleDB -p 5432:5432 --name sampleDB -d postgres:9.6.5