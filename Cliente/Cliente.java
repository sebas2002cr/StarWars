package Cliente;

import java.net.Socket;
import javax.swing.JOptionPane;



public class Cliente {
    Socket socketRef;
    PantallaCliente refPantalla;
    public ThreadCliente hiloCliente;

    public Cliente(PantallaCliente refPantalla) {
        this.refPantalla = refPantalla;
        refPantalla.setRefCliente(this);
    }
    
    public void conectar(){
 
        try{
        
            socketRef = new Socket("localhost", 35577);
            hiloCliente = new ThreadCliente(socketRef, refPantalla);
            hiloCliente.start();
            String nombre = JOptionPane.showInputDialog("Introduzca un Nick:");
            refPantalla.setTitle(nombre);
            hiloCliente.writer.writeInt(1); //instruccion para el switch del thraed servidor
            hiloCliente.writer.writeUTF(nombre); //instruccion para el switch del thraed servidor
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
