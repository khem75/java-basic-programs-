class superclass{
    int num=100;


superclass(){
    system.out.println("construtor of superclass");
}
void display(){
    system.out.println("superclass method");
}

}
//subclass
class subclass extends superclass{
    int num=200;

    subclass(){
        super();
        system.out.println("construtor of subclass");
    }
    void display(){
        super.display();
        system.out.println("subclas method");
    }
    void showNum(){
        system.out.println("superclass num:",+super.num);
        system.out.println("subclass num:",+this.num);
    }

}
public class main{
    public static void main(String[]arg){
        subclass obj=new sub class();
        obj.display();
        obj.showNum();

    }
}