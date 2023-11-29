package ru.netology.radioservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetChanel() {
        radio.setChanel(5);

        int expected = 5;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        radio.setVolume(50);

        int expected = 50;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        radio.setVolume(110);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelAboveMax() {
        radio.setChanel(10);

        int expected = 0;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChanelBelowMin() {
        radio.setChanel(-1);

        int expected = 0;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextChanelAsZeroIfCurrentIsNine() {
        radio.setChanel(9);
        radio.nextChanel();
        int expected = 0;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChanelAsNineIfCurrentIsZero() {
        radio.setChanel(0);
        radio.prevChanel();
        int expected = 9;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextChanel() {
        radio.setChanel(5);
        radio.nextChanel();
        int expected = 6;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChanel() {
        radio.setChanel(5);
        radio.prevChanel();
        int expected = 4;
        int actual = radio.getChanel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeBelowMin() {
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setVolume(50);
        radio.increaseVolume();
        int expected = 51;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
