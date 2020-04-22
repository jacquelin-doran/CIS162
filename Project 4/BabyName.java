import java.text.DecimalFormat;
import java.lang.*;
/**
 * This is a class to configure data about BabyNames.
 *
 * @author (Jacquelin Jimenez)
 * @version (4/7/2020)
 */
public class BabyName implements Comparable
{
    // instance variables - replace the example below with your own
    private String name;
    private boolean gender;
    private int babyPerName;
    private int birthYear;

    /**
     * Constructor for objects of class BabyName
     */
    public BabyName(String n, boolean g, int count, int y)
    {
        // initialise instance variables
        name = n;
        gender = g;
        babyPerName = count;
        birthYear = y;

    }
    
    public BabyName()
    {
        
    }
    
    
    /**
     * 
     */
    public boolean isFemale(){
        if(gender == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getBabyName(){
        return name;
    }

    public int getBabiesPerName(){
        return babyPerName;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public void setBabyName(String n){
        name = n;
    }

    public void setBabiesPerName(int count){
        babyPerName = count;
    }

    public void setBirthYear(int y){
        birthYear = y;
    }

    public String toString(){
        DecimalFormat fmt = new DecimalFormat ("###,###,###");
        return (fmt.format(babyPerName) + " named " + name + " in " + birthYear);
    }

    public int compareTo(Object other){
        BabyName b = (BabyName) other;
        return (b.babyPerName - babyPerName);
    }

    public static void main (String [] args){
        BabyName baby1 = new BabyName("Me",true,3948,2001);
        System.out.print(baby1.toString()); 
    }

}
