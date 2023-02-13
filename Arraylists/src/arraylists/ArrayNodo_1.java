/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class ArrayNodo {
    private int next;
    private String name;
    private int data;

    public ArrayNodo(String name, int data) {
        this.next = -1;
        this.name = name;
        this.data=data;
    }

//    /**
//     * @return the almacen
//     */
//    public T getAlmacen() {
//        return almacen;
//    }
//
//    /**
//     * @param almacen the almacen to set
//     */
//    public void setAlmacen(T almacen) {
//        this.almacen = almacen;
//    }

    /**
     * @return the next
     */
    public int getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(int next) {
        this.next = next;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }
    
    
}
