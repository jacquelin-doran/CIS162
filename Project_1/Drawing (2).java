import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Drawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Drawing extends JPanel{
    private int increment = 0;
    public static void main(String[] a) {
        JFrame f = new JFrame();
        f.setContentPane(new Drawing());
        f.setSize(600, 400);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        // this statement required
        super.paintComponent(g);

        // optional: paint the background color (default is white)
        setBackground(Color.CYAN);

        
        g.setColor(Color.GRAY);
        g.fillRect(0, 200, 600, 250);
        int x = 0 + increment;
        // RED CAR
        g.setColor(Color.RED);
        g.fillRect(x+100, 180, 250, 100);
        //RED CAR TOP
        g.setColor(Color.RED);
        g.fillRect(x+150, 110, 150, 100); 
        //LEFT WINDOW
        g.setColor(Color.WHITE);
        g.fillRect(x+160, 120, 60, 60);
        //RIGHT WINDOW
        g.setColor(Color.WHITE);
        g.fillRect(x+230, 120, 60, 60);
        //LEFT TIRE
        g.setColor(Color.BLACK);
        g.fillOval(x+110, 250, 100, 100);  
        //RIGHT TIRE
        g.setColor(Color.BLACK);
        g.fillOval(x+270, 250, 100, 100); 
        
        int x2 = -100 + increment * 10;
        increment = increment + 2;
        
        // BLACK CAR
        g.setColor(Color.BLACK);
        g.fillRect(x2+300, 180, 250, 100);
        //BLACK CAR TOP
        g.setColor(Color.BLACK);
        g.fillRect(x2+350, 110, 150, 100); 
        //LEFT WINDOW
        g.setColor(Color.WHITE);
        g.fillRect(x2+360, 120, 60, 60);
        //RIGHT WINDOW
        g.setColor(Color.WHITE);
        g.fillRect(x2+430, 120, 60, 60);
        //LEFT TIRE
        g.setColor(Color.WHITE);
        g.fillOval(x2+310, 250, 100, 100);  
        //RIGHT TIRE
        g.setColor(Color.WHITE);
        g.fillOval(x2+470, 250, 100, 100);

        // THE SUN
        g.setColor(Color.YELLOW);
        g.fillOval(450, 10, 70, 50);  

        
                
    }
}

