package OOPS.java;

public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student("santosh");
        System.out.println(s1.name);
    }
}
class Student{
    public String name;
    public int roll;

    Student(String name){
        System.out.println("good morning ");
        this.name =name;
    }
}
