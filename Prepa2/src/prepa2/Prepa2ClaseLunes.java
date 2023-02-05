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
public class Prepa2ClaseLunes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista mylist = new Lista();

        mylist.InsertFinal(7);
        mylist.InsertFinal(8);
        mylist.InsertFinal(9);
        mylist.InsertFinal(10);
        mylist.InsertFinal(11);
        mylist.print();
        
        mylist.deleteObject(11);

//        mylist.deleteInIndex(3);
//        mylist.print();
//        mylist.DeleteFinal();
//        mylist.print();
//        
//        mylist.insertInIndex(1, 2);
//        mylist.print();
//        mylist.EliminarInicio();
//        mylist.print();
//        mylist.DeleteFinal();
//        mylist.print();
//
//        Lista mylist2 = new Lista();
//        mylist2.InsertFinal(1);
//        mylist2.InsertFinal(2);
//        mylist2.InsertFinal(3);
//
//        funclist funcion = new funclist();
//        Lista listainvertida= funcion.fliplist(mylist); //no crea la nueva lista por alguna razón
//        listainvertida.print();
//        Lista newlist= funcion.destroycreate(mylist);
//        newlist.print();
//        Lista nueva= new Lista();
//        nueva= funcion.concatenate(mylist, mylist2);
//        nueva.print();
//        funcion.ordenamiento(nueva).print();

    }

}
