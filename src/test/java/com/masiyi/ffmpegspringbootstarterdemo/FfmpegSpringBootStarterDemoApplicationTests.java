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
        ffmpegTemplate.extract("D:\\video1211.mp4","D:\\video.srt");
    }
    @Test
    void captureVideoFootage() {
        ffmpegTemplate.captureVideoFootage("D:\\video.mp4","D:\\cut.mp4","00:01:01","00:01:12");
    }
    @Test
    void scale() {
        ffmpegTemplate.scale("D:\\video.mp4","D:\\video11.mp4",640,480);
    }
    @Test
    void cut() {
        ffmpegTemplate.cut("D:\\video.mp4","D:\\video111.mp4",100,100,640,480);
    }

    @Test
    void setVideoPreview() {
        ffmpegTemplate.setVideoPreview("D:\\video.mp4","D:\\video1211.mp4");
    }

    @Test
    void embedSubtitle() {
        ffmpegTemplate.embedSubtitle("D:\\video.mp4","D:\\video1211.mp4","D:\\srt.srt");
    }

}
