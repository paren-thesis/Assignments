
public class MethodsInClass {

    static int a;
    public static void getAddition() {
        a = 12;
        int b = 13;
        int sum = a + b;
        System.out.println("The sum is " + sum);
    }

    public static int getSubstraction() {
        a = 34;
        int b = 12;
        int sub = a - b;
        System.out.println("The subtraction is " + sub);
        return sub;
    }
    public static void main(String[] args) {
        getAddition();
        getSubstraction();       
    }

}
