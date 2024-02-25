package pl.sajgon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataReceiverTest implements SampleScanner{

    DataReceiver dataReceiver = new DataReceiver();
    @Test
    void should_eliminate_invalid_chars() {
        //given
        dataReceiver.dataFromTheUser = "1, 5,3,99,0 fs, 4";
        //when
        String returnedString = dataReceiver.dataReceivedFromTheUser(createSampleScanner(dataReceiver.dataFromTheUser));
        //then
        assertEquals("1534", returnedString);
    }

    @Test
    void illegal_number_of_parameters(){
        //given
        dataReceiver.dataFromTheUser = "1, 2, 2, 4, k, 7, 5, 6";
        //when
        String returnedString = dataReceiver.dataReceivedFromTheUser(createSampleScanner(dataReceiver.dataFromTheUser));
        //then
        assertEquals("ERROR", returnedString );
    }

    @Test
    void should_re_roll_all_dice(){
        //given
        dataReceiver.dataFromTheUser = "all";
        //when
        String returnedString = dataReceiver.dataReceivedFromTheUser(createSampleScanner(dataReceiver.dataFromTheUser));
        //then
        assertEquals("all", returnedString);
    }
}