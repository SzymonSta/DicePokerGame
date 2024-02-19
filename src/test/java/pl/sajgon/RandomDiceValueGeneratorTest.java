package pl.sajgon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class RandomDiceValueGeneratorTest {
    RandomDiceValueGenerator randomDiceValueGenerator = new RandomDiceValueGenerator();

    @Test
    public void should_return_number_between_1_and_6() {
        //given
        int randomNumber;
        //when
        randomNumber = randomDiceValueGenerator.randomDiceValueGenerate();
        //then
        assertTrue((randomNumber>=1 && randomNumber<=6));
    }
}