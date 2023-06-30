import instruments.Clarinet;
import instruments.Drums;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import peripherals.Reed;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private MusicShop shop;
    private Guitar guitar;
    private Clarinet clarinet;
    private Drums drum;
    private Reed reed;

    @Before
    public void setUp(){
        shop = new MusicShop();
        guitar = new Guitar(100,800);
        clarinet = new Clarinet(200,900);
        drum = new Drums(25,225);
        reed = new Reed(1,10);
        shop.addToStock(guitar);
        shop.addToStock(clarinet);
        shop.addToStock(drum);
        shop.addToStock(reed);
    }

    @Test
    public void canAddStock(){
        assertEquals(4,shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        shop.removeFromStock(reed);
        assertEquals(3,shop.getStock().size());
    }

    @Test
    public void canGetAverageMarkup(){
        assertEquals(687.5, shop.getAverageMarkup(),0.0);
    }
}
