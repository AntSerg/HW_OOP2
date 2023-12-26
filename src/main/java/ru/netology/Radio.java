package ru.netology;

public class Radio {
    private int numberOfStation;
    private int volume;

    private int countOfStation;

    public Radio (int countOfStation) {
        if (countOfStation > 0) {
            this.countOfStation = countOfStation;
        }
        else {
            this.countOfStation = 10;
        }
    }

    public int getCountOfStation() {
        return countOfStation;
    }

    public void setCountOfStation(int countOfStation) {
        if (countOfStation > 0) {
            this.countOfStation = countOfStation;
        }
    }

    public Radio () {
        this.countOfStation = 10;
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setNumberOfStation(int numberOfStation) {
        if (numberOfStation >= 0 & numberOfStation <= countOfStation - 1) {
            this.numberOfStation = numberOfStation;
        }
    }

    public void next () {
        if (numberOfStation < countOfStation - 1) {
            numberOfStation++;
            return;
        }
        numberOfStation = 0;
    }

    public void prev () {
        if (numberOfStation > 0) {
            numberOfStation--;
            return;
        }
        numberOfStation = countOfStation - 1;
    }

    public void increaseVolume () {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume () {
        if (volume > 0) {
            volume--;
        }
    }
}
