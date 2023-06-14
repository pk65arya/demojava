package com.basicjava;
import java.util.*;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int delta=(b*b)-4*a*c;
        double x1=(-b +Math.sqrt(delta))/(2*a);
        double x2=(-b -Math.sqrt(delta))/(2*a);
        System.out.println("the roots of the given eqution are :" +x1 +" " +x2 );
    }
}
