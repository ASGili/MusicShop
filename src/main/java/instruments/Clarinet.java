package instruments;

import peripherals.Reed;

public class Clarinet extends MusicalInstrument {

    private Reed reed;

    public Clarinet(double cost, double price) {
        super(InstrumentType.WOODWIND, cost, price);
        this.reed = null;
    }

    public Reed getReed() {
        return reed;
    }

    public void addReed(Reed reed) {
        this.reed = reed;
    }

    @Override
    public String play() {
        if (reed != null) {
            return getType().getValue();
        } else {return "";}
    }
}
