package OOPS.java;

public class Hybrid_inheritance {
    public static void main(String[] args) {

        Shark shark=new Shark();
        shark.living();
        Peacock peacock=new Peacock();
        peacock.eat();
        Cat cat=new Cat();
        cat.foot();
    }
}
class Animall{
    String color;
    void eat(){
        System.out.println("Decaying food");
    }
}
class Fishh extends Animall{
    String wing ;
    void wing (){
        System.out.println("wings");
    }
}
class Birds extends Animall{
    String leg;
    void leg(){
        System.out.println("2 leg");
    }
}
class Mammels extends Animall{
    String foot;
    void foot(){
        System.out.println("2 foot and 2 hand ");
    }
}

class Shark extends Fishh{
    void living(){
        System.out.println("live in water");
    }
}

class Peacock extends Birds{
    void living(){
        System.out.println("live on land ");
    }
}

class Cat extends Mammels{
    void living (){
        System.out.println("earth");
    }
}