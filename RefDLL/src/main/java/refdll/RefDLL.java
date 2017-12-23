package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefDLL {

    @Benchmark
    public void traverse() {
        BenchmarkHelper.builder()
                .expectTotalStates(38)
                .expectMainProcedureStates(38)
                .expectFinalStates(1)
                .build()
                .run();
    }

    @Benchmark
    public void buildList() {
          BenchmarkHelper.builder()
                  .expectTotalStates(66)
                  .expectMainProcedureStates(34)
                  .expectFinalStates(3)
                  .build()
                  .run();
    }
    
    @Benchmark
    public void buildAndTraverse(){
        BenchmarkHelper.builder()
                .expectTotalStates(127)
                .expectMainProcedureStates(7)
                .expectFinalStates(1)
                .build()
                .run();
    }

	@Benchmark
	public void MC_Completeness_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(361)
				.expectMainProcedureStates(361)
				.expectFinalStates(1)
				.expectLTLResults(true)
				.build()
				.run();
	}

	@Benchmark
	public void MC_NeighbourhoodPreservance_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(785)
				.expectMainProcedureStates(785)
				.expectFinalStates(1)
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Reach_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(53)
				.expectMainProcedureStates(53)
				.expectFinalStates(1)
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
				.expectTotalStates(677)
				.expectMainProcedureStates(677)
				.expectFinalStates(1)
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_NeighbourhoodPreservance_reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(1457)
				.expectMainProcedureStates(1457)
				.expectFinalStates(1)
				.expectNoCounterexamples(1)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Reach_reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(113)
				.expectMainProcedureStates(113)
				.expectFinalStates(1)
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
