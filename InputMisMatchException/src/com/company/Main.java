package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        do{
            try {
                System.out.println("Unesite  broj: ");
                int number = input.nextInt();
                // Prikaz rezultata
                System.out.println("Uneti broj je: " + number);
                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println(ex.getMessage());
                input.nextLine();
            }
        }
        while(continueInput);
    }
}
