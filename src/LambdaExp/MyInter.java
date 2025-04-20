package LambdaExp;

@FunctionalInterface
public interface MyInter {
    // void sayHello();  // abstract method - has no body.
    String sayHello(); // Abstract method - has no body.
    
    default void sayBye() {            // Default method has body and can be overridden
        System.out.println("Bye");  //  or changed in the implementation class.
    };

    public static void sayOk() {     // Static methods contain the complete definition of the function
    };                              // Cannot be overridden or changed in the implementation class
}

// Create separate class and implements this interface
// Anonymous class for implementing interface
// Lambda Expression 