
package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class ForesterSLL {

    @Benchmark
    public void sll_rev(){
        BenchmarkHelper.builder()
                .expectFinalStates(1)
                .build()
                .run();
    }

}
