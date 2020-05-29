import my.types.MyType;
import my.types.MyTypeWithMethod;

public class CustomTypes {
    public static void main(String[] args) {
        MyType myType;

        MyTypeWithMethod myTypeWithMethod = new MyTypeWithMethod();
        long sum = myTypeWithMethod.add(1, 2);
    }
}
