package OOPS.java;

public class Getter_and_setter {
    public static void main(String[] args) {
        Pencile p1=new Pencile();
        p1.setColor("Reebock");
        System.out.println(p1.getColor());
    }
}
class Pencile{
    public String color;

    void setColor(String color){
        this.color=color;
    }
    String getColor(){
        return this.color;
    }
}