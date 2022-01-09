/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocio;

/**
 *
 * @author 03441689216
 */
public class Fatorial {
    private int numero;
    
    public void setNumero (int numero){
        this.numero = numero;
    }
    public int getFatorial (){
        return numero;
    }
    public void calcularFatorial(){
        int i=1;
        for (int j = this.numero; j>=1; j--) {
            i= i*j;     
        }
             this.numero=i;
    }
    
}
