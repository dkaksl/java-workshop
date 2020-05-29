package my.types;

public class MyTypeWithFinalVariables {
    private final String string;

    /*public MyTypeWithFinalVariables() {
    }*/

    public MyTypeWithFinalVariables(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
