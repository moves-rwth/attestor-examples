package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class BiMap {

    @Benchmark
    public void search() {
        BenchmarkHelper.builder()
                .expectTotalStates(97)
                .expectMainProcedureStates(97)
                .expectFinalStates(4)
                .build()
                .run();
    }
    
    @Benchmark
    public void search_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(98)
                .expectMainProcedureStates(98)
                .expectFinalStates(5)
                .build()
                .run();
    }
    
    @Benchmark
    public void search_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(97)
                .expectMainProcedureStates(97)
                .expectFinalStates(4)
                .build()
                .run();
    }
    
    @Benchmark
    public void insert() {
        BenchmarkHelper.builder()
                .expectTotalStates(71)
                .expectMainProcedureStates(59)
                .expectFinalStates(1)
                .build()
                .run();
    }
    
    @Benchmark
    public void insert_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(71)
                .expectMainProcedureStates(59)
                .expectFinalStates(1)
                .build()
                .run();
    }
    
    @Benchmark
    public void insert_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(71)
                .expectMainProcedureStates(59)
                .expectFinalStates(1)
                .build()
                .run();
    }
    
    @Benchmark
    public void delete() {
        BenchmarkHelper.builder()
                .expectTotalStates(123)
                .expectMainProcedureStates(78)
                .expectFinalStates(2)
                .build()
                .run();
    }
    
    @Benchmark
    public void delete_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(123)
                .expectMainProcedureStates(78)
                .expectFinalStates(2)
                .build()
                .run();
    }
    
    @Benchmark
    public void delete_C() {
        BenchmarkHelper.builder()
                .expectTotalStates(123)
                .expectMainProcedureStates(78)
                .expectFinalStates(2)
                .build()
                .run();
    }

}
