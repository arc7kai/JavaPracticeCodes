package OOP;
// Note:- Static variables live at class level with a single shared copy, while instance variables live in heap memory with a separate copy per object.
public class Calculator {

    // static because calculator logic is common, no object state needed
    public static int getAddition(int n1, int n2) {
        return n1 + n2;
    }

    public static int getSubtraction(int n1, int n2) {
        return n1 - n2;
    }

    public static void main(String[] args) {

        int add1 = Calculator.getAddition(50, 40);
        System.out.println("Addition of Numbers: " + add1);

        int sub1 = Calculator.getSubtraction(80, 30);
        System.out.println("Subtraction of Numbers: " + sub1);

        int add2 = Calculator.getAddition(100, 50);
        System.out.println("Addition of Numbers: " + add2);
    }
}
