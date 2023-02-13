/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue cola1 = new Queue();
        cola1.Encolar("A");
        cola1.Encolar("B");
        cola1.Encolar("C");
        cola1.Encolar("D");
        cola1.printQueue();
        cola1.Desencolar();
        cola1.printQueue();
        System.out.println("Despachado: "+cola1.Despachar().getDato());
        cola1.printQueue();

    }

}
