package org.spring.springboot.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by pj on 2018/12/14.
 */
@Component
public class TestTask {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Scheduled(fixedRate = 30000)
    public void test(){
        logger.info("执行一次任务");
    }
}
