package com.qi.demo.util;

import org.springframework.context.ApplicationContext;

/**
 * 单例保存ApplicationContext
 */
public class ContextUtil {
    private static ApplicationContext applicationContext;

    public static void init(ApplicationContext applicationContext) {
        ContextUtil.applicationContext = applicationContext;
    }

    public static ApplicationContext getContext() {
        return applicationContext;
    }
}
