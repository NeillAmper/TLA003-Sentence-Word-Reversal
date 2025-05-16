package com.mycompany.amper_tla003;

import java.util.Scanner;
import java.util.Stack;

public class Amper_TLA003 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        System.out.print("Enter a sentence: ");
        String sentence = myObj.nextLine();

        String word = "";
        for (int i = 0; i < sentence.length(); i++) {
            String character = "" + sentence.charAt(i);
            if (!character.equals(" ")) {
                word = word + character;
            } else {
                if (!word.equals("")) {
                    stack.push(word);
                    word = "";
                }
            }
        }
        if (!word.equals("")) {
            stack.push(word);
        }

        System.out.print("Output: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            if (!stack.isEmpty()) {
                System.out.print(" ");
            }
        }
    }
}
