#!/bin/bash

# temporary file to collect all results
cd $1
mvn clean install exec:exec@benchmark > /dev/null
cat jmh-result.text
mvn clean install exec:exec@run
cd ..
