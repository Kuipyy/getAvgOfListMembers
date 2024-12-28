import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void showList(ArrayList<Integer> list) {
        System.out.print("List is: [ ");
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.print("]\n");
    }

    public static double getAvg(ArrayList<Integer> list) {
        double sum = 0;
        for(int i : list) {
            sum += i;
        }
        return sum / list.size();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        ArrayList<Integer> list = new ArrayList<>();


        System.out.println("Enter integer numbers to add the array: ");
        System.out.println("Press -1 to exit");
        number = input.nextInt();
        while (number != -1) {
            list.add(number);
            number = input.nextInt();
        }

        showList(list);
        System.out.println("Average of list members is: " + getAvg(list));


    }
}