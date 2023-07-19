package com.github.zipcodewilmington.casino.games.slots;


import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame {

    public SlotsPlayer player;

    private String slotResult;





    public void addPlayer(SlotsPlayer player){
        this.player = player;
    }

    public String slotTurn(){
        Random rand = new Random();

        return "";
    }

    public void setSlotResult(){

    }

    public boolean winCheck(String slotResult){
        return true;
    }

    public void updateBalance(){

    }

    public void quitAsk(){

    }











}
