import java.util.HashMap;
import java.util.Scanner;

public class Mapping {

    public static void main(String[] args) {
        HashMap<String, Integer> empId = new HashMap<>();
        Scanner input = new Scanner(System.in);

        

        for (int i = 0; i < 3; i++) {
            System.out.printf("[%d] Enter person name: ",(i+1));
            String name = input.nextLine();
            
            System.out.printf("[%d] Enter student id: ",(i+1));
            String idstr = input.nextLine();
            int id = Integer.parseInt(idstr);
            System.out.println();

            empId.put(name, id);
        }
        System.out.println(empId);
        input.close();
    }   
}