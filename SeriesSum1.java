import java.util.Scanner;

public class SeriesSum1{
    public static void main (String[]arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms(n):");
        int n=sc.nextInt();
        double sum=0;
        for (int i=1;i<n;i++){

        sum+=i;

    }
    System.out.println("sum of the series:"+sum);
    sc.close();

}
}

