package com.tutorial.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // can't play mp4.
//        System.out.println("Playing mp4 file: " + fileName);
    }
}
