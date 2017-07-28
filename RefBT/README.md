Attestor Benchmark
==================


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
