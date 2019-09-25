package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void afterPropertiesSet () throws Exception {
        System.out.println("After properties are set : " + message);
    }

    @Override
    public void destroy () throws Exception
    {
        System.out.println("Destroyed");
    }

    public void customInit() {
        System.out.println("Custom Init called..");
    }

    public void customDestroy(){
        System.out.println("Custom Destroy called..");
    }
}
