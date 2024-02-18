package pl.sajgon;

public class Dice {

    //    RandomDiceValueGenerator randomDiceValueGenerator = new RandomDiceValueGenerator();
    int diceValue;

    public Dice(int diceValue) {
        this.diceValue = diceValue;
    }

    public int getDiceValue() {
        return diceValue;
    }

    public static Dice diceGenerator(Integer diceValue) {
        return new Dice(diceValue);
    }

    @Override
    public String toString() {
        return "[" + getDiceValue() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dice dice = (Dice) o;

        return diceValue == dice.diceValue;
    }

    @Override
    public int hashCode() {
        return diceValue;
    }
}
