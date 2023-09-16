public class Radio {
    private int quantityOfRadioStations = 10; //!количество радиостанций по дефолту
    private int currentRadioStationNumber; //номер текукщей радиостанции от 0 до 9
    private int minNumberRadioStation; //минимальный номер радиостанции
    private int maxNumberRadioStation; //максимальный номер радиостанции
    private int currentVolume; //текущая громкость звука
    private int minVolume; //минимальная громкость
    private int maxVolume = 100; //максимальная громкость


    public int getQuantityOfRadioStations() {
        return quantityOfRadioStations;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //Конструктор
    public Radio(int quantityOfRadioStations) {
        this.maxNumberRadioStation = quantityOfRadioStations - 1;
    }

    //Конструктор
    public Radio() {
        this.quantityOfRadioStations = quantityOfRadioStations;
    }

    //Клиент выставляет номер радиостанции через прямое указание номера
    public void setTheRadioStationNumber(int newTheRadioStationNumber) {
        if (newTheRadioStationNumber < minNumberRadioStation) {
            return;
        }
        if (newTheRadioStationNumber > maxNumberRadioStation) {
            return;
        }
        currentRadioStationNumber = newTheRadioStationNumber;
    }

    //клиент прибавляет/убавляет звук, если
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            currentVolume = newCurrentVolume;
        }
        if (newCurrentVolume > maxVolume) {
            currentVolume = newCurrentVolume;
        }
        currentVolume = newCurrentVolume;
    }


    //Клиент выставляет номер радиостанции значение 4 и нажмиает кнопку, включается 0 радиостанция, иначе следующая радиостанция
    public void buttonNext() {
        if (currentRadioStationNumber == maxNumberRadioStation) {
            currentRadioStationNumber = minNumberRadioStation;
        } else {
            currentRadioStationNumber++;
        }
    }

    //Клиент выставляет номер радиостанции значение 0 и нажмиает кнопку Prev, включается 4 радиостанция, иначе предыдущая радиостанция
    public void buttonPrev() {
        if (currentRadioStationNumber == minNumberRadioStation) {
            currentRadioStationNumber = maxNumberRadioStation;
        } else {
            currentRadioStationNumber--;
        }
    }

    public void soundVolumeLevelMin() {
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume--;
        }
    }

    public void soundVolumeLevelMax() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume++;
        }
    }
}

