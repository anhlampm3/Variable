package com.company;
import java.util.Scanner;
public class cau3 {
    public static void main(String args []){
        double r;
        double pi = 3.14;
        System.out.println("Nhập r: "  );
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        double chuvi = (double) 2*pi*r;
        System.out.println("Chu vi là: "+ chuvi +"\n" );
        System.out.println("Diện tích là: " + Math.pow(r,2));

    }
}
