import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("What do you want your input to be?");
        
        ArrayList myArray = new ArrayList<>();
        
        for (int i = 0; i < myArray.size() + 1; i++) {
            int input = scan.nextInt();
            if (input != 0) {
                myArray.add(input);
                }
            else if (input == 0) {
                System.out.println("Done entering items into the list");
                System.out.println("What number are you looking for in the list?");
                int input2 = scan.nextInt();
                System.out.println(input2 + " is at " + myArray.indexOf(input2));
                }
            }
        }
}
