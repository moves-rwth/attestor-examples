package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class SLList {
    @Benchmark
    public void main() {
        BenchmarkHelper.run( 90,47,1 );
    }
}
