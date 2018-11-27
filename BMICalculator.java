/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;
import java.util.Scanner;
/**
 *
 * @author sstev
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);           // initialize and declare scanner input.
        
        String firstName; // initialize variable for  first name
        String lastName; // initialize variable for last name
        int height; // initialize variable for height
        double weight; //initialize variable for weight
        double BMI; // initialize variable for BMI
        int feet;  // initialize for displaying feet
        int remainingInches; //initiazing for displaying inches remaining
        
        System.out.print("What is your first name? ");    //prompt user for first name input
        firstName = input.nextLine();                    // declare first name variable
        System.out.print("What is your last name? ");    // prompt user for last name input
        lastName = input.nextLine();                     // declare last name variable
        System.out.print("What is your height in inches? "); // prompt user for height.
        height = input.nextInt();                            // deolare height value
        System.out.print("What is your weight in pounds? "); // prompt user for weight.
        weight = input.nextDouble();                         // declare weight value
         
        BMI = weight / (height * height) * 703;   // calculate BMI 
        feet = height/12;     // convert height to feet
        remainingInches = feet%12; 
        
        System.out.println("Name: " + firstName + " " + lastName);  // display full name
        System.out.println("Height: " + feet + " feet " + remainingInches + " inches " );      // display height
        System.out.println("Weight: " + weight + " pounds.");       // display weight
        System.out.print("BMI: ");                         // display BMI category
        
        if (BMI <= 18.5){                                         // check & display if user is underweight
            System.out.println("You are underweight. ");
        } else if (BMI <= 24.9 && BMI >= 18.6 ) {                 // check & display if user is at normal weight. 
            System.out.println("You are at normal weight. ");
        } else if (BMI >= 25 && BMI <= 29.9) {                    // check & display if user is overweight. 
            System.out.println("You are overweight. ");
        } else if (BMI >= 30){                                    // check & display if user is obese.
            System.out.println("You are obese. ");
        }
            
        
    }
    
}
