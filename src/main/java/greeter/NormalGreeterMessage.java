package greeter;

public class NormalGreeterMessage implements GreeterMessage{
    public NormalGreeterMessage() {
    }
    @Override
    public String getMessage() {
        return "Hello.";
    }
}