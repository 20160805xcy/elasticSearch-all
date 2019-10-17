package com.xcy.elasticsearchitjc8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xcy
 * @date 2019/10/16 17:14
 * @description
 * @since V1.0.0
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
