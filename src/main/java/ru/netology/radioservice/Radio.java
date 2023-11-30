package ru.netology.radioservice;

public class Radio {
    private int chanel;
    private int volume;

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
        int volume = getVolume();
        if (volume < 100) {
            setVolume(volume + 1);
        }
    }

    public void decreaseVolume() {
        int volume = getVolume();
        if (volume > 0) {
            setVolume(volume - 1);
        }
    }

    public void nextChanel() {
        int chanel = getChanel();
        if (chanel < 9) {
            setChanel(chanel + 1);
        } else {
            setChanel(0);
        }
    }

    public void prevChanel() {
        int chanel = getChanel();
        if (chanel > 0) {
            setChanel(chanel - 1);
        } else {
            setChanel(9);
        }
    }
}
