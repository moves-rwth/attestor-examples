package de.rwth.i2.attestor.examples;

import refdll.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefDLL {

    @Benchmark
    public void traverse() {
        BenchmarkHelper.run( 74, 74, 3 );
    }
    
      @Benchmark
    public void buildList() {
        BenchmarkHelper.run( 96, 44, 4 );
    }
    
    @Benchmark
    public void buildAndTraverse(){
        BenchmarkHelper.run( 335, 14, 4  );
    }
    
}
