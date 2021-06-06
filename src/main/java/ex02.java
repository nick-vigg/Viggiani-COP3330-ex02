/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Viggiani
 */
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string?");
        String inputString = input.nextLine();
        int stringLen = inputString.length();
        String product = inputString + " has " + stringLen + " characters.";
        System.out.println(product);

    }

}
