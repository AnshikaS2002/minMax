import static org.junit.jupiter.api.Assertions.assertEquals;
import org.*;
import org.junit.jupiter.api.*;

public class MyTest {
    @Test
    public void testMaxNumPos1() {
        Findmax findmax = new Findmax();
        Integer max = findmax.findmax(5, 2, 1);
        assertEquals(5, max);
    }

    @Test
    public void testMaxNumPos2() {
        Findmax findmax = new Findmax();
        Integer max = findmax.findmax(5, 15, 1);
        assertEquals(15, max);
    }

    @Test
    public void testMaxNumPos3() {
        Findmax findmax = new Findmax();
        Integer max = findmax.findmax(5, 2, 10);
        assertEquals(10, max);
    }

    @Test
    public void testMaxFloatNumPos1() {
        Findmax findmax = new Findmax();
        Float max = findmax.findmax(5.2f, 2.3f, 1.5f);
        assertEquals(5.2f, max);
    }

    @Test
    public void testMaxFloatNumPos2() {
        Findmax findmax = new Findmax();
        Float max = findmax.findmax(5.3f, 15.6f, 1.2f);
        assertEquals(15.6f, max);
    }

    @Test
    public void testMaxFloatNumPos3() {
        Findmax findmax = new Findmax();
        Float max = findmax.findmax(5.4f, 2.1f, 10.5f);
        assertEquals(10.5f, max);
    }

    @Test
    public void testMaxStringNumPos1() {
        Findmax findmax = new Findmax();
        String max = findmax.findmax("Peach", "Apple", "Banana");
        assertEquals("Peach", max);
    }

    @Test
    public void testMaxStringNumPos2() {
        Findmax findmax = new Findmax();
        String max = findmax.findmax("Apple", "Peach", "Banana");
        assertEquals("Peach", max);
    }

    @Test
    public void testMaxStringNumPos3() {
        Findmax findmax = new Findmax();
        String max = findmax.findmax("Apple", "Banana", "Peach");
        assertEquals("Peach", max);
    }

}
