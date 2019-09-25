package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans");
        System.out.println("Beans Loaded Using ApplicationContext");
        Movie movie1 = context.getBean("movie1", Movie.class);
        movie1.movieInfo();
        System.out.println();

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans"));
        Movie movie2 = context.getBean("movie2", Movie.class);
        movie2.movieInfo();

        movie1.setApplicationContext(context);
        movie2.setBeanFactory(factory);
        movie1.setBeanName("FirstMovie Bean");

    }
}
