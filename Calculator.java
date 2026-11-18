//Mari, Niel Cedrick P.   1stYrBSCOME  Programming  Sir.Gole
package com.mycompany.calculator;

import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        //Introductory splash screen
        System.out.println("==================================");
        System.out.println("        Java Calculator"); 
        System.out.println("==================================");
        System.out.println("");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Subtraction");
        System.out.println(" 3. Multiplication");
        System.out.println(" 4. Division");
        System.out.println("");
        System.out.print("Enter your desired operator: "); //The user will enter their desired operation
        byte operator = scanner.nextByte();
        System.out.println("");
        System.out.println("==================================");
        
        System.out.print("Enter your first number: "); //The first number that the user wants to input
        double firstNum = scanner.nextDouble();
        System.out.println("");
        
        System.out.print("Enter your second number: "); //The second number that the user wants to input
        double secondNum = scanner.nextDouble();
        System.out.println("");
        
        double answer;
        
        switch (operator) {
            case 1:
                answer = sum.Addition(firstNum, secondNum); //will replace parameters from the class sum
                System.out.println("Result: " + answer); //Prints results
                System.out.println("");
                System.out.println("==================================");
                break;
                
            case 2:
                answer = diff.Subtraction(firstNum, secondNum); //will replace parameters from the class diff
                System.out.println("Result: " + answer); //Prints results
                System.out.println("");
                System.out.println("==================================");
                break;
                
            case 3:
                answer = prod.Multiplication(firstNum, secondNum); //will replace parameters from the class prod
                System.out.println("Result: " + answer); //Prints results
                System.out.println("");
                System.out.println("==================================");
                break;
                
            case 4:
                if (secondNum != 0) {
                    answer = qou.Division(firstNum, secondNum); //will replace parameters from the class qou
                    System.out.println("Result: " + answer); //Prints results
                    System.out.println("");
                    System.out.println("==================================");
                } else {
                    System.out.println("Error: Division by zero is not allowed."); //handles division by zero error
                    System.out.println("");
                    System.out.println("==================================");
                }
                break;
                
            default:
                System.out.println("Invalid operator choice."); //when a user did not select a valid option
                System.out.println("");
                System.out.println("==================================");
                break;
        }

        scanner.close();
    }
}

//the end:)