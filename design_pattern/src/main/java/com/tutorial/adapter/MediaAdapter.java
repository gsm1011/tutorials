package com.tutorial.adapter;

public class MediaAdapter {
    private AudioPlayer audioPlayer = new AudioPlayer();
    private VlcPlayer vlcPlayer = new VlcPlayer();
    private Mp4Player mp4Player = new Mp4Player();

    private String getMediaType (String fileName) {
        int i = fileName.lastIndexOf('.');
        if (i > 0) {
            return fileName.substring(++i);
        }
        return "";
    }

    public void play(String fileName) {
        String type = getMediaType(fileName);
        if (type.equalsIgnoreCase("mp3")) {
            audioPlayer.play(fileName);
        } else if (type.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else if (type.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);
        } else {
            System.out.println("Unknown media type: " + type);
        }
    }
}
