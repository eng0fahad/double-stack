package FrontEnd;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;


public class MyButton extends JButton{


    public MyButton(String a,Color color){
        super(a);
        this.setBackground(color);
        this.setForeground(Color.BLACK);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

    }
    
}
