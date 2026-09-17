package greeter;

public class GreeterMessageFactory {

    public GreeterMessageFactory() {
    }

    GreeterMessage create(String type) {
        if(type == null){
            return new NormalGreeterMessage();
        }

        if (type.equals("formal")) {
            return new FormalGreeterMessage();
        } else if (type.equals("casual")) {
            return new CasualGreeterMessage();
        } else if (type.equals("intimate")) {
            return new IntimateGreeterMessage();
        } else if (type.equals("퇴근")) {
            return new 퇴근인사();
        } else {
            return new NormalGreeterMessage();
        }
    }
}