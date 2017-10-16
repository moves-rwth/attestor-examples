package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class BiMap {

    @Benchmark
    public void search() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void search_S() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void search_C() {
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
    public void insert_C() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void delete() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void delete_S() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void delete_C() {
        BenchmarkHelper.run();
    }

}
