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
public class Queue {

    private Nodo First;
    private int size;
    private Nodo Last;

    public Queue() {
        this.First = null;
        this.size = 0;
        this.Last = null;
    }

    public boolean isEmpty() {
        return First == null;
    }

    /**
     * @return the First
     */
    public Nodo getFirst() {
        return First;
    }

    /**
     * @param First the First to set
     */
    public void setFirst(Nodo First) {
        this.First = First;
    }

    /**
     * @return the pLast
     */
    public Nodo getLast() {
        return Last;
    }

    /**
     * @param pLast the Last to set
     */
    public void setLast(Nodo Last) {
        this.Last = Last;
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

    public Nodo Despachar() { //Retornar nodo

        if (!isEmpty()) {
            Nodo pointer = getFirst();
            setFirst(pointer.getNext());
            pointer.setNext(null);
            size = size - 1;
            return pointer;
        }
        return null;
    }

    public void Desencolar() { //Retornar nada

        if (!isEmpty()) {
            Nodo pointer = getFirst();
            setFirst(pointer.getNext());
            pointer.setNext(null);
            size = size - 1;
        }
    }

    public Object getObject(int index) {
        if (isEmpty()) {
            return null;
        } else {
            int cont = 0;
            Nodo pointer = getFirst();
            while (cont < index && pointer.getNext() != null) {
                pointer = pointer.getNext();
                cont++;
            }
            return pointer.getDato();
        }

    }

    public Nodo Encolar(Object data) {

        Nodo nuevo = new Nodo(data);
        if (isEmpty()) {
            setFirst(nuevo);
            setLast(nuevo);
        } else {
            getLast().setNext(nuevo);
            setLast(nuevo);
        }
        size++;
        return nuevo;
    }

    public void reverseprint(Nodo current) {
        if (!isEmpty()) {
            if (current.getNext() == null) {

                System.out.println(current.getDato());
                return;
            }
            reverseprint(current.getNext());
            System.out.println(current.getDato());
        }
    }
    
    public void printQueue() {

        if (!isEmpty()) {

            Nodo pointer = getFirst();
            for (int i = 0; i < getSize(); i++) {
                System.out.print("Nodo: "+pointer.getDato() + " ");
                pointer = pointer.getNext();
            }
            System.out.println(" ");

        } else {
            System.out.println("Lista vacía");
        }
    }

//    public Nodo deleteObject(Object number) {
//        if (isEmpty()) {
//            return null;
//        } else {
//            int cont = 0;
//            Nodo pointer = getFirst();
//            while (pointer.getNext() != null) {
//                if (pointer.getNext().getDato() == number) {
//                    deleteInIndex(cont + 1);
//                }
//                pointer = pointer.getNext();
//
//                cont++;
//
//            }
//            return pointer;
//
//        }
//    }

    
//    public Nodo DeleteFinal() {
//
//        if (!isEmpty()) {
//            Nodo pointer = getFirst();
//            if (getSize() == 1) {
//                setFirst(null);
//            } else {
//
//                while (pointer.getNext().getNext() != null) {
//                    pointer = pointer.getNext();
//                }
//                pointer.setNext(null);
//                size--;
//                return pointer;
//            }
//        }
//        return null;
//
//    }
//    public Nodo deleteInIndex(int index) {
//        if (!isEmpty()) {
//            Nodo pointer = getFirst();
//            int cont = 0;
//            if (index > getSize()) {
//                System.out.println("the index is bigger than thought");
//                return DeleteFinal();
//            } else {
//                while (cont < (index - 1) && pointer.getNext().getNext() != null) {
//                    pointer = pointer.getNext();
//                    cont++;
//
//                }
//                Nodo temp = pointer.getNext();
//                pointer.setNext(temp.getNext());
//                temp.setNext(null);
//                size--;
//
//            }
//        }
//
//        return null;
//    }
    //    public Nodo insertInIndex(int index, Object data) {
//        Nodo node = new Nodo(data);
//        if (isEmpty()) {
//
//            setFirst(node);
//            setLast(node);
//
//        } else {
//            if (index > getSize()) {
//
//                System.out.println("The index is bigger than the size");
//                return InsertFinal(data);
//            } else {
//                Nodo pointer = getFirst();
//                int cont = 0;
//                while (cont < index && pointer.getNext() != null) {
//                    pointer = pointer.getNext();
//                    cont++;
//                }
//                node.setNext(pointer.getNext());
//                pointer.setNext(node);
//
//            }
//            size++;
////
////        }
////        return node;
//
//    }
}
