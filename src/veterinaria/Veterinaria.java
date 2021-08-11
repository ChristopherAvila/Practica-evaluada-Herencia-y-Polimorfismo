/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author PC
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais","9años","Doberman");
        Gato gato = new Gato("Misingo","14años","Corto");
        System.out.println(perro.Mostrar());
        
        
        
        System.out.println(gato.Mostrar());
    }
    
}
