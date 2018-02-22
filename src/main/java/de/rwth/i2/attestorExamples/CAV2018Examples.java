package de.rwth.i2.attestorExamples;

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
                .expectTotalStates(13)
                .expectMainProcedureStates(13)
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
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void findMiddleSLL_V(){
        BenchmarkHelper.builder()
                .expectTotalStates(380)
                .expectMainProcedureStates(380)
                .expectFinalStates(4)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void findMiddleSLL_N(){
        BenchmarkHelper.builder()
                .expectTotalStates(456)
                .expectMainProcedureStates(456)
                .expectFinalStates(8)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void findMiddleSLL_R(){
        BenchmarkHelper.builder()
                .expectTotalStates(89)
                .expectMainProcedureStates(89)
                .expectFinalStates(2)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void recursiveBuildAndTraverseTree_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(714)
                .expectMainProcedureStates(6)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void recursiveBuildAndTraverseTree_S(){
        BenchmarkHelper.builder()
                .expectTotalStates(714)
                .expectMainProcedureStates(6)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void recursiveTraverseTree_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(91)
                .expectMainProcedureStates(19)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void recursiveTraverseTree_S(){
        BenchmarkHelper.builder()
                .expectTotalStates(91)
                .expectMainProcedureStates(19)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void recursiveTraverseTree_N(){
        BenchmarkHelper.builder()
                .expectTotalStates(21738)
                .expectMainProcedureStates(546)
                .expectFinalStates(6)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void buildAndTraverseListOfCyclicLists_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(313)
                .expectMainProcedureStates(296)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildAndReverseDLL_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(277)
                .expectMainProcedureStates(271)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildAndInsertDLL_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(379)
                .expectMainProcedureStates(373)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildAndInsertsortDLL1_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(4302)
                .expectMainProcedureStates(4296)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildAndInsertsortDLL2_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(1332)
                .expectMainProcedureStates(1326)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildCyclicDLL_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(104)
                .expectMainProcedureStates(98)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildAndBubbleSortSLL_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(287)
                .expectMainProcedureStates(280)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildAndDeleteElementSLL_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(152)
                .expectMainProcedureStates(145)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildSLLWithHeadPtr_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(111)
                .expectMainProcedureStates(105)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildAndInsertsortSLL_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(369)
                .expectMainProcedureStates(362)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void DSWTree_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(1334)
                .expectMainProcedureStates(1328)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void constructTree_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(44)
                .expectMainProcedureStates(38)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void faultyReverseDLL_CX(){
        BenchmarkHelper.builder()
                .expectTotalStates(81)
                .expectMainProcedureStates(7)
                .expectFinalStates(2)
                .expectLTLResults(false)
                .expectNoCounterexamples(1)
                .build()
                .run();
    }

    @Benchmark
    public void findLastDLL_CY(){
        BenchmarkHelper.builder()
                .expectTotalStates(44)
                .expectMainProcedureStates(44)
                .expectFinalStates(1)
                .expectLTLResults(false)
                .expectNoCounterexamples(0)
                .build()
                .run();
    }

    @Benchmark
    public void reverseDLL_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(70)
                .expectMainProcedureStates(70)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void reverseDLL_S(){
        BenchmarkHelper.builder()
                .expectTotalStates(70)
                .expectMainProcedureStates(70)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }


    @Benchmark
    public void reverseDLL_CX(){
        BenchmarkHelper.builder()
                .expectTotalStates(70)
                .expectMainProcedureStates(70)
                .expectFinalStates(1)
                .expectLTLResults(false)
                .expectNoCounterexamples(1)
                .build()
                .run();
    }


    @Benchmark
    public void reverseDLL_R(){
        BenchmarkHelper.builder()
                .expectTotalStates(113)
                .expectMainProcedureStates(113)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void reverseDLL_V(){
        BenchmarkHelper.builder()
                .expectTotalStates(569)
                .expectMainProcedureStates(569)
                .expectFinalStates(5)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void reverseDLL_NX(){
        BenchmarkHelper.builder()
                .expectTotalStates(1508)
                .expectMainProcedureStates(1508)
                .expectFinalStates(15)
                .expectLTLResults(false)
                .expectNoCounterexamples(1)
                .build()
                .run();
    }

    @Benchmark
    public void traverseDLL_S(){
        BenchmarkHelper.builder()
                .expectTotalStates(38)
                .expectMainProcedureStates(38)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void skipList_buildList_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(330)
                .expectMainProcedureStates(10)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void skipList_insert_M(){
        BenchmarkHelper.builder()
                .expectTotalStates(302)
                .expectMainProcedureStates(294)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void findMiddleSLL_VX(){
        BenchmarkHelper.builder()
                .expectTotalStates(380)
                .expectMainProcedureStates(380)
                .expectLTLResults(false)
                .expectNoCounterexamples(1)
                .build()
                .run();
    }

    @Benchmark
    public void findMiddleSLL_RX(){
        BenchmarkHelper.builder()
                .expectTotalStates(52)
                .expectMainProcedureStates(52)
                .expectLTLResults(false)
                .expectNoCounterexamples(1)
                .build()
                .run();
    }

    @Benchmark
    public void reverseDLL_SX(){
        BenchmarkHelper.builder()
                .expectTotalStates(36)
                .expectMainProcedureStates(36)
                .expectFinalStates(1)
                .expectLTLResults(false)
                .expectNoCounterexamples(1)
                .build()
                .run();
    }

    @Benchmark
    public void traverseSLL_X(){
        BenchmarkHelper.builder()
                .expectTotalStates(22)
                .expectMainProcedureStates(22)
                .expectFinalStates(1)
                .expectLTLResults(false)
                .expectNoCounterexamples(1)
                .build()
                .run();
    }
}
