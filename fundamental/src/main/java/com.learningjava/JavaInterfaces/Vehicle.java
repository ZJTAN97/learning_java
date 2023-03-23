package com.learningjava.JavaInterfaces;

public interface Vehicle {

    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "Turning the alarm on";
    }

    default String turnAlarmOff() {
        return "Turning the alarm off";
    }


}
