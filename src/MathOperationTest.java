import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathOperationTest {

    @Test
    public void testAddition() {
        MathOperations math = new MathOperations();
        assertEquals(5, math.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        MathOperations math = new MathOperations();
        assertEquals(2, math.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        MathOperations math = new MathOperations();
        assertEquals(15, math.multiply(3, 5));
    }

    @Test
    public void testDivision() {
        MathOperations math = new MathOperations();
        assertEquals(4, math.divide(20, 5));
    }
}

