/**
 * @created on : 29-jul-2017, 12:58:16
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__21_Primo {

    /**
     * Tiene errores , solución incorrecta
     *
     * @param n
     */
    public static void setNumeroPrimo(int n) {
        for (int i = 0; i <= n; i++) {
            if (i == 1 || i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.println("El valor de " + i);
            }
            if (i / 2 >= 1 && i % 2 != 0) { // elimina todos los pares
                if ((i / 3 >= 1) && (i % 3 != 0)) {
                    if ((i / 5 >= 1) && (i % 5 != 0)) {
                        if ((i / 7 >= 1) && (i % 7 != 0)) {
//                            if ((i / 11 >= 1) && (i % 11 != 0)) {
//                                if ((i / 13 >= 1) && (i % 13 != 0)) {
                            System.out.println("El valor de " + i);
                        }
                    }
                }
            }
        }
    }

    public static int getNumber() {
        System.out.println("Introduce un num : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            do {
                if (n == 1) {
                    System.out.println("El " + n + "  El número " + n + " por convenio, no se considera ni primo ni compuesto ");
                } else if (n <= 0) {
                    System.out.println("El " + n + " no se permite - Tampoco los negativos ");
                }
                System.out.println("Intro num valido mayor que 1 : ");
                n = sc.nextInt();
            } while (n < 2);
        }
        return n;
    }

    public static void main(String[] args) {

//        setNumeroPrimo(100);
    }
}