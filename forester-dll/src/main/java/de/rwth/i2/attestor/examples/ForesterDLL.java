
package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class ForesterDLL {

    @Benchmark
    public void dll_rev(){
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void dll_insert(){
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void cdll(){
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void dll_insertsort1(){
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void dll_insertsort2(){
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }

}
