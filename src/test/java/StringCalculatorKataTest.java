
import com.exalt.company.StringCalculatorKata;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void should_return_sum_when_special_characters_are_in_string() {
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();
        int sum = stringCalculatorKata.add("1\n2,3");
        assertEquals(6, sum);
    }

    @Test
    void should_return_exception_when_special_parameter_is_missing() {
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();

        boolean thrown = false;
        try {
            int sum = stringCalculatorKata.add("1,\n");
        } catch (UnsupportedOperationException e) {
            thrown = true;
            assertEquals("lack one parameter",e.getMessage());
        }

        assertTrue(thrown);

    }

    @Test
    void should_return_exception_when_negative_number_passed() {
        StringCalculatorKata stringCalculatorKata = new StringCalculatorKata();

        boolean thrown = false;
        try {
            int sum = stringCalculatorKata.add("-3,-1");
        } catch (UnsupportedOperationException e) {
            thrown = true;
        }

        assertTrue(thrown);

    }
}
