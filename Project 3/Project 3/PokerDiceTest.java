
/**
 * PokerDiceTest used to test methods written in PokerDice.
 *
 * @author (Jacquelin)
 * @version (3/30/2020)
 */
public class PokerDiceTest
{
    public static void main () {
        final int THREE_OF_A_KIND = 25;      
        final int FOUR_OF_A_KIND = 40; 
        final int FIVE_OF_A_KIND = 50; 
        final int FULL_HOUSE = 35; 
        final int SMALL_STRAIGHT = 30;       
        final int LARGE_STRAIGHT = 45; 

        int oldScore;
        System.out.println ("Testing begings");
        PokerDice game = new PokerDice();
        

        //********** phase 1 testing ************
        // testing the constructor 
        assert game.getDice().length == 5 : "dice should be an array of five";     
        assert !game.gameOver() : "game should not be over at the beginning";
        
        game.okToRoll();

        System.out.println ("Testing ends");
        
        game.diceToString();
        
       
        
        
    }
}
 