package com.tool.pig.design.Factor.test.adapter;

public class VlcPlayer  implements AdvanceMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }

    @Override
    public void PlayVlc(String fileName) {
        System.out.printf("播放VLC,文件名字是"+fileName+"\n");

    }
}
