package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefBT {

    @Benchmark
    public void getLeft() {
        BenchmarkHelper.run(10,10,2);
    }

    @Benchmark
    public void getLeftmostChild() {
        BenchmarkHelper.run(21,21,1);
    }

    @Benchmark
    public void lindstromTraverse(){
        BenchmarkHelper.run(229,223,1);
    }

    @Benchmark
    public void lindstromTraverse_visited(){
        BenchmarkHelper.run(2583,2577,1);
    }
	
    @Benchmark
    public void lindstromTraverse_shape(){
        BenchmarkHelper.run(229,223,1);
    }	

    @Benchmark
    public void lindstromTraverse_terminateAtSen(){
        BenchmarkHelper.run(229,223,1);
    }

    @Benchmark
    public void lindstromTraverse_neighbourhood(){
        BenchmarkHelper.run(30607,30601,1);
    }
}
