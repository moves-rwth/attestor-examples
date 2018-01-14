package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefBT {

    @Benchmark
    public void getLeft() {
        BenchmarkHelper.builder()
                .expectTotalStates(10)
                .expectMainProcedureStates(10)
                .expectFinalStates(2)
                .build()
                .run();
    }

    @Benchmark
    public void getLeftmostChild() {
        BenchmarkHelper.builder()
                .expectTotalStates(21)
                .expectMainProcedureStates(21)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void lindstromTraverse(){
        BenchmarkHelper.builder()
                .expectTotalStates(229)
                .expectMainProcedureStates(223)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void lindstromTraverse_visited(){
        BenchmarkHelper.builder()
                .expectTotalStates(2583)
                .expectMainProcedureStates(2577)
                .expectFinalStates(1)
                .build()
                .run();
    }
	
    @Benchmark
    public void lindstromTraverse_shape(){
        BenchmarkHelper.builder()
                .expectTotalStates(229)
                .expectMainProcedureStates(223)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void lindstromTraverse_terminateAtSen(){
        BenchmarkHelper.builder()
                .expectTotalStates(229)
                .expectMainProcedureStates(223)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void lindstromTraverse_neighbourhood(){
        BenchmarkHelper.builder()
                .expectTotalStates(30911)
                .expectMainProcedureStates(30905)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }
}
