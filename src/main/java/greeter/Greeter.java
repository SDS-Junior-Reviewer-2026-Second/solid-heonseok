package greeter;

public class Greeter {
    private String formality;

    public String greet() {
        return GreetingStrategyFactory.get(formality).greet();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
