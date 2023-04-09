package com.example;

import java.util.Scanner;
public class Combined {
    public static void main(String[] args ){
        int a =8 , b = 5*a ;
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println();
        System.out.println(b);
      Scanner input= new Scanner(System.in);
      int c,d,e,f;
      System.out.println("input any value");
      c=input.nextInt();
      System.out.println("input second value");
      d=input.nextInt();
      System.out.println("input third value");
      e=input.nextInt();
      System.out.println("input forth value");
      f=input.nextInt();
      System.out.println();
      int h=b+c+d+e+f ;
      System.out.println("your answer is "+h);
    }
}
