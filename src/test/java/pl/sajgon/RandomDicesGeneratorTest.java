package pl.sajgon;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomDicesGeneratorTest {

    RandomDicesGenerator randomDicesGenerator = new RandomDicesGenerator();
    @Test
    void should_generate_six_Dices() {
        //given
        int numberOfDiceToGenerate = 6;
        //when
        List<Dice> generatedListOfDice = randomDicesGenerator.randomDicesGenerator(numberOfDiceToGenerate);
        //then
        assertEquals(generatedListOfDice.size(), numberOfDiceToGenerate);
    }
}