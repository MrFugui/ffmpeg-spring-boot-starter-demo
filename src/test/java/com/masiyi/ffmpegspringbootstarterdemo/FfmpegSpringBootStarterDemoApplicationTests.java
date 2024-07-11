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

}
