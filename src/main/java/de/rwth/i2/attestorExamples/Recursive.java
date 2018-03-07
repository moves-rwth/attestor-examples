
package de.rwth.i2.attestorExamples;

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
                .expectTotalStates(741)
                .expectMainProcedureStates(6)
                .build()
                .run();
    }

    
    @Benchmark
    public void sll_rec_zip() {
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .expectTotalStates(337)
                .expectMainProcedureStates(13)
                .build()
                .run();
    }

}
