package pl.sajgon;

import java.util.Random;

public class RandomDiceValueGenerator {
    Random random = new Random();

    int randomDiceValueGenerate(){
        return random.nextInt(1,7);
    }

}
