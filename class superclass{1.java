class superclass{
    int num=100;

    superclass(){
        system.out.println("construtor of superclass");

    }
    void .display(){
        system.out.println("method of superclass");

    }

}
//subclass
class subclass extend super class{
    int num=200;

    subclass(){
        super();
        system.out.println("construtr of subclass");
    }
    void.display(){
        super.display();
        system.out.println("method of subclasas");

    }


 void showNum(){
    system.out.println("superclass nunm:",+super.num);
    system.out.println("sublcass num:",+this.num);
 
 }
}

public class main{
    public static void main(String[]args){
        subclass obj=new subclass();
        obj.display();
        obj.shownum();
        
    }
}