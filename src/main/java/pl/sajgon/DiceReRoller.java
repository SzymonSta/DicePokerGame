package pl.sajgon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DiceReRoller {
    RandomDicesGenerator randomDicesGenerator = new RandomDicesGenerator();

    List<Dice> reRolledDices(List<Dice> diceListToReRoll, String dataInputToReRoll) {
        List<Dice> diceToReRollList = new ArrayList<>(diceListToReRoll);
        int numberOfDiceToReRoll = dataInputToReRoll.length();
        if (dataInputToReRoll.equals("All") || dataInputToReRoll.equals("ALL") ||
                dataInputToReRoll.equals("all")) {
            return randomDicesGenerator.randomDicesGenerator(6);
        } else {

            char[] reRollCharArray = dataInputToReRoll.toCharArray();
            int[] reRollInrArray = new int[reRollCharArray.length];
            List<Dice> diceToRemove = new ArrayList<>(reRollCharArray.length);
            for (int i = 0; i <= reRollCharArray.length - 1; i++) {
                reRollInrArray[i] = reRollCharArray[i] - '0';
                diceToRemove.add(new Dice(reRollInrArray[i]));
            }

            diceToReRollList.addAll(randomDicesGenerator.randomDicesGenerator(numberOfDiceToReRoll));

            for (Dice dice : diceToRemove) {
                diceToReRollList.remove(dice);
            }
            diceToReRollList.sort(Comparator.comparing(Dice::getDiceValue));
            return diceToReRollList;
        }

    }

}
