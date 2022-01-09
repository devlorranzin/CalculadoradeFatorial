/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocio;

import java.util.Scanner;

/**
 *
 * @author 03441689216
 */
public class Iniciar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Fatorial f = new Fatorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE UM VALOR. . . .: ");
        num= sc.nextInt();
        f.setNumero(num);
        f.calcularFatorial();
        System.out.println("O RESULTADO DA FATURAÇÃO FOI: "+f.getFatorial());
    }
    
}
  