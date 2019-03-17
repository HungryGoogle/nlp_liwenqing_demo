package com.example.textextractordemo;

import com.example.textextractordemo.nlp.MainPartExtractor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TextextractordemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TextextractordemoApplication.class, args);
        MainPartExtractor.getMainPart("服务器启动了");
    }

}
