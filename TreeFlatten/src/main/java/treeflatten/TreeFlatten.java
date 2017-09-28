package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class TreeFlatten {

    @Benchmark
    public void push(){
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void pushTree(){
        BenchmarkHelper.run();
    }

    @Benchmark
    public void flatten() {
        BenchmarkHelper.run();
    }
}
