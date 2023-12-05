package ru.netology.radioservice;

public class Radio {
    private int volume;
    private int chanel;
    private int chanelAmount = 10;
    private int minChanel = 0;
    private int maxChanel = chanelAmount - 1;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int chanelAmount) {
        this.chanelAmount = chanelAmount;
    }
    public int getChanel() {
        return chanel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            return;
        }
        if (volume < minVolume) {
            return;
        }
        this.volume = volume;
    }

    public void setChanel(int chanel) {
        if (chanel > maxChanel) {
            return;
        }
        if (chanel < minChanel) {
            return;
        }
        this.chanel = chanel;
    }

    public int getChanelAmount() {
        return chanelAmount;
    }

    public void setChanelAmount(int chanelAmount) {
        this.chanelAmount = chanelAmount;
    }

    public void increaseVolume() {
        int volume = getVolume();
        if (volume < maxVolume) {
            setVolume(volume + 1);
        }
    }

    public void decreaseVolume() {
        int volume = getVolume();
        if (volume > minVolume) {
            setVolume(volume - 1);
        }
    }

    public void nextChanel() {
        int chanel = getChanel();
        if (chanel < maxChanel) {
            setChanel(chanel + 1);
        } else {
            setChanel(minChanel);
        }
    }

    public void prevChanel() {
        int chanel = getChanel();
        if (chanel > minChanel) {
            setChanel(chanel - 1);
        } else {
            setChanel(maxChanel);
        }
    }
}