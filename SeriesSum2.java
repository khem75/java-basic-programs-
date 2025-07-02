import java.util.Scanner;

public class SeriesSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        double x = sc.nextDouble();
        System.out.print("Enter value of y: ");
        double y = sc.nextDouble();
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += x / Math.pow(y, i);
        }

        System.out.println("Sum of the series: " + sum);
    }
}
