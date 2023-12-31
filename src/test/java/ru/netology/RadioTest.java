package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "9,9",
            "0,-1",
            "0,12"
    })
    public void setNumberOfStationTest (int expected, int stationNumber) {
        Radio radio = new Radio();

        radio.setNumberOfStation(stationNumber);
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "0,9"
    })
    public void nextNumberOfStationTest (int expected, int stationNumber) {
        Radio radio = new Radio();

        radio.setNumberOfStation(stationNumber);
        radio.next();
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "8,9",
            "9,0"
    })
    public void prevNumberOfStationTest (int expected, int stationNumber) {
        Radio radio = new Radio();

        radio.setNumberOfStation(stationNumber);
        radio.prev();
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest () {
        Radio radio = new Radio();
        for (int i = 0; i <= 100; i++) {
            radio.increaseVolume();
        }
        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeUnderDownBorder () {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeIntoBorder () {
        Radio radio = new Radio();
        radio.increaseVolume();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}