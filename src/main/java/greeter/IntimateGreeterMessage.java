package greeter;

public class IntimateGreeterMessage implements GreeterMessage{
    public IntimateGreeterMessage() {
    }
    @Override
    public String getMessage() {
        return "Hello Darling!";
    }
}