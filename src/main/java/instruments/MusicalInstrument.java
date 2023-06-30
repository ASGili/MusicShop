package instruments;
import interfaces.Playable;
import interfaces.Sellable;

public abstract class MusicalInstrument implements Playable,Sellable {

    private InstrumentType type;
    private double cost;
    private double price;

    public MusicalInstrument(InstrumentType type, double cost, double price) {
        this.type = type;
        this.cost = cost;
        this.price = price;
    }

    public InstrumentType getType() {
        return type;
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

    public String play(){
        return getType().getValue();
    }

    public double markup(){
        return ((price-cost)/cost)*100;
    }
}
