#!/bin/bash

# temporary file to collect all results
RESULTS=results.text

# stop execution on first fail
set -e

runTest() {
    cd $1
    mvn clean install exec:exec@run
    cat jmh-result.text >> ../$RESULTS
    cd ..
}  

rm $RESULTS

runTest sllist
runTest RefSLL
runTest RefDLL
runTest RefBTDLL
runTest RefBT
runTest bimap
runTest avltree

cat $RESULTS
