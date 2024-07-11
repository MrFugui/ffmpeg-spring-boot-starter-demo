package com.masiyi.ffmpegspringbootstarterdemo;

import com.masiyi.ffmpeg.template.FFmpegTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FfmpegSpringBootStarterDemoApplicationTests {

    @Autowired
    private FFmpegTemplate ffmpegTemplate;
    @Test
    void convert() {
        ffmpegTemplate.convert("D:\\video.mp4","D:\\video.avi");
    }

    @Test
    void extractAudio() {
        System.out.println(ffmpegTemplate.extractAudio("D:\\video.mp4"));
    }

    @Test
    void copy() {
        ffmpegTemplate.copy("D:\\video.mp4","D:\\video.avi");
    }
    /**
     * 提取音频、字幕
     */
    @Test
    void extract() {
        ffmpegTemplate.extract("D:\\video.mp4","D:\\video.aac");
    }
    @Test
    void captureVideoFootage() {
        ffmpegTemplate.captureVideoFootage("D:\\video.mp4","D:\\cut.mp4","00:01:01","00:01:12");
    }
}
