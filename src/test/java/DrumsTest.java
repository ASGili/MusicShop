import instruments.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

        private Drums drum;
        @Before
        public void setUp(){
            drum = new Drums(50,150);
        }

        @Test
        public void canPlay(){
            assertEquals("BANG!", drum.play());
        }

}
