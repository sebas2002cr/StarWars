package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;



public class ThreadServidor extends Thread{
    private Socket socketRef;
    private DataInputStream reader;
    protected DataOutputStream writer;
    public String nombre;
    private boolean running = true;
    Servidor server;
    protected boolean listo = false;

    public ThreadServidor(Socket socketRef, Servidor server) throws IOException {
        this.socketRef = socketRef;
        reader = new DataInputStream(socketRef.getInputStream());
        writer = new DataOutputStream(socketRef.getOutputStream());
        this.server = server;
    }
    
    public void enviarTurnoInicial() throws IOException{
        writer.writeInt(1);
        writer.writeUTF(nombre);
        writer.writeInt(server.conexiones.size() - 1);
        
        for(int i = 0; i < server.conexiones.size() - 1; i++){
            writer.writeUTF(server.conexiones.get(i).nombre);
        }
        
        for (int i = 0; i < server.conexiones.size(); i ++){
            server.conexiones.get(i).writer.writeInt(5);
            server.conexiones.get(i).writer.writeUTF(nombre);
        }
    }
    
    public void run (){
        
        int instruccionId = 1;
        while (running){
            try {
                instruccionId = reader.readInt(); // esperar hasta que reciba un entero
                
                switch (instruccionId){
                    case 1: // pasan el nombre del usuario
                        nombre = reader.readUTF();
                        enviarTurnoInicial();                  
                        
                        
                    break;
                    case 2: // pasan un mensaje por el chat
                        String mensaje = reader.readUTF();
                        
                        for (int i = 0; i < server.conexiones.size(); i++) {
                            ThreadServidor current = server.conexiones.get(i);
                            current.writer.writeInt(2);
                            current.writer.writeUTF(nombre);
                            current.writer.writeUTF(mensaje);
                        }
                    break;
                    case 3: // ataque
                        int x = reader.readInt();
                        int y = reader.readInt();
                        String atacado = reader.readUTF();
                        String arma = reader.readUTF();
                        
                        for (int i = 0; i < server.conexiones.size(); i++) {
                            ThreadServidor current = server.conexiones.get(i);
                            current.writer.writeInt(3);
                            current.writer.writeUTF(nombre);
                            current.writer.writeInt(x);
                            current.writer.writeInt(y);
                            current.writer.writeUTF(atacado);
                            current.writer.writeUTF(arma);
                        }
                    break;
                    case 4: // iniciar partida
                        listo = !listo;
                        server.iniciarPartida();
                        
                        
                    break;
                }
            } catch (IOException ex) {
                
            }
        }
    }
}
