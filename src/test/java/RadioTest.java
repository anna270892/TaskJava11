import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //Клиент выставляет номер радиостанции через прямое указание номера, значение 0
    @Test
    public void directIndicationOfTheNumber0() {
        Radio number = new Radio();

        number.setTheRadioStationNumber(0);

        int expected = 0; //ожидаемый
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение 1
    @Test
    public void directIndicationOfTheNumber1() {
        Radio number = new Radio();

        number.setTheRadioStationNumber(1);

        int expected = 1; //ожидаемый
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }



    //Клиент выставляет номер радиостанции через прямое указание номера, значение -1
    @Test
    public void directIndicationOfTheNumber_1() {
        Radio number = new Radio();

        number.setTheRadioStationNumber(-1);

        int expected = 0; //ожидаемый
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //Клиент выставляет номер радиостанции через прямое указание номера, значение 8
    @Test
    public void directIndicationOfTheNumber8() {
        Radio number = new Radio();

        number.setTheRadioStationNumber(8);

        int expected = 8; //ожидаемый
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение 9
    @Test
    public void directIndicationOfTheNumber9() {
        Radio number = new Radio();

        number.setTheRadioStationNumber(9);

        int expected = 9; //ожидаемый
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение 10
    @Test
    public void directIndicationOfTheNumber10() {
        Radio number = new Radio();

        number.setTheRadioStationNumber(10);

        int expected = 0; //ожидаемый
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //Клиент выставляет номер радиостанции значение 9 и нажмиает кнопку, включается 0 радиостанция
    @Test
    public void directIndicationOfTheNumber9_0() {
        Radio number = new Radio();

        number.setTheRadioStationNumber(9);

        number.buttonNext();

        int expected = 0; //ожидаемый
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }



    //Клиент выставляет номер радиостанции значение 8 и нажмиает кнопку, включается 9 радиостанция
    @Test
    public void directIndicationOfTheNumber_8() {
        Radio number = new Radio();

        number.setTheRadioStationNumber(8);

        number.buttonNext();

        int expected = 9; //ожидаемый
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    //Клиент выставляет номер радиостанции значение 0 и нажмиает кнопку, включается 9 радиостанция
    @Test
    public void directIndicationOfTheNumber0_9() {
        Radio number = new Radio();

        number.setTheRadioStationNumber(0);

        number.buttonPrev();

        int expected = 9; //ожидаемый
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


    //Клиент выставляет номер радиостанции значение 1 и нажмиает кнопку, включается 0 радиостанция
    @Test
    public void directIndicationOfTheNumber1_0() {
        Radio number = new Radio();

        number.setTheRadioStationNumber(1);

        number.buttonPrev();

        int expected = 0; //ожидаемый
        int actual = number.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }


}
