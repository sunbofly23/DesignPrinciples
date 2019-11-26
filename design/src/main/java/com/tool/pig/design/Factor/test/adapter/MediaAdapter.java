package com.tool.pig.design.Factor.test.adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer advanceMediaPlayer ;

    public MediaAdapter(String  audioType) {
        if(audioType.equalsIgnoreCase("MP4")){
            advanceMediaPlayer = new Mp4Player();
        }else if(audioType.equalsIgnoreCase("VLC")){
            advanceMediaPlayer  = new VlcPlayer();
        }
    }
    @Override
    public void play(String playType, String fileName) {
         if(playType.equalsIgnoreCase("MP4")){
             advanceMediaPlayer.playMp4(fileName);
         }else if(playType.equalsIgnoreCase("VLC")){
             advanceMediaPlayer.PlayVlc(fileName);
         }
    }
}
