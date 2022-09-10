package com;

public class Silent implements State{
    @Override
    public void alert() {
        System.out.println("Silent ...");
    }
}
