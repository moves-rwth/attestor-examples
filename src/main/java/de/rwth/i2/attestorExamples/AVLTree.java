package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

import java.util.List;

import static java.lang.Thread.currentThread;

public class AVLTree {

    @Benchmark
    public void binary_search() {
        BenchmarkHelper.builder()
                .expectTotalStates(192)
                .expectMainProcedureStates(192)
                .expectFinalStates(6)
                .build()
                .run();
    }
    
    @Benchmark
    public void binary_search_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(192)
                .expectMainProcedureStates(192)
                .expectFinalStates(6)
                .expectLTLResults(true)
                .build()
                .run();
    }
    
    @Benchmark
    public void binary_search_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(192)
                .expectMainProcedureStates(192)
                .expectFinalStates(6)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void binary_search_S_final() {
        BenchmarkHelper.builder()
                .expectTotalStates(192)
                .expectMainProcedureStates(192)
                .expectFinalStates(6)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void search_and_back() {
        BenchmarkHelper.builder()
                .expectTotalStates(455)
                .expectMainProcedureStates(11)
                .expectFinalStates(1)
                .build()
                .run();
    }
    
    @Benchmark
    public void search_and_back_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(455)
                .expectMainProcedureStates(11)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }
    
    @Benchmark
    public void search_and_back_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(455)
                .expectMainProcedureStates(11)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void search_and_swap() {
        BenchmarkHelper.builder()
                .expectTotalStates(3855)
                .expectMainProcedureStates(920)
                .expectFinalStates(1)
                .build()
                .run();
    }
    
    @Benchmark
    public void search_and_swap_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(3855)
                .expectMainProcedureStates(920)
                .expectFinalStates(1)
                .expectLTLResults(true)
                .build()
                .run();
    }
    
    @Benchmark
    public void search_and_swap_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(4104)
                .expectMainProcedureStates(907)
                .expectFinalStates(7)
                .expectLTLResults(true)
                .build()
                .run();
    }
    
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
    public void insert() {
        BenchmarkHelper.builder()
                .expectTotalStates(6120)
                .expectMainProcedureStates(444)
                .expectFinalStates(4)
                .build()
                .run();
    }
    
    @Benchmark
    public void insert_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(10386)
                .expectMainProcedureStates(1321)
                .expectFinalStates(2)
                .expectLTLResults(true)
                .build()
                .run();
    }

    @Benchmark
    public void list_to_avl() {
        BenchmarkHelper.builder()
                .expectTotalStates(7166)
                .expectMainProcedureStates(139)
                .expectFinalStates(2)
                .build()
                .run();
    }
    
    @Benchmark
    public void list_to_avl_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(7166)
                .expectMainProcedureStates(139)
                .expectFinalStates(2)
                .expectLTLResults(true)
                .build()
                .run();
    }
    
    @Benchmark
    public void list_to_avl_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(7166)
                .expectMainProcedureStates(139)
                .expectFinalStates(2)
                .expectLTLResults(true)
                .build()
                .run();
    }
}
