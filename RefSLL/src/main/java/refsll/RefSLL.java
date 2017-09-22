package de.rwth.i2.attestor.examples;

import refsll.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefSLL {

    @Benchmark
    public void reverse() {
        BenchmarkHelper.run( 76, 46, 1 );
    }
	
	@Benchmark
	public void reverseWithInitialList(){
		BenchmarkHelper.run();
	}
	
	@Benchmark
	public void MC_Completeness_traverseWithInitialList(){
		BenchmarkHelper.run();
	}
	
	@Benchmark
	public void MC_Completeness_traverseWithInitialListWithNullVisit(){
		BenchmarkHelper.run();
	}
}
