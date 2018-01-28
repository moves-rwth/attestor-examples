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

    @Benchmark
    public void buildAndReverseSLL_M() {
        BenchmarkHelper.builder()
                .expectTotalStates(92)
                .expectMainProcedureStates(48)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildAndReverseSLL_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(92)
                .expectMainProcedureStates(48)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildAndReverseSLL_R() {
        BenchmarkHelper.builder()
                .expectTotalStates(92)
                .expectMainProcedureStates(48)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void traverseSLL_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(23)
                .expectMainProcedureStates(23)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void traverseSLL_S(){
        BenchmarkHelper.builder()
                .expectTotalStates(23)
                .expectMainProcedureStates(23)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void traverseSLL_N(){
        BenchmarkHelper.builder()
                .expectTotalStates(97)
                .expectMainProcedureStates(97)
                .expectFinalStates(2)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void traverseSLL_R(){
        BenchmarkHelper.builder()
                .expectTotalStates(44)
                .expectMainProcedureStates(44)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void traverseSLL_V(){
        BenchmarkHelper.builder()
                .expectTotalStates(46)
                .expectMainProcedureStates(46)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }


    @Benchmark
    public void reverseSLL_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(46)
                .expectMainProcedureStates(46)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void reverseSLL_S(){
        BenchmarkHelper.builder()
                .expectTotalStates(46)
                .expectMainProcedureStates(46)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void reverseSLL_V(){
        BenchmarkHelper.builder()
                .expectTotalStates(169)
                .expectMainProcedureStates(169)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void reverseSLL_NX(){
        BenchmarkHelper.builder()
                .expectTotalStates(268)
                .expectMainProcedureStates(268)
                .expectFinalStates(4)
                .expectLTLResults(false)
                .expectNoCounterexamples(1)
                .build()
                .run();
    }

    @Benchmark
    public void reverseSLL_R(){
        BenchmarkHelper.builder()
                .expectTotalStates(76)
                .expectMainProcedureStates(76)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void recursiveReverseSLL_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(40)
                .expectMainProcedureStates(16)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void recursiveReverseSLL_S(){
        BenchmarkHelper.builder()
                .expectTotalStates(40)
                .expectMainProcedureStates(16)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void recursiveReverseSLL_VX(){
        BenchmarkHelper.builder()
                .expectTotalStates(148)
                .expectMainProcedureStates(31)
                .expectFinalStates(1)
                .expectLTLResults(false)
                .expectNoCounterexamples(1)
                .build()
                .run();
    }

    @Benchmark
    public void recursiveReverseSLL_NX(){
        BenchmarkHelper.builder()
                .expectTotalStates(823)
                .expectMainProcedureStates(104)
                .expectFinalStates(3)
                .expectLTLResults(false)
                .expectNoCounterexamples(1)
                .build()
                .run();
    }

    @Benchmark
    public void findMiddleSLL_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(75)
                .expectMainProcedureStates(75)
                .expectFinalStates(2)
                .build()
                .run();
    }

    @Benchmark
    public void findMiddleSLL_S(){
        BenchmarkHelper.builder()
                .expectTotalStates(98)
                .expectMainProcedureStates(98)
                .expectFinalStates(2)
                .build()
                .run();
    }

    @Benchmark
    public void findMiddleSLL_V(){
        BenchmarkHelper.builder()
                .expectTotalStates(380)
                .expectMainProcedureStates(380)
                .expectFinalStates(4)
                .build()
                .run();
    }

    @Benchmark
    public void findMiddleSLL_N(){
        BenchmarkHelper.builder()
                .expectTotalStates(456)
                .expectMainProcedureStates(456)
                .expectFinalStates(8)
                .build()
                .run();
    }

    @Benchmark
    public void findMiddleSLL_R(){
        BenchmarkHelper.builder()
                .expectTotalStates(89)
                .expectMainProcedureStates(89)
                .expectFinalStates(2)
                .build()
                .run();
    }

}
