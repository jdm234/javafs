package a0704;

import java.util.Scanner;

public class Ex100_37 {
    public static void main(String[] args) {
        // 큰 값이 10진수로 출력된다.
		Scanner scan = new Scanner(System.in);
		System.out.print("한변의 개수를 입력하세요>");
        int n = scan.nextInt();
        for(int i=0; i < n ; i++){
            for(int j=0; j < n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}