package de.rwth.i2.attestorExamples;

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
    public void faultyReverse1_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(41)
                .expectMainProcedureStates(41)
                .expectFinalStates(1)
				.expectNoCounterexamples(1)
                .build()
                .run();
    }
    
    @Benchmark
    public void faultyReverse2_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(23)
                .expectMainProcedureStates(23)
                .expectFinalStates(1)
				.expectNoCounterexamples(1)
                .build()
                .run();
    }
    
    @Benchmark
    public void faultyReverse3_S() {
        BenchmarkHelper.builder()
                .expectTotalStates(36)
                .expectMainProcedureStates(36)
                .expectFinalStates(1)
				.expectNoCounterexamples(1)
                .build()
                .run();
    }


    @Benchmark
    public void buildList() {
          BenchmarkHelper.builder()
                  .expectTotalStates(65)
                  .expectMainProcedureStates(33)
                  .expectFinalStates(2)
                  .build()
                  .run();
    }
    
    @Benchmark
    public void buildAndTraverse(){
        BenchmarkHelper.builder()
                .expectTotalStates(119)
                .expectMainProcedureStates(6)
                .expectFinalStates(1)
                .build()
                .run();
    }

	@Benchmark
	public void MC_Completeness_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(305)
				.expectMainProcedureStates(305)
				.expectFinalStates(5)
				.expectLTLResults(true)
				.build()
				.run();
	}

	@Benchmark
	public void MC_NeighbourhoodPreservance_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(820)
				.expectMainProcedureStates(820)
				.expectFinalStates(15)
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
				.expectTotalStates(569)
				.expectMainProcedureStates(569)
				.expectFinalStates(5)
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_NeighbourhoodPreservance_reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(1508)
				.expectMainProcedureStates(1508)
				.expectFinalStates(15)
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
