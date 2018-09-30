package com.company;
import java.util.Scanner;
public class doitien {
    public static void main (String [] args){
        double rate = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap USD: ");
        usd = sc.nextDouble();
        double vnd = (int) usd*rate;
        System.out.println(vnd+ "vnd"+ "\nHoi bi giau day: ");
    }
}
