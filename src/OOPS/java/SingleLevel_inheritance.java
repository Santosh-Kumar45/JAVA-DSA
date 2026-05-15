package OOPS.java;

public class SingleLevel_inheritance {
    public static void main(String[] args) {
        Dog dogy=new Dog();
        dogy.eat();
        dogy.breadth();
    }
}
class Animals{
    String color;
    void eat(){
        System.out.println("eating ");
    }
}
class Mammel extends Animals{
    String leg;
    void leg(){
        System.out.println("4 leg");
    }
}
class Dog extends Mammel{
    String breadth;
    void breadth(){
        System.out.println("by mouth");
    }
}