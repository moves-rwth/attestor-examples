package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class BiMap {

    @Benchmark
    public void search() {
        BenchmarkHelper.run(97,97,4);
    }
    
    @Benchmark
    public void search_S() {
        BenchmarkHelper.run(98,98,5);
    }
    
    @Benchmark
    public void search_C() {
        BenchmarkHelper.run(97,97,4);
    }
    
    @Benchmark
    public void insert() {
        BenchmarkHelper.run(71,59,1);
    }
    
    @Benchmark
    public void insert_S() {
        BenchmarkHelper.run(71,59,1);
    }
    
    @Benchmark
    public void insert_C() {
        BenchmarkHelper.run(71,59,1);
    }
    
    @Benchmark
    public void delete() {
        BenchmarkHelper.run(123,78,2);
    }
    
    @Benchmark
    public void delete_S() {
        BenchmarkHelper.run(123,78,2);
    }
    
    @Benchmark
    public void delete_C() {
        BenchmarkHelper.run(123,78,2);
    }

}
