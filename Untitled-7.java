class shape{    //superclass   //parent class
    double area=(double radius){
        return 0;
    }
}
class circle extends shape{//subclass //child class
    double area(double radius){
        return math.pi*radius*radius;
    }
}
public class main{
    public static void main(String[]arg){
        circle c=new circle();
        system.out.println("area of circle"+circle.area(5))
    }
}