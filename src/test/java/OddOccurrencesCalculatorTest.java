import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurrencesCalculatorTest {

    private OddOccurrencesCalculator calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new OddOccurrencesCalculator();
    }

    @Test
    void shouldReturnMinusOneOnEmptyArray() {
        //given
        int[] emptyArrayOfInts = {};

        //when
        int result = calculator.calculate(emptyArrayOfInts);

        //then
        assertEquals(-1, result);
    }

    @Test
    void expectToCalculateBigRandomArray() {
        //given
        Random rand = new Random();
        int[] ints = IntStream.generate(() -> rand.nextInt(1000000000))
                .limit(1000000)
                .toArray();

        //when
        int result = calculator.calculate(ints);

        //then
        assertNotEquals(-1, result);
    }

}