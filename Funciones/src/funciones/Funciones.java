/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author User
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    private int tablero;
    
    public Funciones(int tableto){
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
