package edu.luke.methods;

public class SmartTv {
    boolean power = false;
    int channel = 1;
    int volume = 25;

    protected void turnOn() {
        power = true;
    }

    protected void turnOff() {
        power = false;
    }

    protected void changeChannel(int newChannel) {
        channel = newChannel;
    }

    protected void changeVolume(int newVolume) {
        volume = newVolume;
    }

    void showStatus() {
        System.out.println(power ? "TV ligada" : "TV desligada");
        System.out.println("Canal atual: " + channel);
        System.out.println("Volume atual: " + volume);
    }
}
