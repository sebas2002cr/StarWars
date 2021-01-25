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
public class Armeria extends Fabrica {
    public String tipoArma;
    int costoDeArma; //kg de hierro

    public Armeria(String tipoArma, int x, int y, String tipo, int costo) {
        super(x, y, tipo, costo);
        this.tipoArma = tipoArma;
        super.tipo = "Armeria";
        super.costo = 1500;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    public int getCostoDeArma() {
        return costoDeArma;
    }

    public void setCostoDeArma(int costoDeArma) {
        this.costoDeArma = costoDeArma;
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

    
    
   
    public void misil(){
        // impacto 1x1
        costoDeArma = 500;
        
    }
    
    public void multiShot(){
        // 4 disparos al azar de 1x1
        costoDeArma = 1000;
        
    }
    
    public void bomba(){
        //3 bombas puestas por el usuario en el mismo turno, con alcance de 1x2 o 2x1
        costoDeArma = 2000;
        
    }
    
    public void comboShot(){
        // 10 disparos de misil en un solo turno 
        costoDeArma = 5000;
        
    }
    
    
    
    
    
    
}
