import instruments.Clarinet;
import org.junit.Before;
import org.junit.Test;
import peripherals.Reed;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    private Clarinet clarinet;
    private Reed reed;

    @Before
    public void setUp(){
        clarinet = new Clarinet(200,500);
        reed = new Reed(5,25);
    }

    @Test
    public void cantPlayWithoutReed(){
        assertEquals("", clarinet.play());
    }
    @Test
    public void canPlayWithReed(){
        clarinet.addReed(reed);
        assertEquals("HORN!", clarinet.play());
    }
}
