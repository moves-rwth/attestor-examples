#!/bin/bash

set -e

# temporary file to collect all results
cd $1
mvn clean install exec:exec@run
cd ..
