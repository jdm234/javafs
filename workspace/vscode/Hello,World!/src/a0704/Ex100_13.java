package a0704;

import java.util.Scanner;

public class Ex100_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("실수를 입력 해주세요.");
        float num = scan.nextFloat();
        System.out.printf("%5.2f", num); // 1.23579

        // System.out.printf("%.2f", num);
        num = (num * 0.005f)*100; // 124.879
        System.out.println(num);
        int i = (int) num; // 124
        System.out.println(i);
        num = (float) i/100;
        System.out.println(num); // 1.24
    }
}