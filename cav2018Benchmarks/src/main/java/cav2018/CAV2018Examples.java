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

    @Benchmark
    public void binarySearchAVLTree_M() {
        BenchmarkHelper.builder()
                .expectTotalStates(192)
                .expectMainProcedureStates(192)
                .expectFinalStates(6)
                .build()
                .run();
    }

    @Benchmark
    public void binarySearchAVLTree_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(192)
                .expectMainProcedureStates(192)
                .expectFinalStates(6)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void leftMostInsertAVLTree_M() {
        BenchmarkHelper.builder()
                .expectTotalStates(6120)
                .expectMainProcedureStates(444)
                .expectFinalStates(4)
                .build()
                .run();
    }

    @Benchmark
    public void leftMostInsertAVLTree_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(6120)
                .expectMainProcedureStates(444)
                .expectFinalStates(4)
                .build()
                .run();
    }

    @Benchmark
    public void insertAVLTree_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(10388)
                .expectMainProcedureStates(1323)
                .expectFinalStates(2)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void insertAVLTree_M() {
        BenchmarkHelper.builder()
                .expectTotalStates(10388)
                .expectMainProcedureStates(1323)
                .expectFinalStates(2)
                .build()
                .run();
    }

    @Benchmark
    public void sllToAVLTree_M() {
        BenchmarkHelper.builder()
                .expectTotalStates(7166)
                .expectMainProcedureStates(139)
                .expectFinalStates(2)
                .build()
                .run();
    }

    @Benchmark
    public void sllToAVLTree_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(7166)
                .expectMainProcedureStates(139)
                .expectFinalStates(2)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void sllToAVLTree_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(7166)
                .expectMainProcedureStates(139)
                .expectFinalStates(2)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void searchAndBackAVLTree_M() {
        BenchmarkHelper.builder()
                .expectTotalStates(455)
                .expectMainProcedureStates(11)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void searchAndBackAVLTree_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(455)
                .expectMainProcedureStates(11)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void searchAndBackAVLTree_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(455)
                .expectMainProcedureStates(11)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void searchAndSwapAVLTree_M() {
        BenchmarkHelper.builder()
                .expectTotalStates(3855)
                .expectMainProcedureStates(920)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void searchAndSwapAVLTree_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(3855)
                .expectMainProcedureStates(920)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void searchAndSwapAVLTree_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(4104)
                .expectMainProcedureStates(907)
                .expectFinalStates(7)
                .expectLTLResults(true)
                .build()
                .run();
    }

/*
    @Benchmark
    public void left_rotate() {
        BenchmarkHelper.builder()
                .expectTotalStates(190)
                .expectMainProcedureStates(190)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void left_right_rotate() {
        BenchmarkHelper.builder()
                .expectTotalStates(1132)
                .expectMainProcedureStates(64)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void right_rotate() {
        BenchmarkHelper.builder()
                .build()
                .run();
    }

    @Benchmark
    public void right_left_rotate() {
        BenchmarkHelper.builder()
                .build()
                .run();
    }

    @Benchmark
    public void min_value() {
        BenchmarkHelper.builder()
                .expectTotalStates(220)
                .expectMainProcedureStates(220)
                .expectFinalStates(14)
                .build()
                .run();
    }

    @Benchmark
    public void min_value_S_final() {
        BenchmarkHelper.builder()
                .expectTotalStates(220)
                .expectMainProcedureStates(220)
                .expectFinalStates(14)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void min_value_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(220)
                .expectMainProcedureStates(220)
                .expectFinalStates(14)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void min_value_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(220)
                .expectMainProcedureStates(220)
                .expectFinalStates(14)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void max_value() {
        BenchmarkHelper.builder()
                .build()
                .run();
    }

    @Benchmark
    public void rebalance() {
        BenchmarkHelper.builder()
                .expectTotalStates(3644)
                .expectMainProcedureStates(402)
                .expectFinalStates(2)
                .build()
                .run();
    }

    @Benchmark
    public void rebalance_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(3644)
                .expectMainProcedureStates(402)
                .expectFinalStates(2)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void rebalance_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(3644)
                .expectMainProcedureStates(402)
                .expectFinalStates(2)
                .expectLTLResults(true)
                .build()
                .run();
    }






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
