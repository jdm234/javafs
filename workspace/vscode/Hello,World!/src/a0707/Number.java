package a0707;

public class Number {
    public int[] solution(long n) {

        String nStr = String.valueOf(n);
        int nLength = nStr.length();
        int[] answer = new int[nLength];
        int inputValue = 0;

        for (int i = 0; i < nLength; i++) {
            inputValue = Integer.parseInt(nStr.substring(i, i * 1));
            answer[nLength - i - 1] = inputValue;
        }
        
        return answer;
    }

}
