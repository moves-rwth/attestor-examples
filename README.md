Attestor Benchmark Collection 
==================================

This is a collection of examples accompanying Attestor based on the JMH benchmark framework.

## Running Examples

Before running examples, please make sure that the benchmark project is installed by running the following command
from within this directory:

    mvn clean install 

To execute all benchmarks once, it then suffices to run

    mvn exec:exec@run
    
For a more accurate performance measurement, please use the following command instead:

    mvn exec:exec@benchmark
    
Since the last command runs every example multiple times, please note that a full performance measurement might
require a lot of time.

## Structure of Benchmarks

All benchmarks are defined in

    src/main/java/de/rwth/i2/attestorExamples

Every Java class in this directory represents one group of benchmarks.
Every method in one of these classes specifies a single benchmark (using the JMH framework).
The name of the method must coincide with a corresponding settings file found in

    CLASSNAME/configuration/settings

Here, `CLASSNAME` is the name of the Java class defining a group of examples.

Every settings file specifies the actual benchmark. This includes:

1. The analyzed source code, which is usually found in `CLASSNAME/configuration/code`.
2. The LTL specification verified by the tool.
3. The graph grammars used to guide abstraction. User-specified graph-grammars are found in
   `CLASSNAME/configuration/grammar`. For predefined grammars, such as binary trees, 
   this directory may also contain renaming classes to map node and edge labels to class names and member variables.
4. The initial heap in case the input is not supposed to be empty, e.g. when analyzing a procedure with parameters. 
   These heaps are found in `CLASSNAME/configuration/inputs`
6. A description of the benchmark and verified properties (see `name`, `scenario`, and `specificationDescription`).
7. Command-line options, such as the maximal number of states until the tool aborts state space generation.
8. The relevant paths to export a generated state space for the graphical user interface.

For example, the benchmark method `lindstromTraverse` executes the benchmark described in the file

    CAV2018Examples/configuration/settings/lindstromTraverse.json

Every benchmark may additionally specify expected outcomes, 
e.g. whether provided specifications are expected to be satisfied or not.


