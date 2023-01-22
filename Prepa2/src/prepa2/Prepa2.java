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
public class Prepa2 {

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

        mylist.Imprimir();
//        mylist.EliminarInicio();
//        mylist.Imprimir();

        Lista mylist2 = new Lista();
        
        for (int i = 0; i < mylist.getSize(); i++) {
            mylist2.InsertFinal(mylist.GettingLast());
            mylist.DeleteFinal();

        }
        mylist2.Imprimir();
        
//        mylist.reverse(mylist.getpFirst());

    }

}
