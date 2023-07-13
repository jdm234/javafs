public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        /* acc.balance = 1000; -> ERROR*/
        acc.setBalance(1000);
        System.out.printf("잔액 : %d", acc.getBalance());
    }
}

class Account {
    private int balance;

    public Account(String ano, String owner, int balance2) {
    }

    public Account() {
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int b) {
        balance = b;
    }

    public char[] getAno() {
        return null;
    }

    public char[] getOwner() {
        return null;
    }
    
    // 게터 메서드
    /* public int getBalance() {
        return balance;
    }
    // 세터 메서드
    public void setBalance(int b) {
        balance = b;
    } */
}