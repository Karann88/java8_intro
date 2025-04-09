package LambdaExp;

@FunctionalInterface
public interface MyInter {
    public abstract void sayHello();

    default void sayBye() {
    };

    public static void sayOk() {
    };
}

// Create separate class and implements this interface
// Anonymous class for implementing interface
// Lambda Expression 