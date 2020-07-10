package com.tutorial.state;

public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState start = new StartState();
        start.doAction(context);

        StopState stop = new StopState();
        stop.doAction(context);

        System.out.println("Current state: " + context.getState().toString());
    }
}
