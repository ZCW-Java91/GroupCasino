package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.utils.IOConsole;

public class RoulettePlayer extends PlayerClass implements GamblerInterface{
    public RoulettePlayer(CasinoAccount wallet, Integer totalGamesWon, Integer totalGamesPlayed, IOConsole playerInput) {
        super(wallet, totalGamesWon, totalGamesPlayed, playerInput);
    }



    @Override
    public void makeBet(int bet) {
    }


    @Override
    public boolean validBet(int bet) {
        //return (PlayerClass.getAccBalance > bet) ;
        return true;
    }

    @Override
    public void depositPayOut(int winnings) {

    }

    @Override
    public <SomeReturnType> String play() {
        return null;
    }
}
