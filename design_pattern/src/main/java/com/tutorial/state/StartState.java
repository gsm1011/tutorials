package com.tutorial.state;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("start");
        context.setState(this);
    }

    public String toString() {
        return "Start";
    }
}
