package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
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
    public void binary_search_C() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void binary_search_S() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void binary_search_S_final() {
        BenchmarkHelper.run();
    }

    @Benchmark
    public void search_and_back() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void search_and_back_S() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void search_and_back_C() {
        BenchmarkHelper.run();
    }

    @Benchmark
    public void search_and_swap() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void search_and_swap_S() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void search_and_swap_C() {
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
    public void min_value_S_final() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void min_value_S() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void min_value_C() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void max_value() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void rebalance() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void rebalance_S() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void rebalance_C() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void insert() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void insert_S() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void list_to_avl() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void list_to_avl_C() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void list_to_avl_S() {
        BenchmarkHelper.run();
    }
}
