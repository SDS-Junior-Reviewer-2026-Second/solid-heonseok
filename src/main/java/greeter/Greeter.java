package greeter;

public class Greeter {
<<<<<<< HEAD
    private String formality;

    public String greet() {
        return GreetingStrategyFactory.get(formality).greet();
=======
    private final GreeterMessageFactory greeterMessageFactory = new GreeterMessageFactory();
    String formality;

    public String greet() {
        return greeterMessageFactory.create(formality).getMessage();
>>>>>>> 5e81fb74b4c4db9f9740d1f27e0cd635be456442
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
