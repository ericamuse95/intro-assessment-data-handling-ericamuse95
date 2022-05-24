package com.kenzie.app;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    // In this assessment, you will be evaluated on how well you organize your code into methods 
    // as well as how well you develop methods in order to achieve the requirements. 

    //Suggested Methods: 
    // Create a countCharacter() method
    // to count how many times a specific character appears in a string
    // Characters can be letters or punctuation
    // Hint: This can be done by taking in the character as a char or as a String
    // - vowels, punctuation
    //Hint: return an int


    //Create a method that counts the number of characters in a string
    public static int countCharacter(String inputString) {

        //String noSpaces = inputString.replaceAll(" ","");
        String[] withSpaces = inputString.split("");
        String s = "";
        for (String n : withSpaces)
            s += n;
        char[] charactersInSentence = s.toCharArray();
        return charactersInSentence.length;

    }



    //Create a method to count the number of words in a string
    public static int countWords(String inputString) {
        String singleSpaces = inputString.replaceAll("  ", " ");
        String [] wordsArray = singleSpaces.replaceAll("[,.?!]", "").split(" ");
        //String[] wordsArray = singleSpaces.split(" ");
        if (wordsArray[0] == "") {
            return 0;
        }
        return wordsArray.length;

    }

    //Create a method to find the longest word in a string
    public static String longestWord(String inputString) {
        String longestWord = "";
        String [] wordsArray = inputString.replaceAll("[,.?!]", "").split(" ");
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() > longestWord.length()) {
                longestWord = wordsArray[i];
            }
        }

        return longestWord;
    }

    //Create a method to find the shortest word in a string
    public static String findShortestWord(String inputString){
        //String shortestWord = "";
        String [] wordArray = inputString.replaceAll("[,.?!]", "").split(" ");
        String first = "";

        for(String i: wordArray){
            if(i.length() > first.length()){
                first = i;
            }
        }
        String shortestWord = first;
        for(String i : wordArray){
            if(i.length() < shortestWord.length()){
                if(i.equals("")){
                    continue;
                }
                shortestWord = i;
            }
        }

        return shortestWord;
    }
    public static int countLetter(char letter, String sentence){
        int letterCount = 0;
        char fromSentence = letter;
        sentence = sentence.toLowerCase();
        String [] sentenceArray = sentence.split(" ");
        String s = "";
        for (String n:sentenceArray)
            s+=n;
        char [] charactersInSentence = s.toCharArray();

        //iterate through sentence
        //count method for vowels a e i o u including capital and lower case
        for(int i = 0; i < charactersInSentence.length; i++) {
            if (fromSentence == charactersInSentence[i]){
                letterCount++;
            }
        }
        return letterCount;





    }





    public static void main(String[] args) {

       String inputString = "Hello! Welcome to Kenzie.  My name is Robert, and I'm here with my friend Waldo.  Have you met waldo?";


        //Declare variables
        int totalA = countLetter('a', inputString);
        int totalE = countLetter('e', inputString);
        int totalI = countLetter('i', inputString);
        int totalO = countLetter('o', inputString);
        int totalU = countLetter('u', inputString);

        int totalPeriod = countLetter('.',inputString);
        int totalComma = countLetter(',',inputString);
        int totalExclamation = countLetter('!',inputString);
        int totalQuestionMark = countLetter('?',inputString);
        int totalPunctuation = totalPeriod + totalComma + totalExclamation + totalQuestionMark;

        int numCharacters = countCharacter(inputString);
        int numWords = countWords(inputString);
        String longestWord = longestWord(inputString);
        String shortestWord = findShortestWord(inputString);

        //Call your methods here in main()


        Scanner scr = new Scanner(System.in);

        System.out.println("Please enter text to analyze:");

        String testing = scr.nextLine();
        System.out.println("Total words: " + countWords(testing));
        System.out.println("The longest word: " + longestWord(testing));



        System.out.println("****Text Analyzer Program***");
        //Print out your findings to the console here
        System.out.println("Total [a]: " + totalA);
        System.out.println("Total [e]: " + totalE);
        System.out.println("Total [i]: " + totalI);
        System.out.println("Total [o]: " + totalO);
        System.out.println("Total [u]: " + totalU);
        System.out.println("Total periods: " + totalPeriod);
        System.out.println("Total commas: " + totalComma);
        System.out.println("Total exclamation points: " + totalExclamation);
        System.out.println("Total question marks: " + totalQuestionMark);
        System.out.println("Total punctuation: " + totalPunctuation);
        System.out.println("Total characters: " + numCharacters);
        System.out.println("Total words: " + numWords);
        System.out.println("The longest word: " + longestWord);
        System.out.println("The shortest word: " + shortestWord);












    }

}
