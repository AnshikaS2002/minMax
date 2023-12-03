import static org.junit.jupiter.api.Assertions.assertEquals;
import org.*;
import org.junit.jupiter.api.*;

public class MyTest {
    @Test
    public void testMaxNumPos1() {
        Integer max = Findmax.findmax(5, 2, 1);
        assertEquals(5, max);
    }

    @Test
    public void testMaxNumPos2() {
        Integer max = Findmax.findmax(5, 15, 1);
        assertEquals(15, max);
    }

    @Test
    public void testMaxNumPos3() {
        Integer max = Findmax.findmax(5, 2, 10);
        assertEquals(10, max);
    }

    @Test
    public void testMaxFloatNumPos1() {
        Float max = Findmax.findmax(5.2f, 2.3f, 1.5f);
        assertEquals(5.2f, max);
    }

    @Test
    public void testMaxFloatNumPos2() {
        Float max = Findmax.findmax(5.3f, 15.6f, 1.2f);
        assertEquals(15.6f, max);
    }

    @Test
    public void testMaxFloatNumPos3() {
        Float max = Findmax.findmax(5.4f, 2.1f, 10.5f);
        assertEquals(10.5f, max);
    }

    @Test
    public void testMaxStringNumPos1() {
        String max = Findmax.findmax("Peach", "Apple", "Banana");
        assertEquals("Peach", max);
    }

    @Test
    public void testMaxStringNumPos2() {
        String max = Findmax.findmax("Apple", "Peach", "Banana");
        assertEquals("Peach", max);
    }

    @Test
    public void testMaxStringNumPos3() {
        String max = Findmax.findmax("Apple", "Banana", "Peach");
        assertEquals("Peach", max);
    }

    @Test
    public void testMaxInteger() {
        Findmax<Integer> maxVal = new Findmax<Integer>(4, 7, 9, 12, 14);
        Integer val = maxVal.findMax();
        assertEquals(14, val);
    }

    @Test
    public void testMaxFloat() {
        Findmax<Float> maxVal = new Findmax<Float>(4.7f, 17.5f, 9.5f, 2.4f, 4.5f);
        Float val = maxVal.findMax();
        assertEquals(17.5f, val);
    }

    @Test
    public void testMaxString() {
        Findmax<String> maxVal = new Findmax<String>("Apple", "Peach", "Banana", "Orange");
        String val = maxVal.findMax();
        assertEquals("Peach", val);
    }

}
