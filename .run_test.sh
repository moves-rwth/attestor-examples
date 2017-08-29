#!/bin/bash

# temporary file to collect all results
cd $1
mvn clean install exec:exec@benchmark
cd ..
