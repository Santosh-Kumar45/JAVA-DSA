package String;

public class Lexicographic {
    public static void main(String[] args) {
        String apple="apple";
        String banana="banana";
        for(int i=0;i<apple.length();i++){
            for(int j=0;j<banana.length();j=j+banana.length()){
                if(apple.charAt(i)<=banana.charAt(j)|| apple.charAt(i)>=banana.charAt(j)){
                    if(apple.length()>banana.length()){
                        System.out.println(apple);

                    }
                    else{
                        System.out.println(banana);

                    }

                }

            } break;
        }
    }
}
