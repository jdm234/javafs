import java.io.FileWriter;
import java.io.IOException;

public class Write4 {
    public static void main(String[] args) throws IOException{
        FileWriter pw = new FileWriter("d:/out.txt");
        for(int i = 1; i <11; i++) {
            String data = i+ " 번째 줄 입니다.";
            pw.write(data);
        }
        pw.close();
    }
}
