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
public class funclist {

    public Lista fliplist(Lista list) {
        Lista newlist = new Lista();
        Nodo pointer = list.getFirst();
        while (pointer != null) {
            newlist.insertBegin(pointer.getDato());
            pointer = pointer.getNext();
        }
        return newlist;
    }

    public Lista destroycreate(Lista list) {
        Lista newlist = new Lista();
        Nodo pointer = list.getFirst();
        while (pointer != null) {
            newlist.insertBegin(pointer.getDato());
            pointer = pointer.getNext();
            list.EliminarInicio();
        }
        return newlist;
    }

    public Lista concatenate(Lista list1, Lista list2) {
        Lista finallist = list1;
//        
//        System.out.println("Final list principio");
//        finallist.Imprimir();
//        
//        System.out.println("Final list2 principio");
//        list2.Imprimir();
//        
        Nodo pointer = list2.getFirst();
        while (pointer != null) {
//            System.out.println("Pointer"+pointer.getDato().toString());
            finallist.insertBegin(pointer.getDato());
//            System.out.println("Final list con elemento");
//            finallist.Imprimir();
            pointer = pointer.getNext();

        }
        return finallist;
    }

    public Lista ordenamiento(Lista list) {
        Lista organizedlist = new Lista();
        int aux = 0;
        Nodo pointer = list.getFirst();

        while (pointer.getNext() != null) {
            int count = ((Integer) pointer.getDato());

            if (count >= aux) {
                organizedlist.InsertFinal(count);

            } else {
                organizedlist.insertBegin(count);
            }
            pointer.getNext();
            aux=count;
        }
        System.out.println("lito");
        return organizedlist;
    }

}
