class Main{
    public static void main(String[]arg){
        int x={1,3,5,7,9};
        int y={2,4,6,8,10};
        int n=Math.min(x.length,y.length);
        double sum=0.0;
        for(int i=0; i<n; i++){
            sum+=(doulbe)x[i]/y[i];
        }
System.out.println("th esum of the series is:"+sum);
    }
}