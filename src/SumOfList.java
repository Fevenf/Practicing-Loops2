import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> myArr = new ArrayList<Integer>();

        while (true) {
            int input1 = scan.nextInt();
            if (input1 != 0) {
                myArr.add(input1);
            } else {
                break;
            }
        }

        for (int i = 0; i < myArr.size(); i++) {
            if (i < myArr.size() - 1) {
                System.out.print(myArr.get(i) + ", ");
            } else
                System.out.println("and " + myArr.get(i) + " were the items in the list. The sum of that list is:\n" + sum(myArr));
        }
    }

    public static int sum(ArrayList<Integer> myArr) {

        int sum = 0;
        for (int i = 0; i < myArr.size(); i++) {
            sum = sum + myArr.get(i);
        }
        return sum;
    }
}