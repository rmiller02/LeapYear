package LeapYear;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
public class LeapYearTest {
    @Test
    public void returnsBooleanIfLeapYear() {
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.leapYear(1996));
        assertEquals(false, leapYear.leapYear(2001));
        assertEquals(true, leapYear.leapYear(2000));
        assertEquals(false, leapYear.leapYear(1900));
    }
}