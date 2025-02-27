package edu.luke.methods;

public class SmartTv {
    boolean power = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        power = true;
    }

    public void turnOff() {
        power = false;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void changeVolume(int newVolume) {
        volume = newVolume;
    }

    public void showStatus() {
        System.out.println(power ? "TV ligada" : "TV desligada");
        System.out.println("Canal atual: " + channel);
        System.out.println("Volume atual: " + volume);
    }
}
