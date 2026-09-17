package greeter;

public class FormalGreeterMessage  implements GreeterMessage{
    public FormalGreeterMessage() {
    }

    @Override
    public String getMessage() {
        return "Good evening, sir.";
    }
}