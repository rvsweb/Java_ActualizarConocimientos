/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada.Interfaces;

/**
 *
 * @author Portatil_Bot
 */
public interface SopaDeLetraNumerosAleatorios {

    public int getNumRandom(int minimo, int maximo);

    public static int getStaticNumRandom(int minimo, int maximo) {
        int x = (int) (Math.random() * (minimo + maximo));
        return x;
    }

}
