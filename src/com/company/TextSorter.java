package com.company;

import java.util.*;
/**
 * Created by briannuesi on 3/6/15.
 */
public class TextSorter {


    public TextFileInput reader;

    public TextSorter(String textFileLocation){

        reader = new TextFileInput(textFileLocation);


    }


    public List<String> getWords() {

        String currentLine;
        List<String> words = new ArrayList<String>();

        while ((currentLine = reader.readLine()) != null) {

            String[] x  = currentLine.split(",");

            for(int c = 0; c < x.length; c++) {
                words.add(x[c]);
            }
        }
        return words;
    }


    public List<String> alphabetize(List<String> currentColumn){

        List<String> words =  currentColumn;

        for (int p = 1; p < currentColumn.size() ; p++) {

            String currentWord  = currentColumn.get(p);
            String previousWord = currentColumn.get(p - 1);

            //if compareTo < 1, then currentWord needs to be earlier in the alphabet
            if(currentWord.compareTo(previousWord) < 1){

                words.set(p - 1, currentWord);
                words.set(p,previousWord);
                p = 0;
                continue;
            }
        }

        return words;
    }
}