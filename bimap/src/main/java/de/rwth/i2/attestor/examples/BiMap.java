package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class BiMap {

    @Benchmark
    public void search() {
        BenchmarkHelper.run(98,98,5);
    }
    
    @Benchmark
    public void search_S() {
        BenchmarkHelper.run(98,98,5);
    }
    
    @Benchmark
    public void search_C() {
        BenchmarkHelper.run(98,98,5);
    }
    
    @Benchmark
    public void insert() {
        BenchmarkHelper.run(83,59,1);
    }
    
    @Benchmark
    public void insert_S() {
        BenchmarkHelper.run(83,59,1);
    }
    
    @Benchmark
    public void insert_C() {
        BenchmarkHelper.run(83,59,1);
    }
    
    @Benchmark
    public void delete() {
        BenchmarkHelper.run(); // 211,88,6 depending on java compiler;
    }
    
    @Benchmark
    public void delete_S() {
        BenchmarkHelper.run(); // 211,88,6 depending on java compiler;
    }
    
    @Benchmark
    public void delete_C() {
        BenchmarkHelper.run(); // 211,88,6 depending on java compiler;
    }

}
