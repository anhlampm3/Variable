package com.company;
import java.util.Scanner;

public class cau2 {
    public static void main(String args []){
        double celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ Celsius: ");
        celsius = sc.nextDouble();
        double fahrenheit = (double) 9/5*celsius+32;
        System.out.println(celsius + "Độ C " + + fahrenheit + "Độ F ");
    }
}
