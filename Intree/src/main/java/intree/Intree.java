package de.rwth.i2.attestor.examples;

import jmhBenchmarkHelper.BenchmarkHelper;
import org.openjdk.jmh.annotations.Benchmark;
import de.rwth.i2.attestor.main.Attestor;

public class Intree {
	
	@Benchmark
	public void find(){
		BenchmarkHelper.run();
	}

}
