package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefDLL {

    @Benchmark
    public void traverse() {
        BenchmarkHelper.run( 38, 38, 1 );
    }
    
      @Benchmark
    public void buildList() {
        BenchmarkHelper.run( 102, 48, 4 );
    }
    
    @Benchmark
    public void buildAndTraverse(){
        BenchmarkHelper.run( 214, 12, 3  );
    }
	
	@Benchmark
	public void MC_Completeness_traverseWithInitialList(){
		BenchmarkHelper.run();
	}
	
	@Benchmark
	public void MC_NeighbourhoodPreservance_traverseWithInitialList(){
		BenchmarkHelper.run();
	}
	
	@Benchmark
	public void MC_Reach_traverseWithInitialList(){
		BenchmarkHelper.run();
	}
	
	@Benchmark
	public void MC_Shape_traverseWithInitialList(){
		BenchmarkHelper.run();
	}
	
	@Benchmark
	public void MC_Completeness_reverseWithInitialList(){
		BenchmarkHelper.run();
	}
	
	@Benchmark
	public void MC_NeighbourhoodPreservance_reverseWithInitialList(){
		BenchmarkHelper.run();
	}
	
    @Benchmark
	public void MC_NeighbourhoodPreservance_reverseWithInitialList_GC(){
		BenchmarkHelper.run();
	}
	
	@Benchmark
	public void MC_Reach_reverseWithInitialList(){
		BenchmarkHelper.run();
	}
	
	@Benchmark
	public void MC_Shape_reverseWithInitialList(){
		BenchmarkHelper.run();
	}
    
}
