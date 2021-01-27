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
    public int dinero = 4000;
    public int numJugador;
    public int mundos = 1;
    public int mercados = 1;

    public ThreadServidor(Socket socketRef, Servidor server) throws IOException {
        this.socketRef = socketRef;
        reader = new DataInputStream(socketRef.getInputStream());
        writer = new DataOutputStream(socketRef.getOutputStream());
        this.server = server;
        numJugador = server.conexiones.size();
    }
    
    public void enviarTurnoInicial() throws IOException{
        writer.writeInt(1);
        writer.writeUTF(nombre);
        writer.writeInt(dinero);
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
                    
                    case 7: // construir
                        x = reader.readInt();
                        y = reader.readInt();
                        String comp = reader.readUTF();
                        boolean construccion  = false;
                        
                        if (comp.equals("Mundo")){
                            if (mundos != 0){
                                mundos--;
                                construccion = true;
                            } else if (dinero >= 120000){
                                dinero -= 120000;
                                construccion = true;
                            }
                        }
                        
                        if (comp.equals("Conector")){
                            if (dinero >= 100){
                                dinero -= 100;
                                construccion = true;
                            }
                        }
                        
                        if (comp.equals("Mercado")){
                            if (mercados != 0){
                                mercados--;
                                construccion = true;
                            } else if (dinero >= 2000){
                                dinero -= 2000;
                                construccion = true;
                            }
                        }
                        
                        if (comp.equals("Mina")){
                            if (dinero >= 1000){
                                dinero -= 1000;
                                construccion = true;
                            }
                        }
                        
                        if (comp.equals("Armería")){
                            if (dinero >= 1500){
                                dinero -= 1500;
                                construccion = true;
                            }
                        }
                        
                        if (comp.equals("Templo")){
                            if (dinero >= 2500){
                                dinero -= 2500;
                                construccion = true;
                            }
                        }
                        
                        writer.writeInt(7);
                        writer.writeInt(x);
                        writer.writeInt(y);
                        writer.writeUTF(comp);
                        writer.writeInt(dinero);
                        writer.writeBoolean(construccion);
                }
            } catch (IOException ex) {
                
            }
        }
    }
}
