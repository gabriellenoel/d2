import java.util.Scanner;

public class addValues {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("How many values do you want to add? ");

        int amount = myObj.nextInt();
        int total = 0;

        for (int i=0; i < amount; i++) {
            System.out.println("Value: ");
            int val = myObj.nextInt();
            total += val;
        }
            System.out.println("Here is the sum of those values: " + total);

    }
}
