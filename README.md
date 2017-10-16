# attestor-examples

This branch contains the Maven archetype to create new [Attestor][1] benchmark projects.

## System Requirements

The following software has to be installed prior to the installation of Attestor:

- [Java JDK 1.8][3]
- [Apache Maven][4]
- (Windows) Since Attestor uses [soot][13], please make sure that rt.jar is in your CLASSPATH.

## Creating new benchmarks

There is a maven archetype to create a maven project with a small running example configuration.
First, you have to install the archetype in your local repository:

    $ git clone git@github.com:moves-rwth/attestor-examples.git
    (cd to cloned repository)
    $ git checkout archetype
    $ cd archetype
    $ mvn install

After that a new example can be created by running the following (outside of any other directory that is part of a maven project):

    mvn archetype:generate \
        -DarchetypeGroupId=de.rwth.i2.attestor.examples \
        -DarchetypeVersion=0.4 \
        -DarchetypeArtifactId=benchmark

Alternatively, there is a shell script new_benchmark.sh containing this command.
Maven will ask for a few project related information, such as project name and 
package.
The newly created project can be executed as follows:

    (cd into project directory)
    $ mvn clean install exec:exec@run

## Structure of example projects

All project related settings of example projects derived from the archetype are contained in "configuration":

- configuration/code contains the Java programs that should be analyzed.
- configuration/grammar contains the graph grammars that are used for analysis.
- configuration/inputs contains the initial heap configurations.
- configuration/settings contains the settings files that determine each individual analysis.

Furthermore, "src/..." contains a java file that sets up the Benchmark.
An example is given below:

    package de.rwth.i2.attestor.examples;

    import avltree.BenchmarkHelper;
    import org.openjdk.jmh.annotations.Benchmark;
    import de.rwth.i2.attestor.main.Attestor;

    public class AVLTree {

        @Benchmark
        public void binary_search() {
            BenchmarkHelper.run();
        }
    }

In this example, we analyze a binary search method of an AVLTree.
The BenchmarkHelper class (that is installed automatically through maven) takes care of the setup as long as the name
of the benchmark *coincides exactly with one of the settings files in configuration/settings*.
Thus, in this case, there has to be a file

    configuration/settings/binary_search.json

that specifies the analysis that should be performed.
Further details regarding settings files are found in the [Attestor wiki][2].

[1]: https://github.com/moves-rwth/attestor
[2]: https://github.com/moves-rwth/attestor/wiki/Settings-file
