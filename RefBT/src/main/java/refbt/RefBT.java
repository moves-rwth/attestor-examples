package de.rwth.i2.attestor.examples;

import refbt.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefBT {

    @Benchmark
    public void getLeft() {
        BenchmarkHelper.run();
    }
    
    @Benchmark
    public void getLeftmostChild() {
        BenchmarkHelper.run();
    }
    
    
}
