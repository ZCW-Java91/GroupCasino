package com.github.zipcodewilmington.casino.games.gamblingGames.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer {

    private int bet;
    private int balance;

    public SlotsPlayer(){

    }

    public SlotsPlayer(int balance){
        this.balance = balance;

    }

    public void setBet(int bet){
        this.bet = bet;

    }

    public int getBet(){
        return bet;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void getArcadeAccount(){

    }

}