package edu.luke.methods;

public class User {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        smartTv.showStatus();

        smartTv.turnOn();
        smartTv.changeChannel(13);
        smartTv.changeVolume(12);

        smartTv.showStatus();

    }
}
