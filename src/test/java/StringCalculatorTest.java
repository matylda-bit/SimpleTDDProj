
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringCalculatorTest {
    @Test
    void add_emptyString_ReturnsZero() {
        assertEquals(0, StringCalculator.add(""));
    }

}
