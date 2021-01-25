/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwars;

import java.util.ArrayList;

/**
 *
 * @author sebastianobandopaniagua
 */
public class Mercado extends Fabrica {
    public int propuesta;
   // public ArrayList<ArticulosIntercambiables>;
    public boolean ifMercado;
    
    public Mercado(int x, int y, String tipo, int costo) {
        super(x, y, tipo, costo);
        super.tipo = "Mercado";
        super.costo = 2000;
        
    }

    public int getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(int propuesta) {
        this.propuesta = propuesta;
    }

    public boolean isIfMercado() {
        return ifMercado;
    }

    public void setIfMercado(boolean ifMercado) {
        this.ifMercado = ifMercado;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
   
    
   public void intercambiarConJugadores(){
       
   } 
   
   public void intercambiarConMercado(){
       
   }
    
    
    
    
    
}
