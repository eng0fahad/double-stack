package BackEnd;

import java.awt.Color;
import java.util.ArrayList;

import javax.print.attribute.standard.Sides;

import FrontEnd.MainPanel;

public class ColorStack {

    private static int[] data;
    private int topRed = -1;
    private int topBlue = -1;

    private int sizeRed = 0;
    private int sizeBlue = 0;

    private int capacity;
    private static int top = -1;

    private String[] displayColor = new String[10];
    private static String msg = "Entar a number to add it in stack";

    private static ArrayList<Integer>vlauReturnArr = new ArrayList<>();
    private static ArrayList<String> colorReturnArr = new ArrayList<>();

    

    public ColorStack(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
    }

    public boolean isEmptyRed() {
        return sizeRed == 0;
    }

    public boolean isEmptyBlue() {
        return sizeBlue == 0;

    }
    // add elmant to red stack

    public void pushRed(int e) {

        if (sizeRed == capacity ) {
            msg = "red stack is full";
        } else if (top == topRed) {
            msg = e + " was added in red stack";
            topRed++;
            data[topRed] = e;
            top++;
            sizeRed++;
            displayColor[top] = "r";
            MainPanel.getDisplayLab().getThesmallLab()[top].setBackground(new Color(255,50,50));
            MainPanel.getDisplayLab().getThesmallLab()[top].setOpaque(true);
        } else {
            msg = e + " was added in red stack";
            topRed = topBlue + 1;
            data[topRed] = e;
            top++;
            sizeRed++;
            displayColor[top] = "r";
            MainPanel.getDisplayLab().getThesmallLab()[top].setBackground(new Color(255,50,50));
            MainPanel.getDisplayLab().getThesmallLab()[top].setOpaque(true);
        }
    }

    // add elmant to blue stack
    public void pushBlue(int e) {

        if (sizeBlue == capacity ) {
            msg = "Blue stack is full";
        } else if (top == topBlue) {
            msg = e + " was added in blue stack";
            topBlue++;
            data[topBlue] = e;
            top++;
            sizeBlue++;
            displayColor[top] = "b";
            MainPanel.getDisplayLab().getThesmallLab()[top].setBackground(new Color(60,60,255));
            MainPanel.getDisplayLab().getThesmallLab()[top].setOpaque(true);
        } else {
            msg = e + " was added in blue stack";
            topBlue = topRed + 1;
            data[topBlue] = e;
            top++;
            sizeBlue++;
            displayColor[top] = "b";
            MainPanel.getDisplayLab().getThesmallLab()[top].setBackground(new Color(60,60,255));
            MainPanel.getDisplayLab().getThesmallLab()[top].setOpaque(true);
        }
    }

    // remove elemant form red stack
    public int popRed() {

        if (isEmptyRed()) {
            msg = "red stack is empty";
            return 0;
         }

         if(displayColor[top].equals("r")) {
            msg = data[topRed] + " was removed from red stack";
            MainPanel.getDisplayLab().getThesmallLab()[top].setBackground(Color.gray);
            MainPanel.getDisplayLab().getThesmallLab()[top].setOpaque(true);
            colorReturnArr.add(displayColor[top]);
            vlauReturnArr.add(data[top]);
            displayColor[top] = "";
            topRed--;
            top--;
            sizeRed--;
            return 0;
        }else{
        msg = "you have to remove blue stack before red";
        return 0;
        }}
    // remove elemant form blue stack

    public int popBlue() {

        if (isEmptyBlue()) {
            msg = "blue stack is empty";
            return 0;
        }

        if (displayColor[top].equals("b")) {
            msg = data[topBlue] + " was removed from blue stack";
            MainPanel.getDisplayLab().getThesmallLab()[top].setBackground(Color.gray);
            MainPanel.getDisplayLab().getThesmallLab()[top].setOpaque(true);
            colorReturnArr.add(displayColor[top]);
            vlauReturnArr.add(data[top]);
            displayColor[top] = "";
            topBlue--;
            top--;
            sizeBlue--;
            return 0;
        }else{
        msg = "you have to remove red stack before blue";
        return 0;
        }}



    public static void printStack() {

        for (int i = 0; i < data.length; i++) {
            MainPanel.getDisplayLab().getThesmallLab()[i].setText("");
        }

        for (int i = 0; i <= top; i++) {
            MainPanel.getDisplayLab().getThesmallLab()[i].setText(data[i] + "");
        }

    }

    public static String getMsg() {
        return msg;
    }

    public ArrayList<Integer> getVlauReturnArr(){
        return vlauReturnArr ;
    }

    public ArrayList<String> getColorReturnArr(){
        return colorReturnArr ;
    }

    
    public static void returnVlau(){

        if(vlauReturnArr.isEmpty() || colorReturnArr.isEmpty()){
            return ;
        }else{
        for (int i = vlauReturnArr.size() - 2; i >= 0; i--) {

            if (colorReturnArr.get(i)=="r") {
                MainMethod.getStack().pushRed(vlauReturnArr.get(i));
            }else if (colorReturnArr.get(i)=="b") {
                MainMethod.getStack().pushBlue(vlauReturnArr.get(i));
            
        }
    }
    }
        
            vlauReturnArr.clear();
            colorReturnArr.clear();
    }


}