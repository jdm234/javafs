package a0717;

import java.util.stream.Stream;

public class Transaction {
    private Trader trader;
    private Trader year;
    private int value;

    public Transaction(Trader trader, int i, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public Trader getyear() {
        return year;
    }

    public int getvalue() {
        return value;
    }

    @Override
    public String toString() {
        return "Transaction [trader=" + trader + ", year=" + year + ", + value=" + value + "]";
    }

    public static Stream<Transaction> Stream() {
        return null;
    }

}