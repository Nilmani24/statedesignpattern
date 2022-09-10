package com;

public class Vibration implements State{
    @Override
    public void alert() {
        System.out.println("Vibration ...");
    }
}
