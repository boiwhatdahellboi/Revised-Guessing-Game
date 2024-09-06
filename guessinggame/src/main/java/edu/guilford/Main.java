package edu.guilford;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   
    //     Scanner myScan = new Scanner(System.in); // creates scanner

    //     System.out.println("Tests whether integer is even."); 

    //     System.out.print("Input value: "); // use print so it's on same line
    //     int value = myScan.nextInt();        // inputs value as int

    //     String output = new String(""); // create empty output

    //     if (value % 2 == 0) {                   // % calculates remainder on dividing
    //         output = value + " is even.";
    //     } else if (value % 2 == 1) {            // only happens if value % 2 != 0
    //         output = value + " is odd.";        
    //     } else {                                // as 0 and 1 are only possibilities...
    //         output = "This shouldn't happen.";
    //     }
    //                                             // it's considered good form to minimize
    //     System.out.println(output);             // repetitious output statements

    //     int product = 1;                        // if value is 1 or 0, value! = 1
    //     int counter = value;                    // used to count down to 1

    //     while (counter > 1) {                   // code is only evaluated when counter > 1
    //         product *= counter;
    //         counter--;                          // counter should be decreased in the loop
    //     }                                       // loop repeats if we still have counter > 1

    //     System.out.println(value + "! = " + product);   // outputs result
        int value = 0; //initializes value to 0
        int guess = 10; //initializes guess to 10
        while (guess != value) { //code is only evaluted when guess not equal to the integer
        Random rand = new Random();
        value = rand.nextInt(1,10); //picks a random number between 1 to 10
        System.out.println(value);  //prints value
        Scanner myScan = new Scanner(System.in); //creates scanner
        System.out.println("Guess an integer from 1 to 10");  //prints a question
        guess = myScan.nextInt(); //inputs value as int
        if (guess > value) //test whether guess is greater than value
        {System.out.println("The guess was too high");} //prints a question
        else if (guess < value) //test whether value is greater than guess
        {System.out.println("The guess was too low");} //prints a question
        else //test if guess and value are equal
        {System.out.println("The guess was correct");}
        }
    }
}