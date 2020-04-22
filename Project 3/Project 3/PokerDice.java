import java.util.*;
/**
 * PokerDice class made to run methods of a dice game.
 *
 * @author (Jacquelin Jimenez)
 * @version (3/30/2020)
 */
public class PokerDice
{
    /**
     * Instance variables of class PokerDice
     */
    private GVdie [] dice;
    private int score = 0;
    private int numberRolls = 0;
    private int numberRounds = 0;
    private int [] counts;
    private final static int FIVE_OF_A_KIND = 50;
    private final static int FOUR_OF_A_KIND = 40;

    /**
     * Constructor for objects of class PokerDice
     */
    public PokerDice(){
        dice = new GVdie [5];
        for(int i = 0; i < dice.length; i++){
            dice[i] = new GVdie();
        }
        counts = new int [7];
        resetGame(); 
    }

    /**
     * Getter methods for objects of class PokerDice
     */

    public int getScore(){
        return score;
    }

    public int getNumRolls(){
        return numberRolls;
    }

    public int getNumRounds(){
        return numberRounds;
    }

    /**
     * Boolean methods of class PokerDice for game play.
     */
    public boolean okToRoll(){
        if(numberRolls < 3) return true;
        return false;
    }

    public boolean gameOver(){
        if(numberRounds == 7) return true;
        return false;
    }

    /**
     * A getter method for objects of class PokerDice
     */
    public GVdie [] getDice(){
        return dice;
    }

    /**
     * A method to reset the game.
     */
    public void resetGame(){
        score = 0;
        numberRolls = 0;
        numberRounds = 0;
        for(int i = 0; i < dice.length; ++i){
            dice[i].setBlank();
            dice[i].setHeld(false);
        }
    }

    /**
     * A method to return the values of the dice in a string.
     */
    public String diceToString(){
        String s = "";
        for(int i = 0; i < dice.length; ++i)
            s = s + dice [i] + ","; 

        return s;
    }

    /**
     * A method to count how many of a number on the dice was rolled.
     */
    private void tallyDice(){
        int count = 0;
        for(int i = 0; i < counts.length; ++i)
            counts [i] =  0;

        for(int i = 0; i < dice.length; ++i){
            int val = dice[i].getValue();
            counts[val] ++;

        }
    }

    /**
     * A method to see if the numbers rolled on the dice are in a numerical sequence.
     * 
     */
    private boolean hasStraight(int length){
        tallyDice();
        int count = 0;
        for(int i = 0; i < counts.length; ++i){
            if(counts[i] >= 1){ count ++;
                if(count == length) return true;
            }
            else count = 0;
        }
        return false;
    }

    /**
     * A method to see if the same number on the dice was rolled more than once.
     */
    private boolean hasMultiples(int count){
        tallyDice();
        for(int i = 0; i < counts.length; ++i){
            if(counts[i]>= count) return true;
        }   
        return false;

    } 

    /**
     * A method to see if the same number on the dice was rolled only twice.
     */
    private boolean hasStrictPair(){
        tallyDice();
        for(int i = 0; i < counts.length; i++){
            if(counts[i] == 2) return true;

        }
        return false;
    }

    /**
     * A method to set the parameters for the next round of the game.
     */
    private void nextRound(){
        numberRounds ++;
        numberRolls =0;
        for(int i = 0; i < dice.length; ++i){
            dice[i].setBlank();
            dice[i].setHeld(false);
        }
    }

    /**
     * A method that allows the user to choose what the value of the dice will be.
     */
    public void setDice(int [] values){
        for(int i = 0; i < values.length; i++){
            dice[i].roll();
            while(values[i] != dice[i].getValue()) dice[i].roll();
        }
    }

    /**
     * A method to roll the dice not held by the user.
     */
    public void rollDice(){
        for(int i = 0; i < dice.length; ++i){
            if(dice[i].isHeld() == false)
                dice[i].roll();
                
        }
        numberRolls ++;
    }

    /**
     * A method to check if the number on a dice was rolled three times.
     */
    public void checkThreeOfAKind(){
        if(hasMultiples(3) == true)
            score += 25;
        nextRound();
    }

    /**
     * A method to check if the number on a dice was rolled three times,
     * and another number rolled twice.
     */
    public void checkFullHouse(){
        if(hasMultiples(3) == true && hasStrictPair() == true 
        || hasMultiples(5)== true){
            score += 35;
        }
        nextRound();

    }

    /**
     * A method to see if the numbers rolled on the dice are in a numerical sequence of four.
     * 
     */
    public void checkSmallStraight(){
        if(hasStraight(4) == true)
            score += 30;

        nextRound();
    }

    /**
     * A method to see if the numbers rolled on the dice are in a numerical sequence of five.
     * 
     */
    public void checkLargeStraight(){
        if(hasStraight(5) == true)
            score += 45;

        nextRound();
    }

    /**
     * A method to check if the number on a dice was rolled five times.
     */
    public void checkFiveOfAKind(){
        if(hasMultiples(5) == true)
            score += FIVE_OF_A_KIND;

        nextRound();
    }

    /**
     * A method to check if the number on a dice was rolled four times.
     */
    public void checkFourOfAKind(){

        if(hasMultiples(4) == true)
            score += FOUR_OF_A_KIND;

        nextRound();
    }

    /**
     * A method to add all the dice values.
     * 
     */
    public void checkChance (){
        for(int i = 0; i < dice.length; i++){
            score += dice[i].getValue();
        }
        nextRound();
    }
}