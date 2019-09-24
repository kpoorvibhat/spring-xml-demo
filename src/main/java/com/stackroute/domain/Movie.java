package com.stackroute.domain;

public class Movie {

    Actor actor;

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void movieInfo(){
        System.out.println("Movie Info");
        actor.actorInfo();
    }

}
