package com.tool.pig.design.Factor.test.adapter;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.printf("播放MP4,文件名字是"+fileName+"\n");
    }
    @Override
    public void PlayVlc(String fileName) {
        //什么也不做。
    }
}
