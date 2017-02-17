/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author Fhany
 */
public class MatrizMinas {

    
    private int Valores[][];

   
    public MatrizMinas() {
        Valores = new int[10][10];
        limpiarMinas();
    }

    //limpia el tablero
    public void limpiarMinas() {
        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10; n++) {
                Valores[m][n] = 0;
            }
        }
    }

    //pone las minas random
    public void ponerMinas() {
        limpiarMinas();
        int m, n;
        for (int i = 0; i < 10; i++) {
            do {
                m = (int) (Math.random() * 10);
                n = (int) (Math.random() * 10);
            } while (Valores[m][n] != 0);
            Valores[m][n] = 9;
        }
    }

    //devuelve el valor de la casilla (mina,blanco)
    public int getMina(int m, int n) {
        return Valores[m][n];
    }

    //cuadros que se revelan al dar click, alrededor
    
    /* corregir
    public void calcularContornos() {
        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10; n++) {
                if (Valores[m][n] == 9) {
                    for (int m2 = m - 1; m2 <= m + 1; m2++) {
                        for (int n2 = n - 1; n2 <= n + 1; n2++) {
                            if (m2 >= 0 && m2 < 10 && n2 >= 0 && n2 < 10 && Valores[m2][n2] != 9) {
                                Valores[m2][n2]++;
                            }
                        }
                    }
                }
            }
        }
    }
}
