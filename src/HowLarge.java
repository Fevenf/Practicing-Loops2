import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("What do you want your input to be?");
        
        ArrayList myArray = new ArrayList<>();
        
        for (int i = 0; i < myArray.size() + 1; i++) {
            String input = scan.nextLine();
            if (input.equals("")) {
        System.out.println("The total amount of item in the list: " + myArray.size());
            }
            else {
                myArray.add(input);
            }
        }
    }
}
