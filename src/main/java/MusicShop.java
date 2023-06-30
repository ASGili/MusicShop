import interfaces.Sellable;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<Sellable> stock;

    public MusicShop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }
    public void addToStock(Sellable item){
        stock.add(item);
    }

    public void removeFromStock(Sellable item){
        int index = getStock().indexOf(item);
        stock.remove(index);
    }

    public double getAverageMarkup() {
        double totalMarkup = 0;
        for (Sellable item : stock){
            totalMarkup += item.markup();
        }
        return totalMarkup/(getStock().size());
    }
}
