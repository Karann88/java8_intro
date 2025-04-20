package LambdaExp;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("My System starts...");

        // Approach 1 - Implement interface creating another class
        // MyInter myInter = new MyInterImpl();
        // myInter.sayHello();
        // myInter.sayBye();

        // Approach 2 - Creating anonymus function
        /*
         * MyInter i1 = new MyInter() {
         * 
         * @Override
         * public void sayHello() {
         * System.out.println("This is first anonymus class.");
         * }
         * };
         * i1.sayHello();
         * 
         * MyInter i2 = new MyInter() {
         * 
         * @Override
         * public void sayHello() {
         * System.out.println("This is second anonymus class.");
         * }
         * };
         * i2.sayHello();
         */

        // Using our interface with the help of Lambda Expression
        // Functional Interface act as a type for lambda expression.
        // MyInter i = () -> System.out.println("This is first time i am using lambda");
        // i.sayHello();

        // MyInter i2 = () -> "This is second time i am using lambda";
        // System.out.println(i2.sayHello());

        // Anonymus function
        // SumInter sumInt = new SumInter() {
        //     @Override
        //     public int sum(int a, int b) {
        //         return a + b;
        //     }
        // };

        // SumInter sumInt = (a, b) -> (a + b);

        // System.out.println(sumInt.sum(2, 6));
        // System.out.println(sumInt.sum(4, 7));

        /*
         * LengthInter length = new LengthInter() {
         * 
         * @Override
         * public int getLength(String str) {
         * return str.length();
         * }
         * };
         * System.out.println(length.getLength("Hello"));
         */

        // LengthInter length = (str) -> str.length();

        // System.out.println("Length of the string is : " + length.getLength("Karan Jangid"));
        // System.out.println("Lenght of the string is : " +
        // length.getLength("Mumbai"));
    }
}
