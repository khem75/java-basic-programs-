class superclass{
    int num=100;

     superclass(){
        system.out,println("construtor of superclass");

     }
     void dipaly(){
        system.out.println("method of superclass");
     }

}
//subclass
class subclass extends suoerclass{
    int num=200;

    subclass(){
        super();
        system.out.println("construtpr of subclass");

    }
    void.display(){
        super.display();
        system.out.println("method of subclass");
    }

void showNum(){
    system.out.println("suerclass num:",+super.num);
    system.out.println("subclass num:",+this.num);

}
}
public class main{
    public static void main(String[]args){
        subclass obj=new subclass();
        obj.display();
        obj.shownum();
        

    }
}