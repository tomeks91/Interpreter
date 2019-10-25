import com.google.common.collect.ImmutableMap;

import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Interpreter.Expr expr = Interpreter.parse("w x z - +");
        Map<String, Integer> context = ImmutableMap.of("w", 5, "x", 10, "z", 42);
        int result = expr.interpret(context);
        System.out.println(result);    // -27
    }
}
