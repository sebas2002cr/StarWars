/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

/**
 *
 * @author sebastianobandopaniagua
 */
public class Templo extends Fabrica  {
    //Comodin
    int tiempo; //5mins

    public Templo(int tiempo, int x, int y, String tipo, int costo) {
        super(x, y, tipo, costo);
        this.tiempo = tiempo;
        super.costo = 2500;
        
    }
    
    
    public void aplicarComodin(){
        
    }
    
    

    
    
    
    
    
    
}
