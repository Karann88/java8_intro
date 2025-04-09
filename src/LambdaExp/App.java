package LambdaExp;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("My System starts...");

        // Approach 1 - Implement interface creating another class
        // MyInter myInter = new MyInterImpl();
        // myInter.sayHello();

        // Approach 2 - Creating anonymus function
        MyInter i1 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is first anonymus class.");
            }
        };
        i1.sayHello();

        MyInter i2 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is second anonymus class.");
            }
        };
        i2.sayHello();

        // Using our interface with the help of Lambda
        // MyInter i = () ->  System.out.println("This is first time i am using lambda");
        // i.sayHello();

        // MyInter i2 = () -> System.out.println("This is second time i am using lambda");
        // i2.sayHello();

        // SumInter sumInt = (a, b) -> (a + b);
        
        // System.out.println(sumInt.sum(2, 6));
        // System.out.println(sumInt.sum(4, 7));

        // LengthInter length = (str) -> str.length();

        // System.out.println("Length of the string is : " + length.getLength("Karan Jangid"));
        // System.out.println(length.getLength("Mumbai"));
    }
}
