package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

        ClassPathResource res = new ClassPathResource("beans");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        System.out.println("Beans Loaded Using XmlBeanFactory");
        Movie movie1 = factory.getBean("movie", Movie.class);
        movie1.movieInfo();
        System.out.println();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans");
        System.out.println("Beans Loaded Using ApplicationContext");
        Movie movie = context.getBean("movie", Movie.class);
        movie.movieInfo();
        System.out.println();

    }
}
