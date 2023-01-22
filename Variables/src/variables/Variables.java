/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Welcome");
        System.out.println("Please enter a valid option:  ");
        System.out.println("1-Fibonacci \n2-Contador de los valores del array\n3-String to array");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if (option == 1) {
            int maxNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            Fibonacci fibo = new Fibonacci();
            fibo.calculateFibo(maxNumber);

        }else if (option==2){
            
            Arrays array= new Arrays();
            array.valueCounter();
        
        }else if (option == 3) {
            System.out.println("Please, enter a word: ");
            String word = sc.next();
            Arrays array= new Arrays();
            array.stringToArray(word);
        
        
        
        }else{
            System.out.println("Ingrese un número por debajo de 3");
        }

    }

}
