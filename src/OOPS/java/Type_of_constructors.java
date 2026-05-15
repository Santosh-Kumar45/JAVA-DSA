package OOPS.java;

public class Type_of_constructors {
    public static void main(String[] args) {
        Students s1=new Students();
        Students s2=new Students("santosh");
        System.out.println(s2.name);
        Students s3=new Students(27);
        System.out.println(s3.roll);
    }
}
class Students{
    String name;
    int roll;
    Students(){
        System.out.println("this is not parameterize");
    }
    Students(String name){
        this.name=name;
    }
    Students(int roll){
        this.roll=roll;
    }
}