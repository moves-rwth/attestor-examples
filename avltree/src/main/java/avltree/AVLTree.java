package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

import java.util.List;

import static java.lang.Thread.currentThread;

public class AVLTree {

    @Benchmark
    public void binary_search() {
        BenchmarkHelper.run(192, 192, 6);
    }

    @Benchmark
    public void binary_search_and_back() {
        BenchmarkHelper.run( 455, 11, 1);
    }

    @Benchmark
    public void binary_search_and_swap_subtrees() {
        BenchmarkHelper.run( 449, 107, 1);
    }
    
    @Benchmark
    public void left_rotate() {
        BenchmarkHelper.run( 179, 179, 1 );
    }
    
    @Benchmark
    public void left_right_rotate() {
        BenchmarkHelper.run( 1077, 64, 1);
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
        BenchmarkHelper.run( 220, 220, 14 );
    }
    
    @Benchmark
    public void max_value() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void rebalance() {
        BenchmarkHelper.run(3509,397,2);
    }
    @Benchmark
    public void insert() {
        BenchmarkHelper.run(23511,1323,2);
    }
    @Benchmark
    public void list_to_avl() {
        BenchmarkHelper.run(34280,140,3);
    }
}
