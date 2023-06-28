package a0628;

public class Ex3_16 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';
        
        System.out.printf("b=%b%n", b); //trure
        System.out.printf("!b=%b%n\", !b"); //false
        System.out.printf("!!b=%b%n\", !!b"); //true
        System.out.printf("!!!b=%b%n\", !!!b"); //false
        System.out.println();

        System.out.printf("ch=%c%n", ch); //c% 한개의 문자
        System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z'); //true 소문자 a는 아스키 코드 값이 97 대문자 C는 67
        System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<= ch && ch<='z')); //true
        System.out.printf("'a'<=ch && ch<='z' =%b%n", 'a'<=ch && ch <='z'); //false && 압뒤에 둘다 식이 참이어야만 true
        }
}
