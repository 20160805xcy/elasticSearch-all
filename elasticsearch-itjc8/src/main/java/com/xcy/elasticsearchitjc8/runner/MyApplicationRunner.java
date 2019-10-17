package com.xcy.elasticsearchitjc8.runner;

import com.xcy.elasticsearchitjc8.controller.BaseController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 程序启动后通过ApplicationRunner处理一些事务
 */
@Component
public class MyApplicationRunner extends BaseController implements ApplicationRunner {

    @Value("${server.port}")
    private int port;

    @Override
    public void run(ApplicationArguments args) {
        logger.info("部署完成，访问地址：http://localhost:" + port);
    }
}
