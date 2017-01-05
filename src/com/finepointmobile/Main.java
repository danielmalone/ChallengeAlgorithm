package com.finepointmobile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String[] words = new String[number];

        for (int i = 0; i < number; i++) {
            words[i] = scanner.next();
        }

        for (String word : words) {
            char[] firstArray = new char[word.length()];
            String even = "";
            String odd = "";
            for (int i = 0; i < word.length(); i++) {
                firstArray[i] = word.charAt(i);
                if (i % 2 == 0) {
                    even += firstArray[i];
                } else {
                    odd += firstArray[i];
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
