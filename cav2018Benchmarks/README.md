Benchmarks for CAV 2018 Submission
==================================

This is a collection of examples accompanying a tool paper submission to CAV 2018 based on the JMH benchmark framework.

## Running examples

This directory contains three prepared shell scripts to run all examples.
Each of these scripts will create a logfile `benchmark-results/log` and a PDF file with a table summarizing all results.
This table is found at `benchmark-results/results.pdf`.

To execute all benchmarks once, use the following shell script:

    $ ./run.sh

To fully rebuild Attestor and all benchmarks and run all benchmarks afterwards, use the following shell script:

    $ ./build-and-run.sh
   
Since Attestor is using Apache maven, please note that a full rebuild might require an active internet connection 
in order to download all dependencies, such as soot.

Finally, it is possible to measure the average runtime for all benchmarks by invoking the following shell script:

    $ ./jmh-average.sh

Please note that `jmh-average.sh` will take a lot of time to finish, because every example is executed multiple times.


## Structure of benchmarks

A definition of all benchmarks to be executed is found in

    src/main/java/cav2018/CAV2018Examples.java

Every method in this file specifies a single benchmark (using the JMH framework).
The name of the method must coincide with a corresponding settings file found in

    configuration/settings

Every settings file specifies the actual benchmark. This includes:

1. The analyzed source code, which is usually found in `configuration/code`.
2. The LTL specification verified by the tool.
3. The graph grammars used to guide abstraction. User-specified graph-grammars are found in `configuration/grammar`.
4. The initial heap in case the input is not supposed to be empty, e.g. when analyzing a procedure with parameters. These heaps are found in `configuration/inputs`
6. A description of the benchmark and verified properties (see `name`, `scenario`, and `specificationDescription`).
7. Command-line options, such as the maximal number of states until the tool aborts state space generation.
8. The relevant paths to export a generated state space for the graphical user interface.

For example, the benchmark method `lindstromTraverse` executes the benchmark described in the file

    configuration/settings/lindstromTraverse.json

Every benchmark may additionally specify expected outcomes, e.g. whether provided specifications are expected to be satisfied or not.


