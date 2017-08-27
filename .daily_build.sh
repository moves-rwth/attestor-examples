#!/bin/bash

set -e

runTest() {
    cd $1
    mvn clean install exec:exec@run
    cd ..
}  

runTest sllist
runTest RefSLL
runTest RefDLL
runTest RefBTDLL
runTest RefBT
runTest bimap
runTest avltree
