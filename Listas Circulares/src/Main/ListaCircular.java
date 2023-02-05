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
public class ListaCircular {
    private Nodo First;
    private Nodo Tail;
    private int size;

    public ListaCircular() {
        this.First = null;
        this.size = 0;
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
    public Nodo getTail() {
        return Tail;
    }

    /**
     * @param pLast the Last to set
     */
    public void setTail(Nodo Tail) {
        this.Tail = Tail;
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

    public Nodo EliminarInicio() {

        if (!isEmpty()) {
            if (getSize() == 1) {
                setTail(null);
                size--;
            } else {
                Nodo pointer = getFirst();
                setFirst(pointer.getNext());
                pointer.setNext(null);
                size = size - 1;
                return pointer;
            }
        }
        return null;
    }

    public Nodo DeleteFinal() {

        if (!isEmpty()) {
            Nodo pointer = getFirst();
            if (getSize() == 1) {
                setFirst(null);
            } else {

                while (pointer.getNext().getNext() != null) {
                    pointer = pointer.getNext();
                }
                pointer.setNext(null);
                size--;
                return pointer;
            }
        }
        return null;

    }

    public Nodo deleteInIndex(int index) {
        if (!isEmpty()) {
            Nodo pointer = getFirst();
            int cont = 0;
            if (index > getSize()) {
                System.out.println("the index is bigger than thought");
                return DeleteFinal();
            } else {
                while (cont < (index - 1) && pointer.getNext().getNext() != null) {
                    pointer = pointer.getNext();
                    cont++;

                }
                Nodo temp = pointer.getNext();
                pointer.setNext(temp.getNext());
                temp.setNext(null);
                size--;

            }
        }

        return null;
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

    public Nodo InsertFinal(Object data) {

        Nodo nuevo = new Nodo(data);
        if (isEmpty()) {
            setFirst(nuevo);
            setTail(nuevo);
        } else {

            Nodo pointer = getTail();
            pointer.setNext(nuevo);
            nuevo.setPrevious(pointer);

//            while(pointer.getNext()!=null){
//                pointer=pointer.getNext();
//            }
//            pointer.setNext(nuevo);
            setTail(nuevo);
            
        }
        size++;
        return nuevo;
    }

    public Nodo insertBegin(Object data) {

        Nodo node = new Nodo(data);
        if (isEmpty()) {

            setFirst(node);
            setTail(node);
        } else {
            getFirst().setPrevious(node);
            node.setNext(getFirst());
            setFirst(node);
            Nodo pointer = getFirst();
            while (pointer != getFirst()) {
                pointer.getNext();

            }
            setTail(pointer);

        }
        size++;
        return node;
    }

    public Nodo insertInIndex(int index, Object data) {
        Nodo node = new Nodo(data);
        if (isEmpty()) {

            setFirst(node);
            setTail(node);
        } else {
            if (index > getSize()) {

                System.out.println("The index is bigger than the size");
            } else {

                Nodo pointer = getTail();
                int cont = 0;
                if (index > getSize() / 2) {
                    while (cont < (getSize() - index) && pointer.getPrevious() != null) {
                        pointer = pointer.getPrevious();
                        cont++;
                    }
                    node.setNext(pointer.getNext());
                    pointer.getNext().setPrevious(node);
                    node.setPrevious(pointer);
                    pointer.setNext(node);

                } else {
                    while (cont < index && pointer.getNext() != null) {
                        pointer = pointer.getNext();
                        cont++;

                    }
                    node.setNext(pointer.getNext());
                    pointer.setNext(node);
                }

            }
            size++;

        }
        return node;

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

    public void print() {

        if (!isEmpty()) {

            Nodo pointer = getFirst();
            for (int i = 0; i < getSize(); i++) {
                System.out.print(pointer.getDato() + " ");
                pointer = pointer.getNext();
            }
            System.out.println(" ");

        } else {
            System.out.println("ListaCircular vacía");
        }
    }
}
