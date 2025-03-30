package day03_branching_pullrequest;

public class MyComputer {
    public String model;
    public double price;

    public MyComputer(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MyComputer{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
