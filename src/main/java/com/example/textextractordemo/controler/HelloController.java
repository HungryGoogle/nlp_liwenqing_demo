package com.example.textextractordemo.controler;

import com.example.textextractordemo.nlp.MainPart;
import com.example.textextractordemo.nlp.MainPartExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("hello")
    @ResponseBody
    public String Hello()
    {
        System.out.println("hello");

        testNlp();

        return "server hello ack";
    }

    private void testNlp() {
        String[] testCaseArray = {
                "我一直很喜欢你",
                "你被我喜欢",
//                "我和你跳舞",
//                "美丽又善良的你被卑微的我深深的喜欢着……",
//                "只有自信的程序员才能把握未来",
//                "主干识别可以提高检索系统的智能",
//                "这个项目的作者是hankcs",
//                "hankcs是一个无门无派的浪人",
//                "搜索hankcs可以找到我的博客",
//                "静安区体育局2013年部门决算情况说明",
//                "这类算法在有限的一段时间内终止",
        };
        for (String testCase : testCaseArray)
        {
            MainPart mp = MainPartExtractor.getMainPart(testCase);
            System.out.printf("%s\t%s\n", testCase, mp);
        }
    }
}
