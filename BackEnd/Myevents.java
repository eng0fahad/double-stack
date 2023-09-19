package BackEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import FrontEnd.MainPanel;

public class Myevents implements ActionListener {

    public Myevents() {}

    @Override
    public void actionPerformed(ActionEvent e) {

        int input = 0;
        if (e.getSource() == MainPanel.getRedAddBtn()) {
            try {
                input = Integer.valueOf(MainPanel.getEnterTex().getText());
                MainMethod.getStack().pushRed(input);
                MainPanel.getExeptionLab().setVisible(false);

            } catch (Exception Exception) {
                MainPanel.getExeptionLab().setVisible(true);
            }
            MainPanel.getEnterTex().setText("");
            ColorStack.printStack();
            MainPanel.getMsgLab().setText(ColorStack.getMsg());



        }else if (e.getSource() == MainPanel.getRedRemoveBtn()) {
        MainMethod.getStack().popRed();
        ColorStack.printStack();
        MainPanel.getMsgLab().setText(ColorStack.getMsg());


        }else if (e.getSource() == MainPanel.getBlueAddBtn()) {
            try {
                input = Integer.valueOf(MainPanel.getEnterTex().getText());
                MainMethod.getStack().pushBlue(input);
                MainPanel.getExeptionLab().setVisible(false);

            } catch (Exception Exception) {
                MainPanel.getExeptionLab().setVisible(true);
            }
            MainPanel.getMsgLab().setText(ColorStack.getMsg());
            MainPanel.getEnterTex().setText("");
            ColorStack.printStack();


        }else if (e.getSource() == MainPanel.getBlueRemoveBtn()){
            MainMethod.getStack().popBlue();
            ColorStack.printStack();
            MainPanel.getMsgLab().setText(ColorStack.getMsg());

        }else if(e.getSource() == MainPanel.getReturnValuesBtn()){
            ColorStack.returnVlau();
            ColorStack.printStack();
        }
            

    }

}
