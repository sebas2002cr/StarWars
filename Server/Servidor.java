package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Servidor {
    PantallaServidor refPantalla;
    public ArrayList<ThreadServidor> conexiones;
    private boolean running = true;
    private ServerSocket srv;
    private int turno = 0;
    private boolean partidaIniciada = false;

    public Servidor(PantallaServidor refPantalla) {
        this.refPantalla = refPantalla;
        conexiones = new ArrayList<ThreadServidor>();
        this.refPantalla.setSrv(this);
    }

    public void iniciarPartida() {
        boolean todosListos = true;
        
        for (int i = 0; i < conexiones.size(); i++){
            if (!conexiones.get(i).listo){
                todosListos = false;
                break;
            }
        }
        
        if (todosListos){
            this.partidaIniciada = true;
            try {
                for (int i = 0; i < conexiones.size(); i++){
                    conexiones.get(i).writer.writeInt(4);
                }
            }catch (IOException ex) {
            }
        }
    }
    
    public void stopserver(){
        running = false;
    }
    
    public String getNextTurno(){
        if ( ++turno >= conexiones.size())
            turno = 0;
        
        return conexiones.get(turno).nombre;
    }
    
    public String getTurno(){
        return conexiones.get(turno).nombre;
    }
    
    public void runServer(){
        int contadorDeConexiones = 0;
        try{
            srv = new ServerSocket(35577);
            while (running){
                refPantalla.addMessage("::Esperando conexión ...");
                Socket nuevaConexion = srv.accept();
                if (!partidaIniciada && contadorDeConexiones < 4){ 
                    contadorDeConexiones++;
                    refPantalla.addMessage(":Conexión " + contadorDeConexiones + " aceptada");

                    // nuevo thread
                    ThreadServidor newThread = new ThreadServidor(nuevaConexion, this);
                    conexiones.add(newThread);
                    newThread.start();
                }
                else{
                    // OutputStream socket para poder hacer un writer
                    refPantalla.addMessage(":Conexión denegada: partida iniciada");
                }
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
