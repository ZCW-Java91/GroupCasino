package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GambleGameInterface;
import com.github.zipcodewilmington.casino.GamblerInterface;
import com.github.zipcodewilmington.casino.PlayerClass;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame implements GambleGameInterface {
    CasinoAccount wallet;
    IOConsole playerInput;
    SlotsPlayer playerOfSlots = new SlotsPlayer(wallet, playerInput);

    Integer [] numbersTable ;

    @Override
    public int payOutCalc(int betAmount, int payOutMult) {
        int temp = betAmount * payOutMult;
        return temp;
    }


//    public Integer[] userInput() {
//        int counter = 0;
//        String promptToPlayer = "Enter your numbers";
//        Integer[] userInput = new Integer[3];
//        for (int i = 0; i < 3; i++) {
//            System.out.println("You can enter " + counter + "numbers not higher than 100");
//            userInput[i] = playerInput.getIntegerInput(promptToPlayer);
//            counter++;
//        }return userInput();
//    }

    public Integer machineSpin() {
        int counterOfMultply = 1;
        Random rand1 = new Random(10);
        Random rand2 = new Random(10);
        Random rand3 = new Random(10);
        Random rand4 = new Random(10);
        Random rand5 = new Random(10);

        newTable.add(rand1.nextInt());
        newTable.add(rand2.nextInt());
        newTable.add(rand3.nextInt());
        newTable.add(rand4.nextInt());
        newTable.add(rand5.nextInt());

//       for (Integer num : userInput()) {
//           userInputList.add(num);
//       }
        for (int i = 0 ; i < newTable.size(); i++) {
            if (newTable.get(i).equals(newTable.get(i))) {
                counterOfMultply++;
            }
        }
        return counterOfMultply;
    }

    public boolean checkingWinningCondition () {

        if (machineSpin() > 3 ) {
            System.out.println("Congratulations! Your numbers match!!! YOU WIN" +  "\n" +
                    " Your multiplier is 3 ");
            return true;
        }  if (machineSpin() > 4 ) {
            System.out.println("Congratulations! Your numbers match!!! YOU WIN" +  "\n" +
                    " Your multiplier is 4");
            return true;
        }  if (machineSpin() > 5 ) {
            System.out.println("Congratulations! Your numbers match!!! YOU WIN" +  "\n" +
                    " Your multiplier is 5 ");
            return true;
        }
        else {System.out.println("Sorry, the numbers do not match.");
        }
        return false;
    }

    public


    ArrayList <Integer> newTable = new ArrayList<>(Arrays.asList(numbersTable));
    ArrayList <Integer>  userInputList = new ArrayList<>();
}
