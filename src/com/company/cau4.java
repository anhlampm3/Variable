package com.company;
import java.util.Scanner;
public class cau4 {
    public static void main (String [] args){
        short ns;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nam sinh cua tui: ");
        ns = sc.nextShort();
        short tuoi = (short) (2018 - ns);
        System.out.println(tuoi + "Tuoi" + "\nBan sap gia roi :)  " );

    }

}
