import org.junit.Test;

import static org.junit.Assert.*;

public class calendarTest {
    calendar calendarday =new calendar();
    @Test
    public void getFirstDayOfWeek() {
        String expected="Mon 17/09/2018";
        assertEquals(expected,calendarday.getFirstDayOfWeek());
    }

    @Test
    public void getLastDayOfWeek() {
        String expected="Sun 23/09/2018";
        assertEquals(expected,calendarday.getLastDayOfWeek());
    }
}