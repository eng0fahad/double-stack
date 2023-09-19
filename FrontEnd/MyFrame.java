package FrontEnd;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MyFrame extends JFrame{
    private MainPanel panel = new MainPanel();

    public MyFrame(){

        this.add(panel);

       
		try{
            this.setIconImage(new ImageIcon(getClass().getResource("/imeges/d.png")).getImage());
        }catch (Exception e) {
                System.out.print("the image is not find");
        }
            
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(615,380);
        this.setTitle("double stack");
        this.setVisible(true);
    }
}