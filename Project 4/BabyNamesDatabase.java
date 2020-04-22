import java.util.ArrayList;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Collections;
/**
 * Write a description of class BabyNamesDatabase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BabyNamesDatabase
{
    // instance variables - replace the example below with your own
    private ArrayList<BabyName> names;

    /**
     * Constructor for objects of class BabyNamesDatabase
     */
    public BabyNamesDatabase()
    {
        names = new ArrayList<BabyName> ();

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    public void readBabyNameData(String filename){

        // Read the full set of data from a text file
        try{ 

            // open the text file and use a Scanner to read the text
            FileInputStream fileByteStream = new FileInputStream(filename);
            Scanner scnr = new Scanner(fileByteStream);
            scnr.useDelimiter("[,\r\n]+");

            // keep reading as long as there is more data
            while(scnr.hasNext()) {

                // reads each element of the record
                String name = scnr.next();
                String gender = scnr.next();
                // DONE: read the count and year

                int count = scnr.nextInt();
                int year = scnr.nextInt();

                // DONE: assign true/false to boolean isFemale based on
                // the gender String
                boolean isFemale;
                if(gender.equalsIgnoreCase("F")){
                    isFemale = true;
                }
                else{
                    isFemale = false;
                }
                // instantiates an object of the BabyName class
                BabyName babyName = new BabyName(name, isFemale, count, year); 
                //DONE: add to the ArrayList the babyName created above
                names.add(babyName);
            }
            fileByteStream.close();
        }
        catch(IOException e) {
            System.out.println("Failed to read the data file: " + filename);
        }
    }

    public int countAllNames (){
        return names.size();
    }

    public int countAllGirls(){
        int count = 0;
        for (BabyName g : names)
            if(g.isFemale() == true){ 
                count = count + g.getBabiesPerName();
            }
        return count;
    }

    public int countAllBoys(){
        int count = 0;
        for (BabyName g : names)
            if(g.isFemale() == false) 
            count = count + g.getBabiesPerName();
        return count;
    }

    public ArrayList <BabyName> searchForYear(int year){
        ArrayList <BabyName> list = new ArrayList<BabyName> ();

        for(BabyName y : names)
            if(y.getBirthYear() == year) 
                list.add(y);
        Collections.sort(list);
        return list;
    }

    public BabyName mostPopularGirl(int year){
        ArrayList <BabyName> girlList = new ArrayList<BabyName> ();
        girlList = searchForYear(year);
        int highest = 0;
        BabyName girl = new BabyName();
        for(BabyName y : girlList){
            if(y.isFemale() == true){
                if(y.getBabiesPerName() > highest){
                    highest = y.getBabiesPerName();
                    girl = y;
                }
            }
        }
        if(girl.getBirthYear() == year)
            return girl;
        else 
            return null;
    }

    public BabyName mostPopularBoy(int year){
        ArrayList <BabyName> boyList = new ArrayList<BabyName> ();
        boyList = searchForYear(year);
        int highest = 0;
        BabyName boy = new BabyName();
        for(BabyName y : boyList){
            if(y.isFemale() == false){
                if(y.getBabiesPerName() > highest){
                    highest = y.getBabiesPerName();
                    boy = y;
                }
            }
        }
        if(boy.getBirthYear() == year)
            return boy;
        else 
            return null;
    }

    public ArrayList <BabyName> searchForName(String name){
        ArrayList<BabyName> list = new ArrayList<BabyName>();
        for(BabyName y : names)
            if(y.getBabyName().equalsIgnoreCase(name))
                list.add(y);
        return list;
    }

    public ArrayList <BabyName> topTenNames(int year){
        ArrayList<BabyName> list = new ArrayList<BabyName>();
        list = searchForYear(year);

        ArrayList<BabyName> topList = new ArrayList<BabyName>();

        if(list.size() > 0){
            for(int i =0; i < 10; i++){
                topList.add(list.get(i));
            }
        }
        return topList;
    }
}
