/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author User
 */
public class Funciones {

    private int tablero;
    
    public Funciones(){
    }

    public Funciones(int tablero) {
        this.tablero=tablero;
    }
    
    public int getTablero(){
        return tablero;
    
    }
    public void setTablero(int tablero){
        this.tablero=tablero;
        
    }
    
    
    public boolean calculatePrimes(int number){
        int aux=number -1;
        while (aux >1){
            if (number%aux==0){
                return false;
            }
            aux--;
            
        }
        return true;
    }

}
