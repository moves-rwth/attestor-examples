
package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class Recursive {

    @Benchmark
    public void sll_rec_traversal() {
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void sll_rec_build() {
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void tree_rec_traversal() {
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }


}
