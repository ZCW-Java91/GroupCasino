package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * All players of a game should abide by `PlayerInterface`.
 * All players must have reference to the `ArcadeAccount` used to log into the `Arcade` system.
 * All players are capable of `play`ing a game.
 */
public interface PlayerInterface {
CasinoAccount getArcadeAccount();

<SomeReturnType> SomeReturnType play();
}
