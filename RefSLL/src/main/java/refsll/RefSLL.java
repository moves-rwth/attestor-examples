package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefSLL {

    @Benchmark
    public void reverse() {
        BenchmarkHelper.run( 90, 47, 1 );
    }
	
	@Benchmark
	public void reverseWithInitialList(){
		BenchmarkHelper.run(46,46,1);
	}
	
	@Benchmark
	public void MC_Completeness_traverseWithInitialList(){
		BenchmarkHelper.run(46,46,1);
	}
	
	@Benchmark
	public void MC_Completeness_traverseWithInitialListWithNullVisit(){
		BenchmarkHelper.run(209,209,1);
	}
	
	@Benchmark
	public void MC_NeighbourhoodPreservance_traverseWithInitialList(){
		BenchmarkHelper.run(116,116,1);
	}
	
	@Benchmark
	public void MC_Reach_traverseWithInitialList(){
		BenchmarkHelper.run(44,44,1);
	}
	
	@Benchmark
	public void MC_Shape_traverseWithInitialList(){
		BenchmarkHelper.run(29,29,1);
	}
	
	@Benchmark
	public void MC_Completeness_reverseWithInitialList(){
		BenchmarkHelper.run(169,169,1);
	}
	
	@Benchmark
	public void MC_NeighbourhoodPreservance_reverseWithInitialList(){
		BenchmarkHelper.run(295,295,1);
	}
	
	@Benchmark
	public void MC_Reach_reverseWithInitialList(){
		BenchmarkHelper.run(76,76,1);
	}
	
	@Benchmark
	public void MC_Shape_reverseWithInitialList(){
		BenchmarkHelper.run(55,55,1);
	}
}
