package pl.sajgon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandDescriptor {

    String handDescription = "Nothing highest dice is: ";
    List<Dice> bigStreet1 = new ArrayList<>(Arrays.asList(new Dice(1), new Dice(2),
            new Dice(3), new Dice(4), new Dice(5)));
    List<Dice> bigStreet2 = new ArrayList<>(Arrays.asList(new Dice(2),
            new Dice(3), new Dice(4), new Dice(5), new Dice(6)));
    List<Dice> smallStreet1 = new ArrayList<>(Arrays.asList(new Dice(1),new Dice(2),
            new Dice(3), new Dice(4)));
    List<Dice> smallStreet2 = new ArrayList<>(Arrays.asList(new Dice(2),
            new Dice(3), new Dice(4),new Dice(5)));
    List<Dice> smallStreet3 = new ArrayList<>(Arrays.asList(new Dice(3),
            new Dice(4),new Dice(5), new Dice(6)));

    public String getHandDescription (List<Dice> finalDices) {
        if(finalDices.equals(bigStreet1) || finalDices.equals(bigStreet2)){
            return "Big Street";
        }else if(isSmallStreet(finalDices)) {
            return "Small Street";
        }else if(isFiveOfKind(finalDices)) {
            return "Five of kind";
        }else if(isFourOfKind(finalDices)){
            return "Four of kind";
        }else  if (isFullHouse(finalDices)) {
            return "Full House";
        }else if(isTreeOfKind(finalDices)) {
            return "Three of kind";
        }else if(isTwoPares(finalDices)){
            return "Two pares";
        }else if(isOnePare(finalDices)){
            return "One pare";
        }
        return handDescription + highestDice(finalDices);
    }
    private boolean isOnePare(List<Dice> finalDices){
        for(int i = 1; i <= 6; i++) {
            final int temp = i;
            int numberOfKindTmp = (int)finalDices.stream()
                    .filter(s ->s.getDiceValue() == temp)
                    .count();
            if (numberOfKindTmp == 2){
                return true;
            }
        }
        return false;
    }
    private boolean isTwoPares(List<Dice> finalDices){
        int valueOfKind = 0;
        int valueOfKind2 = 0;

        for(int i = 1; i <= 6; i++) {
            final int temp = i;
            int numberOfKindTmp = (int)finalDices.stream()
                    .filter(s ->s.getDiceValue() == temp)
                    .count();
            if (numberOfKindTmp == 2 && valueOfKind == 0){
                valueOfKind = i;
            }else if (numberOfKindTmp == 2){
                valueOfKind2 = i;
            }
            if (valueOfKind !=0 && valueOfKind2 != 0){
                return true;
            }
        }
        return false;
    }
    private boolean isTreeOfKind(List<Dice> finalDices){

        for(int i = 1; i <= 6; i++) {
            final int temp = i;
            int numberOfKindTmp = (int)finalDices.stream()
                    .filter(s ->s.getDiceValue() == temp)
                    .count();
            if (numberOfKindTmp == 3)
                return true;
            }
        return false;
    }
    private boolean isFourOfKind(List<Dice> finalDices){
        for(int i = 1; i <= 6; i++) {
            final int temp = i;
            int numberOfKindTmp = (int)finalDices.stream()
                    .filter(s ->s.getDiceValue() == temp)
                    .count();
            if (numberOfKindTmp == 4)
                return true;
        }
        return false;
    }
    private boolean isFiveOfKind(List<Dice> finalDices){
        for(int i = 1; i <= 6; i++) {
            final int temp = i;
            int numberOfKindTmp = (int)finalDices.stream()
                    .filter(s ->s.getDiceValue() == temp)
                    .count();
            if (numberOfKindTmp == 5)
                return true;
        }
        return false;
    }
    private boolean isFullHouse(List<Dice> finalDices){
        int valueOfKind = 0;
        int valueOfKind2 = 0;

        for(int i = 1; i <= 6; i++) {
            final int temp = i;
            int numberOfKindTmp = (int)finalDices.stream()
                    .filter(s ->s.getDiceValue() == temp)
                    .count();
            if (numberOfKindTmp == 3 ){
                valueOfKind = i;
            }else if(numberOfKindTmp == 2){
                valueOfKind2 = i;
            }
            if (valueOfKind !=0 && valueOfKind2 != 0){
                return true;
            }
        }
        return false;
    }

    private boolean isSmallStreet(List<Dice> finalDices){
        smallStreet1.retainAll(finalDices);
        smallStreet2.retainAll(finalDices);
        smallStreet3.retainAll(finalDices);
        if(smallStreet1.size() == 4){
            return true;
        }else if(smallStreet2.size() == 4){
            return true;
        }else return smallStreet3.size() == 4;
    }

    private int highestDice(List<Dice> finalDices){
        return finalDices.get(4).getDiceValue();
    }
}
