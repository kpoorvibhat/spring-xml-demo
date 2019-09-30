package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanLifecycleDemoBean lifecycleDemoBean = context.getBean("lifecycle", BeanLifecycleDemoBean.class);
        System.out.println(lifecycleDemoBean);
        context.close();
    }
}
