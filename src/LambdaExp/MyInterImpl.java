package LambdaExp;

public class MyInterImpl implements MyInter {
    @Override
    public void sayHello() {
        System.out.println("Hello from MyInterImpl class.");
    }

    @Override
    public void sayBye() {
        System.out.println("Hello from MyInterImpl");
    }
}
