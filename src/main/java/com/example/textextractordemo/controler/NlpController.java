package com.example.textextractordemo.controler;

import com.example.textextractordemo.nlp.MainPart;
import com.example.textextractordemo.nlp.MainPartExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NlpController {
    @RequestMapping(value="/getMainPart1",method= RequestMethod.GET)
    @ResponseBody
    public String getMainPart1(@RequestParam("src") String src)
    {
        return testNlp(src);
    }

    private String testNlp(String src) {
        if(StringUtils.isEmpty(src)){
            return "";
        }

        MainPart mp = MainPartExtractor.getMainPart(src);
        System.out.printf("%s\t%s\n", src, mp);

        return mp.toString();
    }
}
