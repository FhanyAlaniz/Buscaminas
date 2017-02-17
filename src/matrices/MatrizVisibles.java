/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matrices;

/**
 *
 * @author Fhany
 */
public class MatrizVisibles {

    //atributo
    Boolean Visibles[][];

    //constructor
    public MatrizVisibles() {
        Visibles= new Boolean[10][10];
    }

    //visualiza o oculta las minas
    public void visibilizar(Boolean valor){
        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10; n++) {
                Visibles[m][n] = valor;
            }
        }
    }

    //verifica si una casilla esta visible
    public boolean isValor(int m, int n) {
        return Visibles[m][n];
    }

    //visualiza o oculta una casilla
    public void setVisible(int m,int n, boolean b) {
        Visibles[m][n]=b;
    }
}
