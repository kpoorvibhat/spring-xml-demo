package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    private Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void movieInfo(){
        System.out.println("Movie Info");
        actor.actorInfo();
    }

}
