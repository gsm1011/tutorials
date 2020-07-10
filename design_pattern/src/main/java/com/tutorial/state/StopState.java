package com.tutorial.state;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Stopped");
        context.setState(this);
    }

    public String toString() {
        return "Stopped";
    }
}
