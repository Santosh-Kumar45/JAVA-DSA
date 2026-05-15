package Bitmanipulation.java;

import java.util.Scanner;

public class Binary_OddEven {
    public static void printOddEven(int num){
        int bitMask=1;
        if((num & bitMask)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
       System.out.println("enter number ");
       int num=kb.nextInt();
       printOddEven(num);
    }
}
