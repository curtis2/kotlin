package com.example.lib;

public class Player {

    enum State{
        IDLE,PLAYING,PAUSED
    }

    private State state=State.IDLE;

    public void pause(){
       switch (state){
           case IDLE:
           case PAUSED:
               //do somethings
           case PLAYING:
               break;
       }
    }


}
