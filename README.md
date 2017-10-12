# attestor-examples

This branch contains the Maven archetype for attestor examples.

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



