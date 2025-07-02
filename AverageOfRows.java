import java.util.Scanner;

public class AverageOfRows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element for [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
          double average = (double) sum / cols;
         System.out.println("The average of row " + (i + 1) + " is: " + average);
        }
        sc.close();
    }
}
