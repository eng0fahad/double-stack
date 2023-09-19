package BackEnd;

import FrontEnd.MyFrame;

/**
 * main
 */
public class MainMethod {


    public static ColorStack getStack(){
        return stack ;
    }

    static ColorStack stack = new ColorStack(10);
    public static void main(String[] args){

        MyFrame frame = new MyFrame();

    }
}