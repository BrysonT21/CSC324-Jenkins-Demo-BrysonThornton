import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// This is proving difficult, however I will prevail!
public class IntegrationTest {

    Calculator calc = new Calculator();

    @Test
    void testCombined() {
        int sum = calc.add(2, 3);
        assertEquals(20, calc.multiply(sum, 4));
    }
}
