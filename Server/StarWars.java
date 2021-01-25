package Server;



public class StarWars {

    public static void main(String[] args) {
        PantallaServidor pantalla = new PantallaServidor();
        Servidor srv = new Servidor(pantalla);
        pantalla.setVisible(true);
        srv.runServer();
    }
    
}
