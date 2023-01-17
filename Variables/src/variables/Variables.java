/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

import java.util.Scanner;

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
        System.out.println("1-Fibonacci \n2-\n3-String to array");
        Scanner sc= new Scanner(System.in);
        int option= sc.nextInt();
        
        if (option==1) {
            System.out.println("Please, enter a number: ");
            int maxNumber= sc.nextInt();
            Fibonacci fibo=new Fibonacci();
                    fibo.calculateFibo(option);
                    
        
        }
        else if (option==3){
            System.out.println("Please, enter a word: ");
            String word= sc.next();
            
            
            

        }        
                    
       
        
          
    }
    
}
