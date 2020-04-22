import java.text.*;
import java.util.Locale;

/**
 * Write a description of class Item here.
 *
 * Jacquelin & Cheyenne
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private String itemCode;
    
    private String description;
    
    private double price;
    
    private int inventory;
   

    /**
     * Default Constructor for objects of class Item
     */
    public Item()
    {
        // initialise instance variables
        price = 0.0;
        inventory = 10;
    }
    /**
     * Constructor for initializing the instance variables to the corresponding input parameters
     */
    public Item(String iCode, String desc, double amount, int units)
    {
        // initialise instance variables
        itemCode = iCode;
        description = desc;
        price = amount;
        inventory = units;
    }

    /***a method*/
    public String getItemCode()
    {
        // put your code here
        return itemCode;
    }
    /**a method*/
    public String getDescription()
    {
        // put your code here
        return description;
    }
    /**a method*/
    public double getPrice()
    {
        // put your code here
        return price;
    }
    /**a method*/
    public int getInventory()
    {
        // put your code here
        return inventory;
    }
    
    /***a method*/
    public void setItemCode(String iCode)
    {
        // put your code here
        itemCode = iCode;
    }
    /**a method*/
    public void setDescription(String desc)
    {
        // put your code here
        description = desc;
    }
    /**a method*/
    public void setPrice(double amount)
    {
        if(amount > 0){
         
           price = amount;
        }
    }
    /**a method*/
    public void setInventory(int units)
    {
        if(units > 0){
         
           inventory = units;
        }
        }
           
    /**a method*/
    public void addToInventory(int units)
    {
        if(units > 0){
        inventory = inventory + units;
    }
    }
    /**a method*/
    public void subtractFromInventory(int units)
    {
        if(units > 0){
        inventory = inventory - units;
    }
    }
    /**a method*/
    public String toString()
    {
        NumberFormat fmt =  
             NumberFormat.getCurrencyInstance(Locale.US);
        String T = itemCode + " " + description + " " + fmt.format(price);
        
        return T;
    }
}
