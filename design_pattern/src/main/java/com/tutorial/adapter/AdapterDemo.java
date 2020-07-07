package com.tutorial.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        MediaAdapter mediaAdapter = new MediaAdapter();
        mediaAdapter.play("abc.mp3");
        mediaAdapter.play("abc.mp4");
        mediaAdapter.play("abcd.vlc");
    }
}
