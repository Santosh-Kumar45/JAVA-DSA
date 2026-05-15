package String;

public class String_compare {
    public static void main(String[] args) {
        String s1="santosh";
        String s2="santosh";
        String s3=new String("santosh");
        if(s1==s2){
            System.out.println("string1 are equals");
        }
        else{
            System.out.println("string1 are not equals");
        }

        //if we wants to equals string of object then using equals() methods.
        if(s1.equals(s3)){
            System.out.println("string2 are equals");
        }
        else{
            System.out.println("string2 are not equals");
        }
    }
}
