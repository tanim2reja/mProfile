package com.jolpai.mprofile.view;

/**
 * Created by User on 11/12/2017.
 */

public class Motor {

    private int rpm;

    public Motor() {
        this.rpm = 10;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value) {
        rpm = rpm + value;
    }

    public void brake() {
        rpm = 0;
    }
}
