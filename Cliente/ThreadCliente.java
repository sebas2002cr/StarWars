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
    private int dinero;

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
                        dinero = reader.readInt();
                        int cantJug = reader.readInt();
                        while (cantJug != 0){
                            String enem = reader.readUTF();
                            refPantalla.añadirEnemigo(enem);
                            cantJug--;
                        }
                        refPantalla.pintarDinero(dinero);
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
                    break;
                    
                    case 7:
                        x = reader.readInt();
                        y = reader.readInt();
                        String comp = reader.readUTF();
                        dinero = reader.readInt();
                        boolean construccion = reader.readBoolean();
                        
                        refPantalla.pintarDinero(dinero);
                        if (construccion){
                            refPantalla.addMensaje("Has construido un " + comp + " en " + ++x + ", " + ++y);
                        } else{
                            refPantalla.addMensaje("No se ha podido construir un " + comp + " en " + ++x + ", " + ++y);
                        }
                }
            } catch (IOException ex) {
                
            }
        }
    }
}
