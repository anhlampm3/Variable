package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float vl, h, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Điểm vật lý là: ");
        vl = sc.nextFloat();
        System.out.println("Điểm hóa học là: ");
        h = sc.nextFloat();
        System.out.println("Điểm sinh là: ");
        s = sc.nextFloat();
        float tb = (vl+h+s)/3;
        System.out.println("Điểm trung bình là: " + tb);
        float tong = vl+h+s;
        System.out.println("Tổng điểm là: " + tong);
    }
}
