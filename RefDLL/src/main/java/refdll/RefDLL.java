package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefDLL {

    @Benchmark
    public void traverse() {
        BenchmarkHelper.builder()
                .build()
                .run();
    }

    @Benchmark
    public void buildList() {
          BenchmarkHelper.builder()
                  .build()
                  .run();
    }
    
    @Benchmark
    public void buildAndTraverse(){
        BenchmarkHelper.builder()
                .build()
                .run();
    }

	@Benchmark
	public void MC_Completeness_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectLTLResults(true)
				.build()
				.run();
	}

	@Benchmark
	public void MC_NeighbourhoodPreservance_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Reach_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Shape_traverseWithInitialList(){

		BenchmarkHelper.builder()
				.expectLTLResults(true)
				.build()
				.run();
	}

	@Benchmark
	public void MC_Completeness_reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_NeighbourhoodPreservance_reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectNoCounterexamples(1)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Reach_reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Shape_reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectLTLResults(true)
				.build()
				.run();
	}

	@Benchmark
	public void CEG_reverse_final_pos() {
		BenchmarkHelper.builder()
				.expectLTLResults(false)
				.expectNoCounterexamples(1)
				.build()
				.run();
	}

	@Benchmark
	public void CEG_traverse_inverse_final_pos() {
		BenchmarkHelper.builder()
				.expectLTLResults(false)
				.expectNoCounterexamples(1)
				.build()
				.run();
	}

	@Benchmark
	public void CEG_walkAround_return() {
		BenchmarkHelper.builder()
				.expectLTLResults(false)
				.expectNoCounterexamples(1)
				.build()
				.run();
	}

	@Benchmark
	public void CEG_dummyReverse() {
		BenchmarkHelper.builder()
				.expectLTLResults(false)
				.expectNoCounterexamples(1)
				.build()
				.run();
	}

	@Benchmark
	public void CEG_dummyWalkAround() {
		BenchmarkHelper.builder()
				.expectLTLResults(false)
				.expectNoCounterexamples(1)
				.build()
				.run();
	}

	@Benchmark
	public void CEG_findLast_spurious() {
		BenchmarkHelper.builder()
				.expectLTLResults(false)
				.expectNoCounterexamples(0)
				.build()
				.run();
	}
}
