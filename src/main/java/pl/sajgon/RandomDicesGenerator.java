package pl.sajgon;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class RandomDicesGenerator {

    Random random = new Random();

    List<Dice> randomDicesGenerator(int numberOfDicesToGenerate) {
        return Stream.generate(() -> Dice.diceGenerator(random.nextInt(1, 7)))
                .limit(numberOfDicesToGenerate)
                .toList();
    }


}
