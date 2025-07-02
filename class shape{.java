class shape{
    double area=(double radius){
        return 0;
    }
}
class circle extends shape{
    double area(double radius){
        return maths.PI*radius*radius;

    }
}
public class main{
    public static void main(String[]arg){
 circle circle=new circle();
 system.out.println("aarea of circle "+circle.area(5));
    }
}