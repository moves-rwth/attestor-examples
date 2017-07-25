# attestor-examples
A collection of examples and benchmarks for attestor.

## Running all examples

There is a prepared shell script to run all existing benchmarks:

    $ ./run-all.sh

Alternatively, every set of examples is provided as a standalone maven project
that can be installed and executed as follows:

    $ mvn clean install exec:exec@run

Further detail are provided in the README file of the respective example project.

## Creating new benchmarks

There is a maven archetype to create a maven project with a small running example configuration.
First install the archetype (in directory archetype) in your local repository using `mvn install`.
After that a new example can be created by running the following:

    mvn archetype:generate \
        -DarchetypeGroupId=de.rwth.i2.attestor.examples \
        -DarchetypeVersion=0.2 \
        -DarchetypeArtifactId=benchmark \

Maven will ask for a few project related information, such as project name and 
package.



