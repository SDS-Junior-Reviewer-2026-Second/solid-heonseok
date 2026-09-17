package greeter;

public class Greeter {

    private final GreeterMessageFactory greeterMessageFactory = new GreeterMessageFactory();
    String formality;

    public String greet() {
        return greeterMessageFactory.create(formality).getMessage();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
