import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class removeVowelTest {
    removeVowel removevowel = new removeVowel();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeVowels() {
        String expected[]={"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
        String input[]={"India","United States","Germany","Egypt","czechoslovakia"};
        assertEquals(expected,removevowel.removeVowels(input));
    }
}