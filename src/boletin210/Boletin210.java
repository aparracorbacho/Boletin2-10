/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin210;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int euros, b100, b20, b5, var;
        System.out.println("Introduce la cantidad de euros");
        Scanner eurosTeclado = new Scanner(System.in);
        euros = eurosTeclado.nextInt();
        b100 = euros/100;
        var = euros%100;
        b20 = var/20;
        var = var%20;
        b5 = var/5;
        var = var%5;
        System.out.println("El numero de billetes de 100 es :"+b100);
        System.out.println("El numero de billetes de 20 es :"+b20);
        System.out.println("El numero de billetes de 5 es :"+b5);
        System.out.println("El numero restante de monedas es :"+var);
    }
    
}
