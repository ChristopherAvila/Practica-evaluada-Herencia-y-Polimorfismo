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
public class Animal {
    String Nombre, Edad;
    
    public Animal (String Nombre,String Edad){
    this.Nombre =Nombre;
    this.Edad = Edad;
    }
   public String Mostrar(){
    
    return "El nombre es:"+Nombre+"\nLa Edad es :"+Edad;
    
    
    }
    
}
 