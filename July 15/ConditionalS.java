import java.util.Scanner;

public class ConditionalS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("The first number is greater");   
        } else {
            System.out.println("The second number is greater");
        }

        input.close();
    
    }
}