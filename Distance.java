package com.basicjava;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        double distance=Math.sqrt((x*x)+(y*y));
        System.out.println("the distance between the given points is: "+distance);
    }
}
