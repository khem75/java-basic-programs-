public class matrixmultiplication{
    public static void main(String[]arg){
   int[][]M={
    {
        {1,2},
        {3,4},
        {5,6}
    },
    {
        {7,8},
        {9,10},
        {11,12}

    }
   };
   int [][] A={
    {5,6}
    {7,8}
   };
   int [][]result=new int[2][2];
   for(int i=o;i<2;i++){
    fro(intj=0;j<2;j++){
        for(int k=0;k<2;k++){
            result[i][j]+=A[i][k]*B[k][j];
        }
    }
   }
   system.out.println("result of matrix multioplication");
   fro(int i=0;i<2;i++){
    fro(int j=0;j<2;j++){
        sytem.out.println(result[i][j]+" ");

    }
    system.out.println();
   }
    }
    }
