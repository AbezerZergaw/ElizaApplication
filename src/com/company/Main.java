package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        //  System.out.println("Good Morning. How can I help you today?");

        String quit = "I am feeling great.";
        String question;
        String sentence;
        String s1 = "";


        do {

            System.out.println("Good Morning. How can I help you today?\r");

            sentence = input.nextLine();

            //  System.out.println(sentence);


            s1 = sentence.replaceAll("\\bI\\b", "you").replaceAll("\\bam\\b", "are")
                    .replaceAll("\\bmy\\b", "your").replaceAll("\\bme\\b", "you");
            randomWord();
            System.out.println(s1);

            System.out.println("Do you have another question");

            question = input.nextLine();

        } while (!question.equalsIgnoreCase("q") && !question.equalsIgnoreCase(quit));


    }


    public static void randomWord() {


        String[] word = {"Why do you say that",
                "You seem to think that", "So, you are concerned that"};


        int length = word.length;
        int rand = (int) (Math.random() * length);
        System.out.print(word[rand] + " ");


    }

}



