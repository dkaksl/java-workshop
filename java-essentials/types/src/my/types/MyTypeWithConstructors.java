package my.types;

public class MyTypeWithConstructors {
    private String string;

    public MyTypeWithConstructors() {
        this.string = "default value";
    }

    public MyTypeWithConstructors(String providedString) {
        this.string = providedString;
    }

    public String getString() {
        return string;
    }
}
