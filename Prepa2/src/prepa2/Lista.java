/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepa2;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class Lista {

    private Nodo pFirst;
    private Nodo pLast;
    private int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return pFirst == null;
    }

    public void EliminarInicio() {

        if (!isEmpty()) {

            pFirst = pFirst.getPnext();
            size = size - 1;
        }
    }

    public void DeleteFinal() {
        Nodo current = pFirst;
        while (true==true) {
            if (!isEmpty()) {
                if (current.getPnext().getPnext() == null) {
                    setpLast(current.getPnext());
                    

//
//                System.out.println(current.getDato());
//                
                    size = size - 1;
                    break;
                } else {
                    current = current.getPnext();

                }

            }
        }

    }

//public void DeleteFinal(){
//    
//        if (!isEmpty()){
//            Nodo aux=pFirst;
//            pLast=null;
//        }
//    }
//    if (current.getPnext() == null) {
//
//                System.out.println(current.getDato());
//                return;
//            }
//            reverse(current.getPnext());
//            System.out.println(current.getDato());
//    
    public void InsertFinal(Object data) {

        Nodo nuevo = new Nodo(data);
        if (isEmpty()) {
            pFirst = nuevo;
            pLast = nuevo;
        } else {

            Nodo aux = pLast;
            aux.setPnext(nuevo);
            pLast = nuevo;
        }
        size += 1;
    }

    public Object GettingLast() {

        if (!isEmpty()) {

            Nodo aux = pLast;
            Object value = aux.getDato();
            return value;
        }
        return false;
    }

    public void reverse(Nodo current) {
        if (!isEmpty()) {
            if (current.getPnext() == null) {

                System.out.println(current.getDato());
                return;
            }
            reverse(current.getPnext());
            System.out.println(current.getDato());
        }
    }

//    public Nodo reversed(Nodo node) {
//
//        if (node.getPnext() == null) {
//            return node;
//        }
//        Nodo vacio=null;
//        Nodo ret = reversed(node.getPnext());
//        node=node.getPnext().getPnext();
//        node.getPnext()=vacio;
//        return ret;
//
//    }
    public void Imprimir() {

        if (!isEmpty()) {

            Nodo aux = pFirst;
            for (int i = 0; i < size; i++) {
                System.out.println(aux.getDato() + " ");
                aux = aux.getPnext();

            }
        } else {
            System.out.println("Lista vacía");
        }

    }

    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
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

}
