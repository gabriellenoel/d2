import java.util.Scanner;

public class maxValue {

    public static int findMaxValue(int[][] twodArray) {
        int maxValueStored = twodArray[0][0];
        for (int j = 0; j < twodArray.length; j++) {
            for (int i = 0; i < twodArray[j].length; i++) {
                if (twodArray[j][i] > maxValueStored) {
                    maxValueStored = twodArray[j][i];
                }
            }
        }
        return maxValueStored;
    }

    public static void main(String[] args) {
        int[][] twodArray = new int[3][3]; // create empty 2D array
        Scanner s1 = new Scanner(System.in); //create Scanner object
        System.out.println("Enter the values to be added to the 2D array: "); // add values to 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twodArray[i][j] = s1.nextInt();
            }
            System.out.println();
        }
        System.out.println("Your 2D array is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twodArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int max = findMaxValue(twodArray);
        System.out.println("The max value of this array is: " + max);
    }
}

