import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import peripherals.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;
    private GuitarStrings string1;
    private GuitarStrings string2;
    private GuitarStrings string3;
    private GuitarStrings string4;
    private GuitarStrings string5;
    private GuitarStrings string6;
    @Before
    public void setUp(){

        guitar = new Guitar(100,300);
        string1 = new GuitarStrings(1,50,100);
        string2 = new GuitarStrings(2,55,100);
        string3 = new GuitarStrings(3,51,100);
        string4 = new GuitarStrings(4,52,100);
        string5 = new GuitarStrings(5,49,100);
        string6 = new GuitarStrings(6,74,100);
    }

    @Test
    public void hasCost(){
        assertEquals(100, guitar.getCost(),0.0);
    }

    @Test
    public void hasPrice(){
        assertEquals(300, guitar.getPrice(),0.0);
    }
    @Test
    public void canSetPrice(){
        guitar.setPrice(400);
        assertEquals(400, guitar.getPrice(),0.0);
    }
    @Test
    public void cantPlayWithoutStrings(){
        assertEquals("", guitar.play());
    }

    @Test
    public void canAddStrings(){
        guitar.addString(1,string1);
        guitar.addString(2,string2);
        guitar.addString(3,string3);
        guitar.addString(4,string4);
        guitar.addString(5,string5);
        guitar.addString(6,string6);
        assertEquals(string1,guitar.getStrings()[0]);
        assertEquals(string2,guitar.getStrings()[1]);
        assertEquals(string3,guitar.getStrings()[2]);
        assertEquals(string4,guitar.getStrings()[3]);
        assertEquals(string5,guitar.getStrings()[4]);
        assertEquals(string6,guitar.getStrings()[5]);
    }

    @Test
    public void canPlayWithStrings(){
        guitar.addString(1,string1);
        guitar.addString(2,string2);
        guitar.addString(3,string3);
        guitar.addString(4,string4);
        guitar.addString(5,string5);
        guitar.addString(6,string6);
        assertEquals("THRING!", guitar.play());
    }
    @Test
    public void hasMarkup(){
        assertEquals(200, guitar.markup(),0.0);
    }
}
