package a0710;

public class String3 {
    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println("원본 문자열 : " + str);

        System.out.println(str.concat("수업"));
        System.out.println("compareTo() 메소드 호출 후 원본 문자열 :" + str);

    }
}
