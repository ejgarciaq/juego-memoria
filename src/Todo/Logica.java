
package Todo;

import java.util.Random;

/**
 *
 * @author ejgar
 */
public class Logica {
    public int[] getCardNumbers() {
    int[] numeros = new int[16];
    int cont1 = 0;       
    while(cont1 < 16) {
        Random r = new Random();
        int na = r.nextInt(8) + 1;
        int cont2 = 0;          
        for (int i = 0; i < 16; i++) {
            if(numeros[i] == na) {
                cont2++;
            }
        }
        if(cont2 < 2) {
            numeros[cont1] = na;
             cont1++;
          }    
        }
        return numeros;
    }
    public int[] getCardNumNormal() {
    int[] numeros = new int[24];
    int cont1 = 0;       
    while(cont1 < 24) {
        Random r = new Random();
        int na = r.nextInt(12) + 1;
        int cont2 = 0;          
        for (int i = 0; i < 24; i++) {
            if(numeros[i] == na) {
                cont2++;
            }
        }
        if(cont2 < 2) {
            numeros[cont1] = na;
             cont1++;
          }    
        }
        return numeros;
    }
    public int[] getCardNumDificil() {
    int[] numeros = new int[36];
    int cont1 = 0;       
    while(cont1 < 36) {
        Random r = new Random();
        int na = r.nextInt(18) + 1;
        int cont2 = 0;          
        for (int i = 0; i < 36; i++) {
            if(numeros[i] == na) {
                cont2++;
            }
        }
        if(cont2 < 2) {
            numeros[cont1] = na;
             cont1++;
          }    
        }
        return numeros;
    }
}
