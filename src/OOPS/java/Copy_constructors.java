package OOPS.java;

public class Copy_constructors {
    public static void main(String[] args) {
        Studentss s1=new Studentss("santosh",24);

        Studentss s2=new Studentss(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

class Studentss{
    String name;
    int roll;
    Studentss(String name,int roll){
        this.name=name;
        this.roll=roll;
    }


    //copy constructors
    Studentss(Studentss s1){
        this.name=s1.name;
        this.roll=s1.roll;
    }

}
