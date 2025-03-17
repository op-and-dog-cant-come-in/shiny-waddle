package com.shinywaddle.hellospring.testproject.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.thymeleaf.util.StringUtils;

@Controller
@Slf4j
public class TestHtmlController {
    @GetMapping("/{pageName}")
    public String dynamicPage(@PathVariable String pageName) {
        if (StringUtils.isEmpty(pageName)) {
            return "html/index";
        }
        if (StringUtils.endsWith(pageName, ".html")) {
            return "html/" + pageName.substring(0, pageName.length() - 5);
        }
        return "html/" + pageName;
    }
}
