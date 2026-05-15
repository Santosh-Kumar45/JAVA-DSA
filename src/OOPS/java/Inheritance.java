package OOPS.java;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
    }
}

//parents class/base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}


//child class/derived class
class Fish extends Animal{
    String swimming ;

    void swimm(){
        System.out.println("swimme");
    }
}