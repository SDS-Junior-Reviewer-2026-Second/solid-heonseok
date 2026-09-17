package greeter;

public class CasualGreeterMessage implements GreeterMessage{
    public CasualGreeterMessage() {
    }
    @Override
    public String getMessage() {
        return "Sup bro?";
    }
}