Attestor Examples: Lindstrom Tree Traversal
===========================================

This is a small collection of attestor examples using predefined binary trees.


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


## File structure

The individual benchmarks of this collection are located in

    src/main/java/BinaryTree.java.

Each benchmark is represented by a method that is named after the corresponding settings file in

    configuration/settings.

The analyzed source code is found in

    configuration/code.

Definitions of non-empty procedure inputs are placed in

    configuration/inputs.

Finally, grammars and selector renamings (in case predefined grammars are used) are put into

    configuration/grammar.


