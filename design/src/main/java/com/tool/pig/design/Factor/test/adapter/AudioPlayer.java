package com.tool.pig.design.Factor.test.adapter;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String playType, String fileName) {
        //以前的类只能满足播放MP3
        if(playType.equalsIgnoreCase("MP3")){
            System.out.printf("播放MP3,文件名字是"+fileName+"\n");
        }
        //加一个适配器，使满足可以播放MP4,VLC等
        else if(playType.equalsIgnoreCase("MP4")||playType.equalsIgnoreCase("VLC")){
            MediaAdapter adapter = new MediaAdapter(playType);
            adapter.play(playType,fileName);
        }else{
            System.out.println("暂不支持你播放的"+
                    playType + "格式文件"+"\n");
        }
    }
}
