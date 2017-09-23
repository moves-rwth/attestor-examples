package de.rwth.i2.attestor.examples;

import refdll.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefDLL {

    @Benchmark
    public void traverse() {
        BenchmarkHelper.run( 44, 44, 2 );
    }
    
      @Benchmark
    public void buildList() {
        BenchmarkHelper.run( 96, 44, 4 );
    }
    
    @Benchmark
    public void buildAndTraverse(){
        BenchmarkHelper.run( 213, 12, 3  );
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
	public void MC_Reach_reverseWithInitialList(){
		BenchmarkHelper.run();
	}
	
	@Benchmark
	public void MC_Shape_reverseWithInitialList(){
		BenchmarkHelper.run();
	}
    
}
