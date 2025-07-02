import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int[] series = new int[n];
        System.out.println("Enter the values of the series:");
        for (int i = 0; i < n; i++) {
            System.out.print("x" + (i + 1) + ": ");
            series[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += series[i];
        }

        System.out.println("The sum of the series is: " + sum);

        scanner.close();
    }
}
