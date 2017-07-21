package de.rwth.i2.attestor.examples;

import avltree.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

import java.util.List;

import static java.lang.Thread.currentThread;

public class AVLTree {

    @Benchmark
    public void binary_search() {
        BenchmarkHelper.run();
    }

    @Benchmark
    public void binary_search_and_back() {
        BenchmarkHelper.run();
    }

    @Benchmark
    public void binary_search_and_swap_subtrees() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void insert() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void left_rotate() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void left_right_rotate() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void right_rotate() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void right_left_rotate() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void min_value() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void max_value() {
        BenchmarkHelper.run();
    }
}
