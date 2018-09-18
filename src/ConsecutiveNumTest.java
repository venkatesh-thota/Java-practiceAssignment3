import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumTest {
    ConsecutiveNum consecutiveNum =new ConsecutiveNum();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void consecutiveNumCheck() {
        boolean expected=false;
        assertEquals(expected,consecutiveNum.ConsecutiveNumCheck("98,96,95,94,93"));
    }
}