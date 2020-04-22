import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.net.*;
import javax.imageio.*;
import java.io.*;
/***************************************************************
 * Drawing class - Project 1
 * @author - Jacquelin Jimenez
 * @version - 1 January, 25,2020
 **************************************************************/
public class Drawing extends JPanel{
    public static void main(String[] a) {
        JFrame f = new JFrame();
        f.setContentPane(new Drawing());
        f.setSize(600, 400);
        f.setVisible(true);
    }
    public void paintComponent(Graphics g){
        // this statement is required
        super.paintComponent(g);
        int x = 0;
        // the background color 
        setBackground(Color.LIGHT_GRAY);
        
        // boarder rectangle
        g.setColor(Color.BLACK);
        g.drawRect(10, 10, 500, 300); 
        
        // Title
        g.setColor(Color.BLACK);
        Font myFont1 = new Font("arial", Font.BOLD, 15);
        g.setFont(myFont1);
        g.drawString("Jimenez Realty CO", 180, 25);
        Font myFont3 = new Font("arial", Font.BOLD, 12);
        g.setFont(myFont3);
        g.drawString("Vintage Airstream Mobile Trailer", 165, 40);
        
        // Information about home
        Font myFont2 = new Font("arial", Font.PLAIN, 10);
        g.setFont(myFont2);

        g.drawString("Classic Chrome", 30, 70);
          g.drawString("Dimensions: 6 ft by 22 ft", 30, 90);
        g.drawString("Power: Propane Tank and Generator", 30, 110);
        g.drawString("Plumbing: Hot Water Heater", 30, 130);
       


        // birds eye view of home
        g.setColor(Color.BLACK);
        g.drawOval(x + 40, 180, 90, 70);
        g.drawOval(x + 150, 180, 90,70);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x + 80, 180, 120, 70);
        g.setColor(Color.BLACK);
        g.drawRect(x + 80, 180, 120, 70);
        g.drawLine(x + 80, 200, 130, 200);
        g.drawLine(x + 130, 200, 130, 180);
        
        // rooms in home
        g.drawString("Kitchen", x + 85, 195);
        g.drawString("WC", x + 210, 210);
        

        // Boarder embelishment
        g.setColor(Color.PINK);
        g.fillOval(30, 20, 20, 20);
         g.setColor(Color.PINK);
        g.fillOval(80, 20, 20, 20); 
         g.setColor(Color.PINK);
        g.fillOval(130, 20, 20, 20); 
         g.setColor(Color.PINK);
        g.fillOval(370, 20, 20, 20); 
         g.setColor(Color.PINK);
        g.fillOval(430, 20, 20, 20); 
         g.setColor(Color.PINK);
        g.fillOval(480, 20, 20, 20); 

        BufferedImage photo = null;
try {
File file = new File("HOME.jpg");
photo = ImageIO.read(file);
} catch (IOException e){
    g.drawString("Problem reading the file", 100, 100);
}
g.drawImage(photo, 270, 50, 225, 225, null);

        
     
    }
}
