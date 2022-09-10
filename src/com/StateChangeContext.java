package com;

public class StateChangeContext {

    State state;

    public StateChangeContext(){
        state = new Vibration();
    }
    public void setState(State state){
        this.state = state;
    }
    public void alert(){
        state.alert();
    }
}
