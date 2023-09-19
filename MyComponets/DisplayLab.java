package MyComponets;

import javax.swing.*;
import java.awt.*;

public class DisplayLab extends JLabel{
    

    private static JLabel[] theSmallLab  = new JLabel[10];


    public DisplayLab (){

        this.setLayout(new GridLayout(1,10 , 2, 0));
        this.setBackground(Color.white);
        this.setOpaque(true);

    for (int i = 0; i < theSmallLab.length; i++) {
            theSmallLab[i] = new JLabel();
            theSmallLab[i].setBackground(Color.gray);
            theSmallLab[i].setHorizontalAlignment(JLabel.CENTER);
            theSmallLab[i].setForeground(Color.white);
            theSmallLab[i].setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

            theSmallLab[i].setOpaque(true); 
            this.add(theSmallLab[i]);
        }

    
    }



    public JLabel[] getThesmallLab (){
        return theSmallLab;
    }

}
