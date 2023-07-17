package a0717;

import javax.naming.InsufficientResourcesException;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        try {
            account.withdraw(30000);
        } catch (InsufficientResourcesException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
