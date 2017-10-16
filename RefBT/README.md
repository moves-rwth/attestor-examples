Attestor Examples: Binary Trees
===============================

This collection of benchmarks covers binary trees without parent pointers.
In particular, we consider the Lindstrom tree traversal algorithm and verify that the tree upon termination is the same as the original tree in the following sense:

1. It is a tree again.
2. Every node of the original tree has been visited by the program variable moving through the tree.
3. The neighbourhood, i.e., all successor elements of every node in the tree are the same as in the input tree.

There are two prepared shellscripts to build and execute all benchmarks.
For testing purposes, all benchmarks can be run once by executing

    $ ./benchmarks.sh

To obtain realisitic measurements, the full benchmark suite can be started by running

    $ ./full-benchmarks.sh

In both cases, results will be saved to a file called jmh-result.text.
Alternatively, one can directly build and execute benchmarks from maven 
using the following instructions to run each example once or to run the full benchmark suite, respectively:

    $ mvn clean install exec:exec@run
    $ mvn clean install exec:exec@benchmark
