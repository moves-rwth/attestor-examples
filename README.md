# attestor-examples
A collection of examples and benchmarks for [Attestor](https://github.com/moves-rwth/attestor).

## Running all examples

There is a prepared shell script to run all existing benchmarks:

    $ ./run-all.sh

Alternatively, every set of examples is provided as a standalone maven project
that can be installed and executed as follows:

    (cd to example directory)
    $ mvn clean install exec:exec@run

Further details are provided in the README file of the respective example project.

## Creating new example projects

There a maven archetype to create minimal working example projects.
Details are found [here](https://github.com/moves-rwth/attestor-examples/tree/archetype).
