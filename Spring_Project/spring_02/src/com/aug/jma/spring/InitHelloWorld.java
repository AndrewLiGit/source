package com.aug.jma.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor{

    @Override
    public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
        System.out.println("After Initialization: " + arg1);
        return arg0;
    }

    @Override
    public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
        System.out.println("before Initialization: " + arg1);
        return arg0;
    }

}
