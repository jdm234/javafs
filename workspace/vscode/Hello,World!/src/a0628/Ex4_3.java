package a0628;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        char grade = ' ';

        System.out.println("정수를 입력해주세요.");
        Scanner Scanner = new Scanner(System.in);
        int input = Scanner.nextInt();

        if(score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
    }
    
}
