package ru.netology;

public class Radio {
    private int numberOfStation;
    private int volume;

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setNumberOfStation(int numberOfStation) {
        if (numberOfStation >= 0 & numberOfStation <= 9) {
            this.numberOfStation = numberOfStation;
        }
    }

    public void next () {
        if (numberOfStation < 9) {
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
        numberOfStation = 9;
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
