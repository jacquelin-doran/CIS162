
/**
 * Write a description of class TestCar here.
 *
 * @author (Jacquelin)
 * @version (2/18/2020)
 */
public class TestCar
{
public static void main(String [] args){
  Car yourCar = new Car("Nissan", "Pathfinder", 2015, 20.0);
  Car myCar = new Car("Ford", "Escape", 2002, 20.0);
 
  myCar.simulateMultiCityTrip(100);
  System.out.println(myCar.getMake());
  System.out.println(myCar.getModel());
  System.out.println(myCar.getYear());
  
 
  

}
}
