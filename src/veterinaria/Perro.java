/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

public class Perro extends Animal {
    String Raza;

 
    public Perro(String Nombre,String Edad,String Raza){
    
    super(Nombre,Edad);
    this.Raza=Raza;
    }
    public String Mostrar(){
        
    return  super.Mostrar()+"\nLa Raza es:"+Raza;
    
    }
    
    
}
