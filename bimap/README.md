Attestor Examples: Bidirectional Map
====================================

This is a small collection of attestor examples using bidriectional maps that are implemented as two doubly-linked lists of equal length.


## Running examples

You can run all examples once using a prepared shell script as follows:

    $ ./run.sh

Alternatively, exexute the following maven statement within this directory:

    $ mvn clean install exec:exec@run.


## Measuring performance

The full benchmark suite runs each example multiple times. It can be started using the following script:

    $ ./benchmarks.sh

Alternatively, you can use the following maven statement: 

    $ mvn clean install exec:exec@benchmark
