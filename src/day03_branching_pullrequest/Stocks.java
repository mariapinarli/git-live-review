package day03_branching_pullrequest;

public class Stocks {
    String name;
    String company;
    double price;
    // if we don't use access modifier like public is default as accessible just same package


    public Stocks(String name, String company, double price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stocks{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }
}
