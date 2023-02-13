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
public class Arraylist {

    private int first;
    private int last;
    private int size;
    private ArrayNodo[] array;

    public Arraylist(int max) {
        this.first = this.last = -1;
        this.size = 0;
        this.array = new ArrayNodo[max];
    }

    public boolean isEmpty() {
        return first == -1;
    }

    public void empty() {
        this.first = this.last = -1;
        this.size = 0;
        this.array = new ArrayNodo[this.array.length];
    }

    public boolean isFull() {
        return size == this.array.length;
    }

    public int searchEmptySlot() {
        for (int i = 0; i < this.array.length; i++) {
            if (getArray()[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void insertBegin(String name, int data) {
        if (!isFull()) {
            ArrayNodo nodo = new ArrayNodo(name, data);
            int position = searchEmptySlot();
            getArray()[position] = nodo;
            if (isEmpty()) {
                setFirst(position);
                setLast(position);
            } else {
                getArray()[position].setNext(getFirst());
                setFirst(position);
            }
            size++;
        }
    }

    public void insertLast(String name, int data) {
        if (!isFull()) {
            ArrayNodo nodo = new ArrayNodo(name, data);
            int position = searchEmptySlot();
            getArray()[position] = nodo;
            if (isEmpty()) {
                setFirst(position);
                setLast(position);
            } else {
                getArray()[position].setNext(getLast());
                setLast(position);
            }
            size++;
        }
    }

    public String printList() {
        String list = "";
        int position = getFirst();
        while (position != -1) {
            list += getArray()[position].getName() + getArray()[position].getData()+  "-->";
            position = getArray()[position].getNext();
        }
        return list + "//";
    }

    /**
     * @return the first
     */
    public int getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(int first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public int getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(int last) {
        this.last = last;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the array
     */
    public ArrayNodo[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(ArrayNodo[] array) {
        this.array = array;
    }

}
