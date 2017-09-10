package refdll;

import de.rwth.i2.attestor.main.Attestor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BenchmarkHelper {

    public static void run() {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        Attestor attestor = new Attestor();
        attestor.run(new String[]{
                "-sf",
                "configuration/settings/" + methodName + ".json",
                "-rp",
                "."
        });
    }


    public static void run(int expectedTotalStates, int expectedProcedureStates, int expectedFinalStates) {

        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        Attestor attestor = new Attestor();
        attestor.run(new String[]{
                "-sf",
                "configuration/settings/" + methodName + ".json",
                "-rp",
                "."
        });
        assert(attestor.getTotalNumberOfStates() == expectedTotalStates);
        assert(attestor.getNumberOfStatesWithoutProcedureCalls() == expectedProcedureStates);
        assert(attestor.getNumberOfFinalStates() == expectedFinalStates);
    }
}
