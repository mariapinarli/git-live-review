package day03_branching_pullrequest;

public class TestStocks {

    public static void main(String[] args) {

        Stocks googleStocks = new Stocks("GOOG", "Google", 16.06);
        Stocks teslaStocks = new Stocks("TLSA", "Tesla Inc", 263.55);

        System.out.println("teslaStocks = " + teslaStocks);
        System.out.println("googleStocks = " + googleStocks);

    }
}
