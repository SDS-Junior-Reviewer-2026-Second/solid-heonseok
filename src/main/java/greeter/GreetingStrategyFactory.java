package greeter;

import java.util.HashMap;
import java.util.Map;

public class GreetingStrategyFactory {
    private static final Map<String, GreetingStrategy> strategies = new HashMap<>();

    static {
        register("formal", new FormalGreeting());
        register("casual", new CasualGreeting());
        register("intimate", new IntimateGreeting());
    }

    public static void register(String formality, GreetingStrategy strategy) {
        strategies.put(formality, strategy);
    }

    public static GreetingStrategy get(String formality) {
        return strategies.getOrDefault(formality, new DefaultGreeting());
    }
}
