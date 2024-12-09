
public class MethodsInJava {
    static int a = 30;

    public static int GetAddition() {
        int a = 70;
        int b = 30;
        int sum = a + b;
        return sum;   
    }

    public void Precious() {
        System.out.println("Hello there");
    }

    public static void Ann() {
        System.out.println("Hello Precious");
        System.out.println("Nice to see you");
    }

    public static void main(String[] args) {
        GetAddition();
        
        System.out.println("The sum of the numbers is " + GetAddition());
    }

}
