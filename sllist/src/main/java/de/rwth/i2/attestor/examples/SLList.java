package de.rwth.i2.attestor.examples;

import sllist.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class SLList {

    @Benchmark
    public void main() {
        BenchmarkHelper.run();
        BenchmarkHelper.run( 77,47,1 );
    }
}
