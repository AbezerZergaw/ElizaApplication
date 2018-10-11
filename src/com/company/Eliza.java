package com.company;

import java.util.Scanner;


public class Eliza {


    public void response() {


        Scanner input = new Scanner(System.in);

        String quit = "I am feeling great.";
        String question;
        String sentence;
        do {
            String[] word = {"Hello!",
                    "Hi!",
                    "Good morning!", "Good afternoon!","Good Evening!"};
            int length = word.length;
            int rand = (int) (Math.random() * length);
            System.out.print(word[rand] + " How can I help you today?\n");
            sentence = input.nextLine();

            question(sentence);

            System.out.println("Do you have another question?Q/quit\r");
            question = input.nextLine();
        } while (!question.equalsIgnoreCase("q") && !question.equalsIgnoreCase(quit));
    }
    public static void question(String word) {
        int rand = (int) (Math.random() * 20);

        if(rand%2==0) {


            String s1 = word.replaceAll("\\bI\\b", "you").replaceAll("\\bam\\b", "are")
                    .replaceAll("\\bmy\\b", "your").replaceAll("\\bme\\b", "you");
            qualifiers();
            System.out.println(s1);
        }else

        hedges();
    }
    public static void hedges() {
        String[] hedgesWord = {"Please tell me more",
                "Many of my patients tell me the same thing",
                "It is getting late, maybe we had better quit"};

        int length = hedgesWord.length;
        int rand = (int) (Math.random() * length);
        System.out.print(hedgesWord[rand] + " " + "\n");
    }
    public static void qualifiers() {
        String[] word = {"Why do you say that",
                "You seem to think that",
                "So, you are concerned that"};
        int length = word.length;
        int rand = (int) (Math.random() * length);
        System.out.print(word[rand] + " ");

    }

}
