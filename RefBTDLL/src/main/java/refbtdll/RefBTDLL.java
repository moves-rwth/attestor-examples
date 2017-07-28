package de.rwth.i2.attestor.examples;

import refbtdll.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefBTDLL {

    @Benchmark
    public void getLeftBT() {
        BenchmarkHelper.run();
    }
}
