package OOPS.java;

public class Hierarchial_inheritance {
    public static void main(String[] args) {
        Banana obj=new Banana();
        obj.bananaTest();

        Mango obj1=new Mango();
        obj1.mangoTest();
    }
}
class Fruits{
    String color;
    String test;
    void fruitsTest(){
        System.out.println("mitha");
    }
}
class Mango extends Fruits{
    void mangoTest(){
        System.out.println("khatta");
    }
}
class Banana extends Fruits{
    void bananaTest(){
        System.out.println("bhusur bhusur ");
    }
}