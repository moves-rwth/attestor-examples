Attestor Examples: AVLTrees
============================

This collection of examples covers AVLTrees.

To run the examples execute the following maven statement within this directory:

    $ mvn clean install exec:exec@run.

Alternatively, there are two prepared shellscripts to build and execute all benchmarks.
For testing purposes, all benchmarks can be run once by executing

    $ ./benchmarks.sh

To obtain realisitic measurements, the full benchmark suite can be started by running

    $ ./full-benchmarks.sh
    (or)
    $ mvn clean install exec:exec@benchmark
