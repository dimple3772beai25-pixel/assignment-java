package day9;

import java.util.Scanner;

public class practical3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] answerKey = {'A','B','C','D','A','B','C','D','A','B'};
        char[] response = new char[10];

        int correct = 0;
        int incorrect = 0;
        int unattempted = 0;

        System.out.println("Enter Student Responses (A/B/C/D/X)");

        for (int i = 0; i < response.length; i++) {

            while (true) {

                System.out.print("Question " + (i + 1) + ": ");
                response[i] = Character.toUpperCase(sc.next().charAt(0));

                if (response[i] == 'A' || response[i] == 'B' || response[i] == 'C'
                        || response[i] == 'D' || response[i] == 'X') {
                    break;
                } else {
                    System.out.println("Invalid Response!");
                }
            }
        }

        for (int i = 0; i < response.length; i++) {

            if (response[i] == 'X') {
                unattempted++;
            } else if (response[i] == answerKey[i]) {
                correct++;
            } else {
                incorrect++;
            }
        }

        int score = correct;

        System.out.println("\nQUIZ RESULT");
        System.out.println("Correct Answers : " + correct);
        System.out.println("Incorrect Answers : " + incorrect);
        System.out.println("Unattempted : " + unattempted);
        System.out.println("Score : " + score);

        sc.close();
    }
}