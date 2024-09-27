package com.campusdual.classroom;

public class TVRemote {

    public int channel;
    public int volume;
    public boolean on;
    private final String color;

    public TVRemote(String color) {
        this.color = color;
        this.channel = 0;
        this.volume = 0;
        this.on = false;
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        if (this.channel > 0) {
            this.channel--;
        }
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public String getColor() {
        return this.color;
    }


    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return on;
    }
}
