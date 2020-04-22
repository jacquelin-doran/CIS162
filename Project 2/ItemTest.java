
/**
 * Write a description of class ItemTest here.
 *
 *Jacquelin & Cheyenne
 * @version (a version number or a date)
 */
public class ItemTest
{
        public static void main(String [] args)    {
        // instantiating an item
        Item item1 = new Item("Item1", "GVSU t-shirt", 29.99, 100);
        System.out.println(item1);
        item1.addToInventory(3);
        item1.setPrice(500.0);
        System.out.println(item1.getPrice());
        System.out.println(item1);
        
        Item item2 = new Item("Item2", "GVSU durag", 2.99, 100);
        item2.subtractFromInventory(80);
        item2.setDescription("Velvety");
        item2.setItemCode("durag eXtreme");
        item2.setPrice(8.0);
        System.out.println(item2);
        
        
             
}

}
