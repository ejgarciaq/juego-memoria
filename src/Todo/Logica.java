
package Todo;

import java.util.Random;

/**
 * Clase Logica: Proporciona métodos para generar números aleatorios organizados
 * en arreglos, utilizados probablemente para un juego con diferentes niveles 
 * (fácil, normal, difícil).
 *
 * @author Edson J. García Quirós
 */
public class Logica {
    /**
     * Método para generar números aleatorios para el nivel fácil.
     * 
     * @return Un arreglo de tamaño 16 con números aleatorios entre 1 y 8,
     * donde cada número aparece un máximo de dos veces.
     */
    public int[] getCardNumbers() {
        int[] numeros = new int[16]; // Arreglo para almacenar los números.
        int cont1 = 0; // Contador para registrar números en el arreglo.      
        while(cont1 < 16) { // Mientras no se hayan registrado los 16 números.
            Random r = new Random(); // Generador de números aleatorios.
            int na = r.nextInt(8) + 1; // Número aleatorio entre 1 y 8.
            int cont2 = 0;  // Contador para verificar cuántas veces aparece el número.
            // Recorre el arreglo y cuenta cuántas veces está presente el número generado.
            for (int i = 0; i < 16; i++) {
                if(numeros[i] == na) {
                    cont2++;
                }
            }
            // Si el número aparece menos de 2 veces, lo agrega al arreglo.
            if(cont2 < 2) {
                numeros[cont1] = na;
                 cont1++;
              }    
            }
            return numeros; // Si el número aparece menos de 2 veces, lo agrega al arreglo.
        }
     /**
     * Método para generar números aleatorios para el nivel normal.
     * 
     * @return Un arreglo de tamaño 24 con números aleatorios entre 1 y 12,
     * donde cada número aparece un máximo de dos veces.
     */
    public int[] getCardNumNormal() {
        int[] numeros = new int[24]; // Arreglo para almacenar los números.
        int cont1 = 0;   // Contador para registrar números en el arreglo.     
        while(cont1 < 24) { // Mientras no se hayan registrado los 24 números.
            Random r = new Random(); // Generador de números aleatorios.
            int na = r.nextInt(12) + 1; // Número aleatorio entre 1 y 12.
            int cont2 = 0; // Contador para verificar cuántas veces aparece el número. 
            // Recorre el arreglo y cuenta cuántas veces está presente el número generado.
            for (int i = 0; i < 24; i++) {
                if(numeros[i] == na) {
                    cont2++;
                }
            }
            // Recorre el arreglo y cuenta cuántas veces está presente el número generado.
            if(cont2 < 2) {
                numeros[cont1] = na;
                 cont1++;
              }    
            }
            return numeros; // Devuelve el arreglo con los números generados.
    }
    /**
    * Método para generar números aleatorios para el nivel difícil.
    * 
    * @return Un arreglo de tamaño 36 con números aleatorios entre 1 y 18,
    * donde cada número aparece un máximo de dos veces.
    */
    public int[] getCardNumDificil() {
        int[] numeros = new int[36]; // Arreglo para almacenar los números.
        int cont1 = 0; // Contador para registrar números en el arreglo.      
        while(cont1 < 36) { // Mientras no se hayan registrado los 36 números.
            Random r = new Random(); // Generador de números aleatorios.
            int na = r.nextInt(18) + 1; // Número aleatorio entre 1 y 18.
            int cont2 = 0; // Contador para verificar cuántas veces aparece el número. 
            // Recorre el arreglo y cuenta cuántas veces está presente el número generado.
            for (int i = 0; i < 36; i++) {
                if(numeros[i] == na) {
                    cont2++;
                }
            }
            // Recorre el arreglo y cuenta cuántas veces está presente el número generado.
            if(cont2 < 2) {
                numeros[cont1] = na;
                 cont1++;
              }    
        }
        return numeros; // Devuelve el arreglo con los números generados.
    }
}
