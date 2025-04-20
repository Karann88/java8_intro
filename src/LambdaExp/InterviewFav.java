package LambdaExp;

// interface A {
//     default void sayHello() {
//         System.out.println("A says Hello");
//     }
// }

// @FunctionalInterface   // Only an abstract method in interface called as Functional Interface.
// interface B {                   // (Abstract has no body)
//     default void sayHello() {
//         System.out.println("B says Hello");
//     }
//     void sayOk();
// }

interface A {
    static void sayHello() {     // By default static methods are public.
        System.out.println("Hello !");
    }
    
}

public class InterviewFav implements A{
    public static void main(String[] args) {
        InterviewFav obj = new InterviewFav();
        // obj.sayHello();           // Wrong:- We can't call static method like this inside the interface.
        // InterviewFav.sayHello();  // Wrong:- We can't call static method like this inside the interface.
    
        // Only way to call static method inside the interface.
        // By using of direct (Interface name).
        A.sayHello();
    }


    // public static void main(String[] args) {
    //     InterviewFav interviewFav = new InterviewFav();
    //     interviewFav.sayHello();   // (Error name:- Ambiguity)
    //     interviewFav.sayOk();
    // }

    // @Override
    // public void sayOk() {
    //     System.out.println("OK from Abstract");
    // }

    // @Override
    // public void sayHello() {
    //     A.super.sayHello();
    // }
}
