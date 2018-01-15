
package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class BinaryTree {

    @Benchmark
    public void lindstrom_m(){
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void lindstrom_v(){
        BenchmarkHelper.builder()
                .expectTotalStates(2583)
                .expectMainProcedureStates(2577)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void lindstrom_s(){
        BenchmarkHelper.builder()
                .expectTotalStates(229)
                .expectMainProcedureStates(223)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void lindstrom_c(){
        BenchmarkHelper.builder()
                .expectTotalStates(229)
                .expectMainProcedureStates(223)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void lindstrom_n(){
        BenchmarkHelper.builder()
                .expectTotalStates(30911)
                .expectMainProcedureStates(30905)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }
}
