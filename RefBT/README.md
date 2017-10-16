Attestor Examples: Binary Trees
===============================

This collection of benchmarks covers binary trees without parent pointers.
In particular, we consider the Lindstrom tree traversal algorithm and verify that the tree upon termination is the same as the original tree in the following sense:

1. It is a tree again.
2. Every node of the original tree has been visited by the program variable moving through the tree.
3. The neighbourhood, i.e., all successor elements of every node in the tree are the same as in the input tree.

To run the examples execute the following maven statement within this directory:

    $ mvn clean install exec:exec@run.

Alternatively, there are two prepared shellscripts to build and execute all benchmarks.
For testing purposes, all benchmarks can be run once by executing

    $ ./benchmarks.sh

To obtain realisitic measurements, the full benchmark suite can be started by running

    $ ./full-benchmarks.sh
    (or)
    $ mvn clean install exec:exec@benchmark
