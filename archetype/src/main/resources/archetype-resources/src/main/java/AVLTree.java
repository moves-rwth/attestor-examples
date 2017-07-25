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
