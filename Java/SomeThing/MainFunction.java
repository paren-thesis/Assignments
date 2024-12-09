import java.util.Scanner;

public class MainFunction {
   
    public static void anounceTeatime() {
        System.out.println("Waiting for developer's tea time");
        System.out.println("Type in a random word and hit enter");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("It's developer's tea time");
        input.close();
    }

    public static void main(String[] args) {
        anounceTeatime();
        System.out.println("Hello World");
    }
}
