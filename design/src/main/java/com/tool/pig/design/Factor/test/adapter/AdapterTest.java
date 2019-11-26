package com.tool.pig.design.Factor.test.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("MP3","You`re Beautiful");
        audioPlayer.play("MP4","–°÷Ì≈Â∆Ê");
        audioPlayer.play("VLC","∫⁄√®æØ≥§");
        audioPlayer.play("XXX","ZZZZZ");
    }
}
