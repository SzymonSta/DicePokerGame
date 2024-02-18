package pl.sajgon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        DataReceiver dataReceiver = new DataReceiver();
        RandomDicesGenerator randomDicesGenerator = new RandomDicesGenerator();
        DiceReRoller diceReRoller = new DiceReRoller();

        menu.welcomeMenuPrinter();
        List<Dice> currentDices = new ArrayList<>(randomDicesGenerator.randomDicesGenerator(6));
        currentDices.sort(Comparator.comparing(Dice::getDiceValue));
        System.out.println(currentDices);
        menu.reRollMenu();
        String diceToReRoll = dataReceiver.dataReceivedFromTheUser();
        currentDices = diceReRoller.reRolledDices(currentDices, diceToReRoll);
        System.out.println("Dice after re-roll: " + currentDices);
    }
}
