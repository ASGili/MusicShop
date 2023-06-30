package peripherals;

import interfaces.Sellable;

public class Reed implements Sellable {

    private double cost;
    private double price;

    public Reed(double cost, double price) {
        this.cost = cost;
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double markup(){
        return ((price-cost)/cost)*100;
    }

}
