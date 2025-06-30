import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/20
 * Time: 15:49
 */
public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    @DisplayName("Cộng 2 số 1 với 1")
    public void addTwoNumbers() {
        int expected = 2;
        assertEquals(expected, calculator.add(1, 1));
    }

    @Test
    @DisplayName("Cộng 2 số 11 với 1")
    public void addTwoNumbers11With1() {
        int expected = 12;
        assertEquals(expected, calculator.add(11, 1));
    }
}
