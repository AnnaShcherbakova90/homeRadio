package ru.netology.radioservice;

public class Radio {
    public int chanel;
    public int volume;

    public int getChanel() {
        return chanel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 100) {
            return;
        }
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }

    public void setChanel(int chanel) {
        if (chanel > 9) {
            return;
        }
        if (chanel < 0) {
            return;
        }
        this.chanel = chanel;
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }

    public void nextChanel() {
        if (chanel < 9) {
            chanel = chanel + 1;
        } else {
            chanel = 0;
        }
    }

    public void prevChanel() {
        if (chanel > 0) {
            chanel = chanel - 1;
        } else {
            chanel = 9;
        }
    }
}
