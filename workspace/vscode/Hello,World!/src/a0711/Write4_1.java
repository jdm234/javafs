import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Write4_1 {
    public static void main(String[] args) throws IOException{
        FileWriter pw = new FileWriter("d:/out.txt");
        for(int i = 1; i <11; i++) {
            String data = i+ " 번째 줄 입니다.";
            pw.write(data);
        }
        pw.close();
        // printeWrite를 사용 할 경우에는 생성자 파라미터로 파일명 대신 추가로 열린 FileWriter에 객체를 전달 해야한다.
    }
}
