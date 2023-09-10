public class Radio {
    int currentRadioStationNumber; //номер текукщей радиостанции от 0 до 9
    public int soundVolume; //громкость звука

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    //Клиент выставляет номер радиостанции через прямое указание номера
    public void setTheRadioStationNumber(int newTheRadioStationNumber) {
        if (newTheRadioStationNumber < 0) {
            return;
        }
        if (newTheRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newTheRadioStationNumber;
    }


    //Клиент выставляет номер радиостанции значение 9 и нажмиает кнопку, включается 0 радиостанция, иначе следующая радиостанция
    public void buttonNext() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
            return;
        } else {
            currentRadioStationNumber++;
        }

    }


    //Клиент выставляет номер радиостанции значение 0 и нажмиает кнопку, включается 9 радиостанция, иначе предыдущая радиостанция
        public void buttonPrev() {
            if (currentRadioStationNumber == 0) {
                currentRadioStationNumber = 9;
                return;
            } else {
                currentRadioStationNumber--;
            }
        }

    }

