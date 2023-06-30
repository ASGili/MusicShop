package instruments;
public enum InstrumentType {

    BRASS("TRUMP!"),
    WOODWIND("HORN!"),
    PERCUSSION("BANG!"),
    STRINGS("THRING!");

    private String sound;
    InstrumentType(String sound) {
        this.sound = sound;
    }

    public String getValue(){
        return this.sound;
    }

}
