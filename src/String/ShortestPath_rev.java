package String;

public class ShortestPath_rev {
    public static double printString(String str){
     int x=0;int y=0;
     for(int i=0;i<str.length();i++){
         char dir=str.charAt(i);
         if(dir=='S'){
             y--;
         }
         else if(dir=='N'){
             y++;
         }
         else if(dir=='E'){
             x++;
         }
         else{
             x--;
         }
     }
     int x2=x*x;
     int y2=y*y;
     return Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";

        System.out.println("shortest path is : "+printString(str));
    }
}
