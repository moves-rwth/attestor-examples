package refsll;

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
                "configuration/settings/" + methodName + ".json"
        });
    }
}
