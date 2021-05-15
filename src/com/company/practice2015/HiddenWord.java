package com.company.practice2015;

import java.io.CharArrayReader;

public class HiddenWord {
    String hidden; // word that can be accessed across all of the methods and avoids having to use hidden as a parameter

    public HiddenWord(String word) {
        this.hidden = word;
    }

    public String getHint(String guess) {
        char[] hint = new char[hidden.length()]; // char array used vs. concatenation of String since it is easier to specify index easier

        for (int m = 0; m < hidden.length(); m++) {
            hint[m] = '*'; // default definition that all of the guesses letters are wrong
        }

        for (int i = 0; i < hidden.length(); i++) {
            if (guess.charAt(i) == this.hidden.charAt(i)) {
                hint[i] = guess.charAt(i); // if the guess letter matches the same letter in the hidden word, put that letter in hint arr
            }
        }

        for (int i = 0; i < hidden.length(); i++) { // compares each letter in the guess to each letter in the hidden word
            char current = guess.charAt(i);

            for (int j = 0; i < hidden.length(); i++) {
                if (current == hidden.charAt(j) && j != i) { // if a letter matches a letter at a different location in the hidden word, a '+' is placed in the index of the letter being compared
                    hint[i] = '+';
                }
            }
        }
        String hintFormatted = "";
        for (char c : hint) {
           hintFormatted += c; // a String is built for the char array output
        }
        return hintFormatted;
    }

    public static void main(String[] args) {
        HiddenWord word = new HiddenWord("APPLES");
        System.out.println(word.getHint("AAALAA"));
    }
}
