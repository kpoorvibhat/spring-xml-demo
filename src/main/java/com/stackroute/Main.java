package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans"));
        System.out.println("Beans Loaded Using XmlBeanFactory");
        Movie movie1 = factory.getBean("movie1", Movie.class);
        Movie movie4 = factory.getBean("movie4", Movie.class);
        movie1.movieInfo();
        System.out.println(movie1==movie4);
        System.out.println();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans");
        System.out.println("Beans Loaded Using ApplicationContext");
        Movie movie2 = context.getBean("movie2", Movie.class);
        Movie movieCompare = context.getBean("movie2", Movie.class);

        Movie movie3 = context.getBean("movie3", Movie.class);
        Movie movie5 = context.getBean("movie3", Movie.class);

        movie2.movieInfo();
        movie3.movieInfo();
        //prototype returns false
        System.out.println(movie2==movieCompare);
        //singleton returns true
        System.out.println(movie3==movie5);
        System.out.println();

    }
}
