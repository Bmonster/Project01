package com.company;

import java.util.*;

public class Main {



    public static WordGUI GUI;
    public static TextSorter TextReader;
    public static List<String> leftColumn;
    public static List<String> rightColumn;

    //Goals
    // 1) Create a GUI Object That Extends JFrame
    // 2) Reads input text file and prints it in first column
    // 3) Takes the input and sort it alphabetically and then print it in the second column

    public static void main(String[] args) {


        GUI        = new WordGUI("Project 1",1000,600);
        TextReader = new TextSorter("words.txt");

        leftColumn = TextReader.getWords();

        for (int i = 0; i < leftColumn.size() ; i++) {

            GUI.text1.append(leftColumn.get(i)+"\r\n");
        }

        rightColumn = TextReader.alphabetize(leftColumn);

        for (int p = 0; p < rightColumn.size() ; p++) {

            GUI.text2.append(rightColumn.get(p)+"\r\n");
        }


    }

}