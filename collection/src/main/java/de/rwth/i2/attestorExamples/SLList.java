package de.rwth.i2.attestorExamples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

/**
 * Simple singly-linked list using a user-specified graph grammar.
 *
 */
public class SLList {
    @Benchmark
    public void reverseSLList() {
        BenchmarkHelper.builder()
                .expectTotalStates(90)
                .expectMainProcedureStates(47)
                .expectFinalStates(1)
                .build()
                .run();
    }
}
