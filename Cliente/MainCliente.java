package Cliente;



public class MainCliente {
    
    public static void main(String[] args) {
        try{
        PantallaCliente pantalla = new PantallaCliente();
        Cliente c = new Cliente(pantalla);
        pantalla.setVisible(true); 
        c.conectar();
               
        }
        catch(Exception e){
            
        }
    }
    
}
