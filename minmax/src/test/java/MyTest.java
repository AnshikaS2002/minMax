import static org.junit.jupiter.api.Assertions.assertEquals;

import org.*;
import org.junit.jupiter.api.*;

public class MyTest {
    @Test
    public void testMaxNumPos1() {
        Findmax findmax = new Findmax();
        Integer max = findmax.findmaxInt(5, 2, 1);
        assertEquals(5, max);
    }

    @Test
    public void testMaxNumPos2() {
        Findmax findmax = new Findmax();
        Integer max = findmax.findmaxInt(5, 15, 1);
        assertEquals(15, max);
    }

    @Test
    public void testMaxNumPos3() {
        Findmax findmax = new Findmax();
        Integer max = findmax.findmaxInt(5, 2, 10);
        assertEquals(10, max);
    }

}
