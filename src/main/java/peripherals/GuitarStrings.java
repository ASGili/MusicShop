package peripherals;

import interfaces.Sellable;

public class GuitarStrings implements Sellable {

    private int thickness;
    private double cost;
    private double price;

    public GuitarStrings(int thickness, double cost, double price) {
        this.thickness = thickness;
        this.cost = cost;
        this.price = price;
    }

    public int getThickness() {
        return thickness;
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
