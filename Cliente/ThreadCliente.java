package Cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;



public class ThreadCliente extends Thread{
    private Socket socketRef;
    public DataInputStream reader;
    public DataOutputStream writer;
    private String nombre;
    private boolean running = true;
    private PantallaCliente refPantalla;

    public ThreadCliente(Socket socketRef, PantallaCliente refPantalla) throws IOException {
        this.socketRef = socketRef;
        reader = new DataInputStream(socketRef.getInputStream());
        writer = new DataOutputStream(socketRef.getOutputStream());
        this.refPantalla = refPantalla;
    }
    
    public void run (){
        
        int instruccionId = 1;
        while (running){
            try {
                String usuario = "";
                instruccionId = reader.readInt(); // esperar hasta que reciba un entero
                
                switch (instruccionId){
                    case 1: // recibe el turno del jufador 1
                        nombre = reader.readUTF();
                        int cantJug = reader.readInt();
                        while (cantJug != 0){
                            String enem = reader.readUTF();
                            refPantalla.añadirEnemigo(enem);
                            cantJug--;
                        }
                    break;
                    case 2: // pasan un mensaje por el chat
                        usuario = reader.readUTF();
                        String mensaje = reader.readUTF();
                        //System.out.println("CLIENTE Recibido mensaje: " + mensaje);
                        refPantalla.addMensaje(usuario+">   " + mensaje);
                    break;
                    case 3: // Ataque
                        usuario = reader.readUTF();
                        int x = reader.readInt();
                        int y = reader.readInt();
                        String atacado = reader.readUTF();
                        String arma = reader.readUTF();
                        
                        refPantalla.pintarMisil(x, y, usuario, atacado);
                        x++; y++;
                        refPantalla.addMensaje(usuario+" atacó a " + atacado + " en " + x + ", " + y + " con un " + arma);
                    break;                    
                    case 4: // pinta que inicio partida
                        refPantalla.setInicioPartida();
                    break;
                    case 5: // nuevo jugador
                        String enem = reader.readUTF();
                        if (!enem.equals(nombre)){
                            refPantalla.añadirEnemigo(enem);
                        }
                }
            } catch (IOException ex) {
                
            }
        }
    }
}
