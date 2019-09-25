package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans");
        BeanLifecycleDemoBean lifecycleDemoBean = context.getBean("lifecycle", BeanLifecycleDemoBean.class);
        System.out.println(lifecycleDemoBean);
        context.close();
    }
}
