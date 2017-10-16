package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
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

    @Benchmark
    public void lindstromTraverse(){
        BenchmarkHelper.run();
    }

    @Benchmark
    public void lindstromTraverse_visited(){
        BenchmarkHelper.run();
    }
	
    @Benchmark
    public void lindstromTraverse_shape(){
        BenchmarkHelper.run();
    }	

    @Benchmark
    public void lindstromTraverse_terminateAtSen(){
        BenchmarkHelper.run();
    }

    @Benchmark
    public void lindstromTraverse_neighbourhood(){
        BenchmarkHelper.run();
    }
}
