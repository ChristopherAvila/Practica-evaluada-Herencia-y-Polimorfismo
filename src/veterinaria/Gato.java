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
public class Gato extends Animal {
       String Pelaje;

 
    public Gato(String Nombre,String Edad,String Pelaje){
    
    super(Nombre,Edad);
    this.Pelaje=Pelaje;
    }
    public String Mostrar(){
        
    return  super.Mostrar()+"\nEl tipo de pelaje es:"+Pelaje;
    
    }
}
