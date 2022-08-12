
import com.exalt.company.StringCalculatorKata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorKataTest {

    @Test
    void should_return_sum_when_two_numbers_are_in_string() {
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        int sum = stringCalculatorKata.add("1;2");
        assertEquals(3, sum);
    }

    @Test
    void should_return_0_when_string_is_empty() {
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        int sum = stringCalculatorKata.add("");
        assertEquals(0, sum);
    }

    @Test
    void should_return_sum_when_three_numbers_are_in_string() {
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        int sum = stringCalculatorKata.add("1;2;3");
        assertEquals(6, sum);
    }
}
