package Project;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Color;

public class CakeFlavours extends JFrame implements ActionListener{
     JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    CakeFlavours(){
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                new Bill();
            }
        });
        getContentPane().setBackground(new Color(210, 180, 140)); 

     setTitle("Cake flavours");
     setSize(500,500);
     setLayout(new GridLayout(5,2));
     btn1 =new JButton("cadburycake");
    
btn1.setHorizontalTextPosition(JButton.CENTER);
btn1.setVerticalTextPosition(JButton.BOTTOM);
btn1.setBackground(new Color(139, 69, 19));   // chocolate brown
 
      btn2 =new JButton("Red velvet cake");
      btn2.setHorizontalTextPosition(JButton.CENTER);
      btn2.setVerticalTextPosition(JButton.BOTTOM);
btn2.setBackground(new Color(255, 182, 193)); // red velvet pink


      btn3 =new JButton("Cheesecake"); 
      btn3.setHorizontalTextPosition(JButton.CENTER);
      btn3.setVerticalTextPosition(JButton.BOTTOM);
      btn3.setBackground(new Color(255, 248, 220)); // creamy cheesecake

      btn4 =new JButton("Banana cake");
       btn4.setHorizontalTextPosition(JButton.CENTER);
      btn4.setVerticalTextPosition(JButton.BOTTOM);
      btn4.setBackground(new Color(255, 228, 181)); // banana tone


      btn5 =new JButton("Black forest cake");
       btn5.setHorizontalTextPosition(JButton.CENTER);
      btn5.setVerticalTextPosition(JButton.BOTTOM);
      btn5.setBackground(new Color(165, 42, 42));   // dark chocolate


      btn6 =new JButton("Chocolate cake");
       btn6.setHorizontalTextPosition(JButton.CENTER);
      btn6.setVerticalTextPosition(JButton.BOTTOM);
      btn6.setBackground(new Color(210, 105, 30));  // chocolate


      btn7 =new JButton("Coffee cake");
       btn7.setHorizontalTextPosition(JButton.CENTER);
      btn7.setVerticalTextPosition(JButton.BOTTOM);
      btn7.setBackground(new Color(111, 78, 55));   // coffee brown


      btn8 =new JButton("vanilla cake");
       btn8.setHorizontalTextPosition(JButton.CENTER);
      btn8.setVerticalTextPosition(JButton.BOTTOM);
      btn8.setBackground(new Color(255, 239, 213)); // vanilla cream


      btn9 =new JButton("Sponge cake");
       btn9.setHorizontalTextPosition(JButton.CENTER);
      btn9.setVerticalTextPosition(JButton.BOTTOM);
      btn9.setBackground(new Color(245, 245, 245)); // sponge light


      btn10 =new JButton("Butter cake");
       btn10.setHorizontalTextPosition(JButton.CENTER);
      btn10.setVerticalTextPosition(JButton.BOTTOM);
      btn10.setBackground(new Color(255, 222, 173)); // butter tone


       btn1.addActionListener(this); btn2.addActionListener(this); btn3.addActionListener(this); 
       btn4.addActionListener(this); btn5.addActionListener(this); btn6.addActionListener(this);
        btn7.addActionListener(this); btn8.addActionListener(this); btn9.addActionListener(this);
        btn10.addActionListener(this);
      add(btn1); add(btn2); add(btn3);add(btn4);add(btn5);add(btn6); add(btn7); add(btn8);
       add(btn9);add(btn10);
     
     setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn1){
JOptionPane.showMessageDialog(this,
        "Price: 2500\nReview: Best for chocolate lovers!");
}        

        else if(e.getSource()==btn2){
JOptionPane.showMessageDialog(this,
        "Price: 2300\nReview: Best for chocolate haters!");        }
       
else if(e.getSource()==btn3){
    JOptionPane.showMessageDialog(this,
        "Price: 2000\nReview: Creamy and rich taste!");
}
else if(e.getSource()==btn4){
    JOptionPane.showMessageDialog(this,
        "Price: 1500\nReview: Soft and fruity flavor!");
}
else if(e.getSource()==btn5){
    JOptionPane.showMessageDialog(this,
        "Price: 2700\nReview: Classic chocolate and cherry combo!");
}
else if(e.getSource()==btn6){
    JOptionPane.showMessageDialog(this,
        "Price: 2200\nReview: Perfect for chocolate lovers!");
}
else if(e.getSource()==btn7){
    JOptionPane.showMessageDialog(this,
        "Price: 1800\nReview: Strong coffee flavor with soft texture!");
}
else if(e.getSource()==btn8){
    JOptionPane.showMessageDialog(this,
        "Price: 3000\nReview: Cold, creamy and refreshing!");
}
else if(e.getSource()==btn9){
    JOptionPane.showMessageDialog(this,
        "Price: 1400\nReview: Light and fluffy texture!");
}
else if(e.getSource()==btn10){
    JOptionPane.showMessageDialog(this,
        "Price: 1600\nReview: Rich buttery taste and soft crumb!");
}     
     }

    
}

