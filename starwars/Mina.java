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
public class Mina extends Fabrica{
    int cantidadHierro;
    int tiempo;

    public Mina(int cantidadHierro, int tiempo, int x, int y, String tipo, int costo) {
        super(x, y, tipo, costo);
        this.cantidadHierro = cantidadHierro;
        super.tipo = "Mina";
        this.tiempo = tiempo;
        super.costo = 1000;
    }

    public int getCantidadHierro() {
        return cantidadHierro;
    }

    public void setCantidadHierro(int cantidadHierro) {
        this.cantidadHierro = cantidadHierro;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
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

    
    
    
    public void GenerateIron(){
        
    }
    
    
    public void changeVelocity(){
        
    }
    
    
  
    
}
