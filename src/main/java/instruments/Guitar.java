package instruments;

import peripherals.GuitarStrings;

public class Guitar extends MusicalInstrument {

    private GuitarStrings[] strings;

    public Guitar(double cost, double price) {
        super(InstrumentType.STRINGS, cost, price);
        this.strings = new GuitarStrings[]{null, null, null, null, null, null};
    }

    public void addString(int index, GuitarStrings string){
        strings[index-1] = string;
    }
    public GuitarStrings[] getStrings() {
        return strings;
    }

    @Override
    public String play(){
       int nullStrings = 0;
       for ( GuitarStrings string : strings){
           if (string == null){ nullStrings += 1;}}
       if (nullStrings == 0){return super.play();} else {return "";}
    }
}
