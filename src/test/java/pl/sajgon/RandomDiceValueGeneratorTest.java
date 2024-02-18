package pl.sajgon;

import junit.framework.TestCase;

public class RandomDiceValueGeneratorTest extends TestCase {

    public void testRandomDiceValueGenerate() {
        //given
        RandomDiceValueGenerator randomDiceValueGenerator = new RandomDiceValueGenerator();
        int randomNumber;
        //when
        randomNumber = randomDiceValueGenerator.randomDiceValueGenerate();
        //then
        assertTrue((randomNumber>=1 && randomNumber<=6));
    }
}