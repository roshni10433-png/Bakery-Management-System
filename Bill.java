package Project;

import javax.swing.*;
import java.awt.*;

public class Bill extends JFrame {
 int total = 0;
        String bill = "";
    Bill() {
        setTitle("Bill");
        setSize(400, 400);
        setLayout(new FlowLayout());

        setDefaultCloseOperation(EXIT_ON_CLOSE);

       

        while (true) {

            String item = JOptionPane.showInputDialog("Enter item (or type 'done' to finish):");

            if (item == null || item.equalsIgnoreCase("done")) {
                break;
            }

            if (item.equalsIgnoreCase("cadbury cake")) {
                total += 2500;
                bill += "Cadbury Cake - 2500<br>";
            }
            else if (item.equalsIgnoreCase("red velvet cake")) {
                total += 2300;
                bill += "Red Velvet Cake - 2300<br>";
            }
            else if (item.equalsIgnoreCase("cheesecake")) {
                total += 2000;
                bill += "Cheesecake - 2000<br>";
            }
            else if (item.equalsIgnoreCase("banana cake")) {
                total += 1500;
                bill += "Banana Cake - 1500<br>";
            }
            else if (item.equalsIgnoreCase("black forest cake")) {
                total += 2700;
                bill += "Black Forest Cake - 2700<br>";
            }
            else if (item.equalsIgnoreCase("chocolate cake")) {
                total += 2200;
                bill += "Chocolate Cake - 2200<br>";
            }
            else if (item.equalsIgnoreCase("coffee cake")) {
                total += 1800;
                bill += "Coffee Cake - 1800<br>";
            }
            else if (item.equalsIgnoreCase("vanilla cake")) {
                total += 3000;
                bill += "Vanilla Cake - 3000<br>";
            }
            else if (item.equalsIgnoreCase("sponge cake")) {
                total += 1400;
                bill += "Sponge Cake - 1400<br>";
            }
            else if (item.equalsIgnoreCase("butter cake")) {
                total += 1600;
                bill += "Butter Cake - 1600<br>";
            }
            else {
                JOptionPane.showMessageDialog(this, "Item not found!");
            }
        }

        JLabel label = new JLabel(
            "<html><h2>Your Bill</h2>" + bill + "<br><b>Total = " + total + "</b></html>"
        );

        add(label);

        setVisible(true);
    }
}