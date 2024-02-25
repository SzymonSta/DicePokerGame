package pl.sajgon;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HandDescriptorTest {

    HandDescriptor scoreCounter = new HandDescriptor();
    @Test
    void should_return_one_pare() {
        //given
        List<Dice> dices = new ArrayList<>(Arrays.asList(new Dice(1),
                new Dice(2), new Dice(2), new Dice(4),
                new Dice(5)));
        //when
        String response = scoreCounter.getHandDescription(dices);
        //then
        assertEquals(response, "One pare");
    }

    @Test
    void should_return_two_pare() {
        //given
        List<Dice> dices = new ArrayList<>(Arrays.asList(new Dice(1),
                new Dice(2), new Dice(2), new Dice(5),
                new Dice(5)));
        //when
        String response = scoreCounter.getHandDescription(dices);
        //then
        assertEquals(response, "Two pares");
    }

    @Test
    void should_return_three_of_kind() {
        //given
        List<Dice> dices = new ArrayList<>(Arrays.asList(new Dice(1),
                new Dice(2), new Dice(2), new Dice(2),
                new Dice(5)));
        //when
        String response = scoreCounter.getHandDescription(dices);
        //then
        assertEquals(response, "Three of kind");
    }
    @Test
    void should_return_four_of_kind() {
        //given
        List<Dice> dices = new ArrayList<>(Arrays.asList(new Dice(2),
                new Dice(2), new Dice(2), new Dice(2),
                new Dice(5)));
        //when
        String response = scoreCounter.getHandDescription(dices);
        //then
        assertEquals(response, "Four of kind");
    }
    @Test
    void should_return_full_house() {
        //given
        List<Dice> dices = new ArrayList<>(Arrays.asList(new Dice(5),
                new Dice(2), new Dice(2), new Dice(2),
                new Dice(5)));
        //when
        String response = scoreCounter.getHandDescription(dices);
        //then
        assertEquals(response, "Full House");
    }
    @Test
    void should_return_five_of_kind() {
        //given
        List<Dice> dices = new ArrayList<>(Arrays.asList(new Dice(5),
                new Dice(5), new Dice(5), new Dice(5),
                new Dice(5)));
        //when
        String response = scoreCounter.getHandDescription(dices);
        //then
        assertEquals(response, "Five of kind");
    }
    @Test
    void should_return_small_street() {
        //given
        List<Dice> dices = new ArrayList<>(Arrays.asList(new Dice(5),
                new Dice(2), new Dice(3), new Dice(4),
                new Dice(5)));
        //when
        String response = scoreCounter.getHandDescription(dices);
        //then
        assertEquals(response, "Small Street");
    }
    @Test
    void should_return_big_street() {
        //given
        List<Dice> dices = new ArrayList<>(Arrays.asList(new Dice(1),
                new Dice(2), new Dice(3), new Dice(4),
                new Dice(5)));
        //when
        String response = scoreCounter.getHandDescription(dices);
        //then
        assertEquals(response, "Big Street");
    }
}