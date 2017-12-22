package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class RefSLL {

    @Benchmark
    public void reverse() {
		BenchmarkHelper.builder()
				.expectTotalStates(90)
				.expectMainProcedureStates(47)
				.expectFinalStates(1)
				.build()
				.run();
    }
	
	@Benchmark
	public void reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(46)
				.expectMainProcedureStates(46)
				.expectFinalStates(1)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Completeness_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(46)
				.expectMainProcedureStates(46)
				.expectFinalStates(1)
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Completeness_traverseWithInitialListWithNullVisit(){
		BenchmarkHelper.builder()
				.expectTotalStates(161)
				.expectMainProcedureStates(161)
				.expectFinalStates(1)
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_NeighbourhoodPreservance_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(94)
				.expectMainProcedureStates(94)
				.expectFinalStates(1)
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Reach_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(44)
				.expectMainProcedureStates(44)
				.expectFinalStates(1)
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Shape_traverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(29)
				.expectMainProcedureStates(29)
				.expectFinalStates(1)
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Completeness_reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(169)
				.expectMainProcedureStates(169)
				.expectFinalStates(1)
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_NeighbourhoodPreservance_reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(247)
				.expectMainProcedureStates(247)
				.expectFinalStates(1)
				.expectLTLResults(false)
				.expectNoCounterexamples(1)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Reach_reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(76)
				.expectMainProcedureStates(76)
				.expectFinalStates(1)
				.expectLTLResults(true)
				.build()
				.run();
	}
	
	@Benchmark
	public void MC_Shape_reverseWithInitialList(){
		BenchmarkHelper.builder()
				.expectTotalStates(55)
				.expectMainProcedureStates(55)
				.expectFinalStates(1)
				.expectLTLResults(true)
				.build()
				.run();
	}

	@Benchmark
	public void CEG_reverse(){
		BenchmarkHelper.builder()
				.expectLTLResults(false)
				.expectNoCounterexamples(1)
				.build()
				.run();
	}
}
