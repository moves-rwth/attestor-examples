
package de.rwth.i2.attestorExamples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class ForesterTree {

    @Benchmark
    public void tree_constructor() {
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void tree_dsw() {
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }

}
