/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class Nodo {
    private Object dato;
    private Nodo next;
    private Nodo previous;
    

    public Nodo(Object dato) {
        this.dato = dato;
        this.next = null;
        this.previous=null;
    }

    /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
    }

    /**
     * @return the pnext
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * @param pnext the pnext to set
     */
    public void setNext(Nodo next) {
        this.next = next;
    }

    /**
     * @return the previous
     */
    public Nodo getPrevious() {
        return previous;
    }

    /**
     * @param previous the previous to set
     */
    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
}
