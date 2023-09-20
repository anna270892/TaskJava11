import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    //Клиент выставляет номер радиостанции через прямое указание номера, значение 0
    @Test
    public void directIndicationOfTheNumber0() {
        Radio number = new Radio(5);
        number.setTheRadioStationNumber(0);
        Assertions.assertEquals(0, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение 1
    @Test
    public void directIndicationOfTheNumber1() {
        Radio number = new Radio(5);
        number.setTheRadioStationNumber(1);
        Assertions.assertEquals(1, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение -1
    @Test
    public void directIndicationOfTheNumber_1() {
        Radio number = new Radio(5);
        number.setTheRadioStationNumber(-1);
        Assertions.assertEquals(0, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение 4
    @Test
    public void directIndicationOfTheNumber4() {
        Radio number = new Radio(5);
        number.setTheRadioStationNumber(4);
        Assertions.assertEquals(4, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение 5
    @Test
    public void directIndicationOfTheNumber5() {
        Radio number = new Radio(5);
        number.setTheRadioStationNumber(5);
        Assertions.assertEquals(0, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение 3
    @Test
    public void directIndicationOfTheNumber3() {
        Radio number = new Radio(5);
        number.setTheRadioStationNumber(3);
        Assertions.assertEquals(3, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции значение 4 и нажмиает кнопку Next, включается 0 радиостанция
    @Test
    public void directIndicationOfTheNumber4_0() {
        Radio number = new Radio(5);
        number.setTheRadioStationNumber(4);
        number.buttonNext();
        Assertions.assertEquals(0, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции значение 3 и нажмиает кнопку Next, включается 4 радиостанция
    @Test
    public void directIndicationOfTheNumber3_4() {
        Radio number = new Radio(5);
        number.setTheRadioStationNumber(3);
        number.buttonNext();
        Assertions.assertEquals(4, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции значение 0 и нажмиает кнопку Prev, включается 4 радиостанция
    @Test
    public void directIndicationOfTheNumber0_4() {
        Radio number = new Radio(5);
        number.setTheRadioStationNumber(0);
        number.buttonPrev();
        Assertions.assertEquals(4, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции значение 1 и нажмиает кнопку Prev, включается 0 радиостанция
    @Test
    public void directIndicationOfTheNumber1_0() {
        Radio number = new Radio(5);
        number.setTheRadioStationNumber(1);
        number.buttonPrev();
        Assertions.assertEquals(0, number.getCurrentRadioStationNumber());
    }


    //Клиент уменьшает звук если текущий звук 0
    @Test
    public void increasingVolume0() {
        Radio volume = new Radio(5);
        volume.setCurrentVolume(0);
        volume.soundVolumeLevelMin();
        Assertions.assertEquals(0, volume.getCurrentVolume());
    }


    //Клиент уменьшает звук если текущий звук 1
    @Test
    public void increasingVolume1() {
        Radio volume = new Radio(5);
        volume.setCurrentVolume(1);
        volume.soundVolumeLevelMin();
        Assertions.assertEquals(0, volume.getCurrentVolume());
    }


    //Клиент уменьшает звук если текущий звук -1
    @Test
    public void increasingVolume_1() {
        Radio volume = new Radio(5);
        volume.setCurrentVolume(-1);
        volume.soundVolumeLevelMin();
        Assertions.assertEquals(-2, volume.getCurrentVolume());
    }


    //Клиент уменьшает звук если текущий звук 100
    @Test
    public void increasingVolume100() {
        Radio volume = new Radio(5);
        volume.setCurrentVolume(100);
        volume.soundVolumeLevelMin();
        Assertions.assertEquals(99, volume.getCurrentVolume());
    }


    //Клиент уменьшает звук если текущий звук 102
    @Test
    public void increasingVolume102() {
        Radio volume = new Radio(5);
        volume.setCurrentVolume(102);
        volume.soundVolumeLevelMin();
        Assertions.assertEquals(101, volume.getCurrentVolume());
    }


    //Клиент прибавляет звук если текущий звук 100
    @Test
    public void increasingVolume_100() {
        Radio volume = new Radio(5);
        volume.setCurrentVolume(100);
        volume.soundVolumeLevelMax();
        Assertions.assertEquals(100, volume.getCurrentVolume());
    }


    //Клиент прибавляет звук если текущий звук 99
    @Test
    public void increasingVolume_99() {
        Radio volume = new Radio(5);
        volume.setCurrentVolume(99);
        volume.soundVolumeLevelMax();
        Assertions.assertEquals(100, volume.getCurrentVolume());
    }


    //Клиент прибавляет звук если текущий звук 0
    @Test
    public void increasingVolume_0() {
        Radio volume = new Radio(5);
        volume.setCurrentVolume(0);
        volume.soundVolumeLevelMax();
        Assertions.assertEquals(1, volume.getCurrentVolume());
    }


    //проверим: если пользователь нашего класса не захотел указывать количество радиостанций, мы бы выставили их количество в 10 штук (по дефолту)
    @Test
    public void directIndicationOfTheNumberDefault() {
        Radio number = new Radio();
        Assertions.assertEquals(10, number.getQuantityOfRadioStations());
    }


    //ТЕСТЫ БЕЗ УКАЗАНИЯ КОЛИЧЕСТВА РАДИОСТАНЦИЙ
    //Клиент выставляет номер радиостанции через прямое указание номера, значение 0
    @Test
    public void directIndicationOfTheNumberDef0() {
        Radio number = new Radio();
        number.setTheRadioStationNumber(0);
        Assertions.assertEquals(0, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение 1
    @Test
    public void directIndicationOfTheNumberDef1() {
        Radio number = new Radio();
        number.setTheRadioStationNumber(1);
        Assertions.assertEquals(1, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение -1
    @Test
    public void directIndicationOfTheNumberDef_1() {
        Radio number = new Radio();
        number.setTheRadioStationNumber(-1);
        Assertions.assertEquals(0, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение 9
    @Test
    public void directIndicationOfTheNumberDef4() {
        Radio number = new Radio();
        number.setTheRadioStationNumber(9);
        Assertions.assertEquals(9, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение 10
    @Test
    public void directIndicationOfTheNumberDef5() {
        Radio number = new Radio();
        number.setTheRadioStationNumber(10);
        Assertions.assertEquals(0, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции через прямое указание номера, значение 8
    @Test
    public void directIndicationOfTheNumberDef3() {
        Radio number = new Radio();
        number.setTheRadioStationNumber(8);
        Assertions.assertEquals(8, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции значение 9 и нажмиает кнопку Next, включается 0 радиостанция
    @Test
    public void directIndicationOfTheNumberDef4_0() {
        Radio number = new Radio();
        number.setTheRadioStationNumber(9);
        number.buttonNext();
        Assertions.assertEquals(0, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции значение 8 и нажмиает кнопку Next, включается 9 радиостанция
    @Test
    public void directIndicationOfTheNumberDef3_4() {
        Radio number = new Radio();
        number.setTheRadioStationNumber(8);
        number.buttonNext();
        Assertions.assertEquals(9, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции значение 0 и нажмиает кнопку Prev, включается 4 радиостанция
    @Test
    public void directIndicationOfTheNumberDef0_4() {
        Radio number = new Radio();
        number.setTheRadioStationNumber(0);
        number.buttonPrev();
        Assertions.assertEquals(9, number.getCurrentRadioStationNumber());
    }


    //Клиент выставляет номер радиостанции значение 1 и нажмиает кнопку Prev, включается 0 радиостанция
    @Test
    public void directIndicationOfTheNumberDef1_0() {
        Radio number = new Radio();
        number.setTheRadioStationNumber(1);
        number.buttonPrev();
        Assertions.assertEquals(0, number.getCurrentRadioStationNumber());
    }


    //Клиент уменьшает звук если текущий звук 0
    @Test
    public void increasingVolumeDef0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.soundVolumeLevelMin();
        Assertions.assertEquals(0, volume.getCurrentVolume());
    }


    //Клиент уменьшает звук если текущий звук 1
    @Test
    public void increasingVolumeDef1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.soundVolumeLevelMin();
        Assertions.assertEquals(0, volume.getCurrentVolume());
    }


    //Клиент уменьшает звук если текущий звук -1
    @Test
    public void increasingVolumeDef_1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        volume.soundVolumeLevelMin();
        Assertions.assertEquals(-2, volume.getCurrentVolume());
    }


    //Клиент уменьшает звук если текущий звук 100
    @Test
    public void increasingVolumeDef100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.soundVolumeLevelMin();
        Assertions.assertEquals(99, volume.getCurrentVolume());
    }


    //Клиент уменьшает звук если текущий звук 102
    @Test
    public void increasingVolumeDef102() {
        Radio volume = new Radio();
        volume.setCurrentVolume(102);
        volume.soundVolumeLevelMin();
        Assertions.assertEquals(101, volume.getCurrentVolume());
    }


    //Клиент прибавляет звук если текущий звук 100
    @Test
    public void increasingVolumeDef_100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.soundVolumeLevelMax();
        Assertions.assertEquals(100, volume.getCurrentVolume());
    }


    //Клиент прибавляет звук если текущий звук 99
    @Test
    public void increasingVolumeDef_99() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.soundVolumeLevelMax();
        Assertions.assertEquals(100, volume.getCurrentVolume());
    }


    //Клиент прибавляет звук если текущий звук 0
    @Test
    public void increasingVolumeDef_0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.soundVolumeLevelMax();
        Assertions.assertEquals(1, volume.getCurrentVolume());
    }
}

