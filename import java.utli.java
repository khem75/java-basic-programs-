import java.utli.scanner;
public class main{
    public static void main(string[]arg){
        scanner sc=new scanner(system.in);
        system.out.println("enter the size of the 2d array: ");
        int n=sc.nextInt();

        system.out.println("enter the element of the array:");
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                array[i][j]=sc.nextlnt();   
            }
          
                }
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=array[i][i];
            
            }
            systme.out.println("sum of the primaary diogonal element"+sum);

            }
}