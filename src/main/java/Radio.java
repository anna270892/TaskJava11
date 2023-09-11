public class Radio {
    private int currentRadioStationNumber; //номер текукщей радиостанции от 0 до 9
    private int soundVolume; //громкость звука

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
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
        } else {
            currentRadioStationNumber++;
        }
    }


    //Клиент выставляет номер радиостанции значение 0 и нажмиает кнопку, включается 9 радиостанция, иначе предыдущая радиостанция
    public void buttonPrev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber--;
        }
    }

    //клиент прибавляет/убавляет звук, если
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            soundVolume = newCurrentVolume;
        }
        if (newCurrentVolume > 100) {
            soundVolume = newCurrentVolume;
        }
        soundVolume = newCurrentVolume;
    }


    public void soundVolumeLevelMin() {
        if (soundVolume == 0) {
            soundVolume = 0;
        } else {
            soundVolume--;
        }
    }

    public void soundVolumeLevelMax() {
        if (soundVolume == 100) {
            soundVolume = 100;
        } else {
            soundVolume++;
        }
    }
}

