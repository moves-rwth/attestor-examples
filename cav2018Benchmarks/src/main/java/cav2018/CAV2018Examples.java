package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

/**
 * Collection of benchmarks to be executed.
 *
 * Every method tagged with @Benchmark requires a settings file with the same name in configuration/settings/.
 * For instance, method foo() executes the benchmark specified by configuration/settings/foo.json.
 *
 * Every benchmark may be additionally tagged with expected results, e.g. the expected total number of states,
 * model-checking results, etc. If executing a benchmark leads to different results, an error is raised.
 */
public class CAV2018Examples {

    @Benchmark
    public void lindstromTreeTraversal_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(229)
                .expectMainProcedureStates(223)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void lindstromTreeTraversal_S(){
        BenchmarkHelper.builder()
                .expectTotalStates(229)
                .expectMainProcedureStates(223)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void lindstromTreeTraversal_V(){
        BenchmarkHelper.builder()
                .expectTotalStates(2583)
                .expectMainProcedureStates(2577)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void lindstromTreeTraversal_N(){
        BenchmarkHelper.builder()
                .expectTotalStates(67941)
                .expectMainProcedureStates(67935)
                .expectFinalStates(10)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void lindstromTreeTraversal_C(){
        BenchmarkHelper.builder()
                .expectTotalStates(229)
                .expectMainProcedureStates(223)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }


/*
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





    */
}
