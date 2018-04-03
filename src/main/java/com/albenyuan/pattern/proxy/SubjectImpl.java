package com.albenyuan.pattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author Alben Yuan
 * @Date 2018-04-03 10:48
 */

public class SubjectImpl implements Subject {

    private static final Logger logger = LoggerFactory.getLogger(SubjectImpl.class);

    @Override
    public void action() {
        logger.info("SubjectImpl do something");
    }
}
