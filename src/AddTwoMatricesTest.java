import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoMatricesTest {
    AddTwoMatrices  addTwoMatrices=new AddTwoMatrices();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sumofMatrices() {
        int rows=3;
        int columns=2;
        int matrix1[][]={{1,2},{3,4},{5,6}};
        int matrix2[][]={{9,8},{7,6},{5,4}};
        int expected[][]={{10,10},{10,10},{10,10}};
        assertEquals(expected,addTwoMatrices.SumofMatrices(rows,columns,matrix1,matrix2));
    }
}