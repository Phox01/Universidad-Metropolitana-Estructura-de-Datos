/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number= sc.nextInt();
        Funciones funct= new Funciones();
        boolean isPrime= funct.calculatePrimes(number);
        if (isPrime){
            System.out.println("The number " +number+" is prime");
        }
        else {
            System.out.println("The number " +number+" is not prime");
        }
    }
    
}
