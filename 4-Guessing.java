package guessing;

import java.util.Scanner;

public class Guessing {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int num = (1000);
        int guess = 1;

        System.out.print("enter your number: ");
        num = scanner.nextInt();

        System.out.print("Enter your guess: ");
        guess = scanner.nextInt();

        while (true) {

            if (guess < num) {
                if (num % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }
                System.out.println("Too low, Please try again");
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
            }
            else if(guess >= 1000){
                System.out.println("Higher than 1000. Try again");
                
                System.out.println("Enter your guess: ");
                guess = scanner.nextInt();
                
            }
            else if (guess > num) {
                if (num % 2 == 0) {
                    System.out.println("The number is even.");
                } else {
                    System.out.println("The number is odd.");
                }
                System.out.println("Too high, Please try again");
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
            } else {
                System.out.println("Correct");
                break;
            }

        }
    }
}
