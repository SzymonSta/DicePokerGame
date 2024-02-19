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
        assertEquals(returnedString, "1534");
    }

    @Test
    void illegal_number_of_parameters(){
        //given
        dataReceiver.dataFromTheUser = "1, 2, 2, 4, 3, 6, 7, k";
        //when
        String returnedString = dataReceiver.dataReceivedFromTheUser(createSampleScanner(dataReceiver.dataFromTheUser));
        //then
        assertEquals(returnedString, "ERROR");
    }

    @Test
    void should_re_roll_all_dice(){
        //given
        dataReceiver.dataFromTheUser = "all";
        //when
        String returnedString = dataReceiver.dataReceivedFromTheUser(createSampleScanner(dataReceiver.dataFromTheUser));
        //then
        assertEquals(returnedString, "all");
    }
}