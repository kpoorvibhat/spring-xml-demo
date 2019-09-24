package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans");
        System.out.println("Beans Loaded Using ApplicationContext");
        Movie movie1 = context.getBean("movie1", Movie.class);
        movie1.movieInfo();
        System.out.println();

    }
}
