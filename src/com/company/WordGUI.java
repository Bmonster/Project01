package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by briannuesi on 3/6/15.
 */
public class WordGUI extends JFrame {

    public TextArea text1;
    public TextArea text2;

    public WordGUI(String title, int width, int height){

        text1 = new TextArea();
        text2 = new TextArea();


        setTitle(title);
        setSize(width,height);
        add(text1);
        add(text2);

        setLayout(new GridLayout(1,2));
        setVisible(true);
        setForeground(Color.darkGray);
    }


}