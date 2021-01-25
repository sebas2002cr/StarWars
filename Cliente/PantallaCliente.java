package Cliente;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class PantallaCliente extends javax.swing.JFrame {
    
    Cliente refCliente;
    public ArrayList<String> enemigos = new ArrayList<String>();
    private int numEnemigo = 0;
    private boolean pIniciada = false;
    
    public PantallaCliente() {
        initComponents();
        txaMensajes.setEditable(false);
    }
    
    public void setRefCliente(Cliente refCliente){
        this.refCliente = refCliente;
    }

    public void setNombreTurno(String nombreTurno){
        //this.nombreTurno = nombreTurno;
        //lblTurno.setText(nombreTurno);
    }
    
    public void addMensaje(String msj){
        txaMensajes.append(msj + "\n");
    }
    
    public void setInicioPartida(){
        pIniciada = true;
        if (btnIniciar.isEnabled()){
            btnIniciar.setEnabled(false);
            btnIniciar.setVisible(false);
        }
        lblFase.setText("Fase de Ataque");
        
        //lblStatusPartida.setText("INITIATED");
        //lblStatusPartida.setBackground(Color.green);
    }
    
    public void pintarMisil(int posX, int posY, String usuario, String tipo){        
        
        //lblDado1.setText(valor1 + "");
        //lblDado2.setText(valor2 + "");
        //lblDado1.setBackground(Color.red);
        //lblDado2.setBackground(Color.red);
        
        /*if (!btnLanzarDados.isEnabled())
            btnLanzarDados.setEnabled(true);
        
        lblUsuarioLanzamiento.setText(usuario);*/
    }
    
    public void añadirEnemigo(String ene){
        enemigos.add(ene);
        
        mostrarPrimero();
    }
    
    public void mostrarPrimero(){
        if (enemigos.size() != 0){
            lblEnemigo.setText(enemigos.get(0));
        }
    }
    
    public void atacar(int x, int y){
        try {
            if (pIniciada){
                refCliente.hiloCliente.writer.writeInt(3);
                refCliente.hiloCliente.writer.writeInt(x);
                refCliente.hiloCliente.writer.writeInt(y);
                refCliente.hiloCliente.writer.writeUTF(enemigos.get(numEnemigo));
                refCliente.hiloCliente.writer.writeUTF(cbxAtaque.getSelectedItem().toString());
            } else{
                JOptionPane.showMessageDialog(this, "La partida no ha iniciado", "Error", 0);
            }
        } catch (IOException ex) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Casilla9x10 = new javax.swing.JButton();
        Casilla9x11 = new javax.swing.JButton();
        Casilla9x12 = new javax.swing.JButton();
        Casilla8x4 = new javax.swing.JButton();
        Casilla9x7 = new javax.swing.JButton();
        Casilla8x5 = new javax.swing.JButton();
        Casilla9x8 = new javax.swing.JButton();
        Casilla5x8 = new javax.swing.JButton();
        Casilla8x6 = new javax.swing.JButton();
        Casilla4x6 = new javax.swing.JButton();
        Casilla9x9 = new javax.swing.JButton();
        Casilla5x9 = new javax.swing.JButton();
        Casilla8x1 = new javax.swing.JButton();
        Casilla4x1 = new javax.swing.JButton();
        Casilla8x2 = new javax.swing.JButton();
        Casilla4x2 = new javax.swing.JButton();
        Casilla8x3 = new javax.swing.JButton();
        Casilla4x3 = new javax.swing.JButton();
        Casilla13x15 = new javax.swing.JButton();
        Casilla14x3 = new javax.swing.JButton();
        Casilla13x14 = new javax.swing.JButton();
        Casilla14x7 = new javax.swing.JButton();
        Casilla13x13 = new javax.swing.JButton();
        Casilla5x2 = new javax.swing.JButton();
        Casilla13x10 = new javax.swing.JButton();
        Casilla14x8 = new javax.swing.JButton();
        Casilla13x11 = new javax.swing.JButton();
        Casilla5x3 = new javax.swing.JButton();
        Casilla13x12 = new javax.swing.JButton();
        Casilla14x9 = new javax.swing.JButton();
        Casilla12x4 = new javax.swing.JButton();
        Casilla7x4 = new javax.swing.JButton();
        Casilla9x4 = new javax.swing.JButton();
        Casilla7x5 = new javax.swing.JButton();
        Casilla13x7 = new javax.swing.JButton();
        Casilla13x8 = new javax.swing.JButton();
        Casilla9x5 = new javax.swing.JButton();
        Casilla7x6 = new javax.swing.JButton();
        Casilla12x5 = new javax.swing.JButton();
        Casilla7x1 = new javax.swing.JButton();
        Casilla9x6 = new javax.swing.JButton();
        Casilla12x6 = new javax.swing.JButton();
        Casilla9x1 = new javax.swing.JButton();
        Casilla7x2 = new javax.swing.JButton();
        Casilla9x2 = new javax.swing.JButton();
        Casilla7x3 = new javax.swing.JButton();
        Casilla9x3 = new javax.swing.JButton();
        Casilla13x9 = new javax.swing.JButton();
        Casilla1x15 = new javax.swing.JButton();
        Casilla6x15 = new javax.swing.JButton();
        Casilla11x4 = new javax.swing.JButton();
        Casilla12x1 = new javax.swing.JButton();
        Casilla1x14 = new javax.swing.JButton();
        Casilla6x14 = new javax.swing.JButton();
        Casilla11x5 = new javax.swing.JButton();
        Casilla12x2 = new javax.swing.JButton();
        Casilla1x13 = new javax.swing.JButton();
        Casilla6x13 = new javax.swing.JButton();
        Casilla11x6 = new javax.swing.JButton();
        Casilla12x3 = new javax.swing.JButton();
        Casilla1x10 = new javax.swing.JButton();
        Casilla6x10 = new javax.swing.JButton();
        Casilla11x1 = new javax.swing.JButton();
        Casilla6x11 = new javax.swing.JButton();
        Casilla1x11 = new javax.swing.JButton();
        Casilla6x12 = new javax.swing.JButton();
        Casilla11x2 = new javax.swing.JButton();
        Casilla6x7 = new javax.swing.JButton();
        Casilla1x12 = new javax.swing.JButton();
        Casilla14x4 = new javax.swing.JButton();
        Casilla11x3 = new javax.swing.JButton();
        Casilla6x8 = new javax.swing.JButton();
        Casilla1x7 = new javax.swing.JButton();
        Casilla6x9 = new javax.swing.JButton();
        Casilla10x15 = new javax.swing.JButton();
        Casilla14x5 = new javax.swing.JButton();
        Casilla1x8 = new javax.swing.JButton();
        Casilla7x15 = new javax.swing.JButton();
        Casilla10x14 = new javax.swing.JButton();
        Casilla12x15 = new javax.swing.JButton();
        Casilla1x9 = new javax.swing.JButton();
        Casilla7x14 = new javax.swing.JButton();
        Casilla12x14 = new javax.swing.JButton();
        Casilla7x13 = new javax.swing.JButton();
        Casilla12x13 = new javax.swing.JButton();
        Casilla7x10 = new javax.swing.JButton();
        Casilla12x10 = new javax.swing.JButton();
        Casilla7x11 = new javax.swing.JButton();
        Casilla8x15 = new javax.swing.JButton();
        Casilla7x12 = new javax.swing.JButton();
        Casilla8x14 = new javax.swing.JButton();
        Casilla6x4 = new javax.swing.JButton();
        Casilla8x13 = new javax.swing.JButton();
        Casilla7x7 = new javax.swing.JButton();
        Casilla8x10 = new javax.swing.JButton();
        Casilla6x5 = new javax.swing.JButton();
        Casilla8x11 = new javax.swing.JButton();
        Casilla4x15 = new javax.swing.JButton();
        Casilla10x13 = new javax.swing.JButton();
        Casilla8x12 = new javax.swing.JButton();
        Casilla1x4 = new javax.swing.JButton();
        Casilla4x14 = new javax.swing.JButton();
        Casilla10x10 = new javax.swing.JButton();
        Casilla8x7 = new javax.swing.JButton();
        Casilla1x5 = new javax.swing.JButton();
        Casilla4x13 = new javax.swing.JButton();
        Casilla10x11 = new javax.swing.JButton();
        Casilla8x8 = new javax.swing.JButton();
        Casilla1x6 = new javax.swing.JButton();
        Casilla4x10 = new javax.swing.JButton();
        Casilla10x12 = new javax.swing.JButton();
        Casilla15x15 = new javax.swing.JButton();
        Casilla1x1 = new javax.swing.JButton();
        Casilla15x14 = new javax.swing.JButton();
        Casilla10x7 = new javax.swing.JButton();
        Casilla15x13 = new javax.swing.JButton();
        Casilla1x2 = new javax.swing.JButton();
        Casilla15x10 = new javax.swing.JButton();
        Casilla10x8 = new javax.swing.JButton();
        Casilla15x11 = new javax.swing.JButton();
        Casilla1x3 = new javax.swing.JButton();
        Casilla15x12 = new javax.swing.JButton();
        Casilla10x9 = new javax.swing.JButton();
        Casilla15x7 = new javax.swing.JButton();
        Casilla3x4 = new javax.swing.JButton();
        Casilla15x8 = new javax.swing.JButton();
        Casilla11x15 = new javax.swing.JButton();
        Casilla15x9 = new javax.swing.JButton();
        Casilla3x5 = new javax.swing.JButton();
        Casilla4x11 = new javax.swing.JButton();
        Casilla11x14 = new javax.swing.JButton();
        Casilla4x12 = new javax.swing.JButton();
        Casilla3x6 = new javax.swing.JButton();
        Casilla4x7 = new javax.swing.JButton();
        Casilla11x13 = new javax.swing.JButton();
        Casilla4x8 = new javax.swing.JButton();
        Casilla3x1 = new javax.swing.JButton();
        Casilla4x9 = new javax.swing.JButton();
        Casilla11x10 = new javax.swing.JButton();
        Casilla7x8 = new javax.swing.JButton();
        Casilla3x2 = new javax.swing.JButton();
        Casilla6x6 = new javax.swing.JButton();
        Casilla11x11 = new javax.swing.JButton();
        Casilla7x9 = new javax.swing.JButton();
        Casilla3x3 = new javax.swing.JButton();
        Casilla6x1 = new javax.swing.JButton();
        Casilla11x12 = new javax.swing.JButton();
        Casilla6x2 = new javax.swing.JButton();
        Casilla2x15 = new javax.swing.JButton();
        Casilla15x4 = new javax.swing.JButton();
        Casilla10x4 = new javax.swing.JButton();
        Casilla15x5 = new javax.swing.JButton();
        Casilla2x14 = new javax.swing.JButton();
        Casilla15x6 = new javax.swing.JButton();
        Casilla11x7 = new javax.swing.JButton();
        Casilla15x1 = new javax.swing.JButton();
        Casilla2x13 = new javax.swing.JButton();
        Casilla15x2 = new javax.swing.JButton();
        Casilla10x5 = new javax.swing.JButton();
        Casilla15x3 = new javax.swing.JButton();
        Casilla2x10 = new javax.swing.JButton();
        Casilla5x15 = new javax.swing.JButton();
        Casilla11x8 = new javax.swing.JButton();
        Casilla6x3 = new javax.swing.JButton();
        Casilla2x11 = new javax.swing.JButton();
        Casilla5x14 = new javax.swing.JButton();
        Casilla10x6 = new javax.swing.JButton();
        Casilla5x13 = new javax.swing.JButton();
        Casilla2x12 = new javax.swing.JButton();
        Casilla5x10 = new javax.swing.JButton();
        Casilla11x9 = new javax.swing.JButton();
        Casilla5x11 = new javax.swing.JButton();
        Casilla2x7 = new javax.swing.JButton();
        Casilla5x12 = new javax.swing.JButton();
        Casilla10x1 = new javax.swing.JButton();
        Casilla4x4 = new javax.swing.JButton();
        Casilla2x8 = new javax.swing.JButton();
        Casilla5x7 = new javax.swing.JButton();
        Casilla10x2 = new javax.swing.JButton();
        Casilla4x5 = new javax.swing.JButton();
        Casilla2x9 = new javax.swing.JButton();
        Casilla8x9 = new javax.swing.JButton();
        Casilla10x3 = new javax.swing.JButton();
        Casilla12x11 = new javax.swing.JButton();
        Casilla3x15 = new javax.swing.JButton();
        Casilla12x12 = new javax.swing.JButton();
        Casilla13x4 = new javax.swing.JButton();
        Casilla12x7 = new javax.swing.JButton();
        Casilla3x14 = new javax.swing.JButton();
        Casilla12x8 = new javax.swing.JButton();
        Casilla13x5 = new javax.swing.JButton();
        Casilla12x9 = new javax.swing.JButton();
        Casilla3x13 = new javax.swing.JButton();
        Casilla14x6 = new javax.swing.JButton();
        Casilla13x6 = new javax.swing.JButton();
        Casilla14x1 = new javax.swing.JButton();
        Casilla3x10 = new javax.swing.JButton();
        Casilla9x15 = new javax.swing.JButton();
        Casilla13x1 = new javax.swing.JButton();
        Casilla14x2 = new javax.swing.JButton();
        Casilla3x11 = new javax.swing.JButton();
        Casilla9x14 = new javax.swing.JButton();
        Casilla13x2 = new javax.swing.JButton();
        Casilla9x13 = new javax.swing.JButton();
        Casilla3x12 = new javax.swing.JButton();
        Casilla13x3 = new javax.swing.JButton();
        Casilla2x4 = new javax.swing.JButton();
        Casilla3x7 = new javax.swing.JButton();
        Casilla2x5 = new javax.swing.JButton();
        Casilla3x8 = new javax.swing.JButton();
        Casilla2x6 = new javax.swing.JButton();
        Casilla3x9 = new javax.swing.JButton();
        Casilla2x1 = new javax.swing.JButton();
        Casilla14x15 = new javax.swing.JButton();
        Casilla2x2 = new javax.swing.JButton();
        Casilla14x14 = new javax.swing.JButton();
        Casilla2x3 = new javax.swing.JButton();
        Casilla14x13 = new javax.swing.JButton();
        Casilla5x4 = new javax.swing.JButton();
        Casilla14x10 = new javax.swing.JButton();
        Casilla5x5 = new javax.swing.JButton();
        Casilla14x11 = new javax.swing.JButton();
        Casilla5x6 = new javax.swing.JButton();
        Casilla14x12 = new javax.swing.JButton();
        Casilla5x1 = new javax.swing.JButton();
        CasillaE8x9 = new javax.swing.JButton();
        CasillaE12x11 = new javax.swing.JButton();
        CasillaE12x12 = new javax.swing.JButton();
        CasillaE12x7 = new javax.swing.JButton();
        CasillaE12x8 = new javax.swing.JButton();
        CasillaE12x9 = new javax.swing.JButton();
        CasillaE14x6 = new javax.swing.JButton();
        CasillaE14x1 = new javax.swing.JButton();
        lblEnemigo = new javax.swing.JLabel();
        CasillaE9x15 = new javax.swing.JButton();
        CasillaE14x2 = new javax.swing.JButton();
        CasillaE9x14 = new javax.swing.JButton();
        CasillaE9x13 = new javax.swing.JButton();
        CasillaE9x10 = new javax.swing.JButton();
        CasillaE9x11 = new javax.swing.JButton();
        CasillaE9x12 = new javax.swing.JButton();
        CasillaE8x4 = new javax.swing.JButton();
        CasillaE9x7 = new javax.swing.JButton();
        CasillaE8x5 = new javax.swing.JButton();
        CasillaE9x8 = new javax.swing.JButton();
        CasillaE5x8 = new javax.swing.JButton();
        CasillaE8x6 = new javax.swing.JButton();
        CasillaE4x6 = new javax.swing.JButton();
        CasillaE9x9 = new javax.swing.JButton();
        CasillaE5x9 = new javax.swing.JButton();
        CasillaE8x1 = new javax.swing.JButton();
        CasillaE4x1 = new javax.swing.JButton();
        CasillaE8x2 = new javax.swing.JButton();
        CasillaE4x2 = new javax.swing.JButton();
        CasillaE8x3 = new javax.swing.JButton();
        CasillaE4x3 = new javax.swing.JButton();
        CasillaE13x15 = new javax.swing.JButton();
        CasillaE14x3 = new javax.swing.JButton();
        CasillaE13x14 = new javax.swing.JButton();
        CasillaE13x13 = new javax.swing.JButton();
        CasillaE13x10 = new javax.swing.JButton();
        CasillaE13x11 = new javax.swing.JButton();
        CasillaE13x12 = new javax.swing.JButton();
        CasillaE12x4 = new javax.swing.JButton();
        CasillaE9x4 = new javax.swing.JButton();
        CasillaE13x7 = new javax.swing.JButton();
        CasillaE9x5 = new javax.swing.JButton();
        CasillaE12x5 = new javax.swing.JButton();
        CasillaE9x6 = new javax.swing.JButton();
        CasillaE9x1 = new javax.swing.JButton();
        CasillaE9x2 = new javax.swing.JButton();
        CasillaE9x3 = new javax.swing.JButton();
        CasillaE1x15 = new javax.swing.JButton();
        CasillaE11x4 = new javax.swing.JButton();
        CasillaE1x14 = new javax.swing.JButton();
        CasillaE11x5 = new javax.swing.JButton();
        CasillaE1x13 = new javax.swing.JButton();
        CasillaE11x6 = new javax.swing.JButton();
        CasillaE1x10 = new javax.swing.JButton();
        CasillaE11x1 = new javax.swing.JButton();
        CasillaE1x11 = new javax.swing.JButton();
        CasillaE11x2 = new javax.swing.JButton();
        CasillaE1x12 = new javax.swing.JButton();
        CasillaE11x3 = new javax.swing.JButton();
        CasillaE1x7 = new javax.swing.JButton();
        CasillaE10x15 = new javax.swing.JButton();
        CasillaE1x8 = new javax.swing.JButton();
        CasillaE10x14 = new javax.swing.JButton();
        CasillaE1x9 = new javax.swing.JButton();
        CasillaE10x13 = new javax.swing.JButton();
        CasillaE1x4 = new javax.swing.JButton();
        CasillaE10x10 = new javax.swing.JButton();
        CasillaE1x5 = new javax.swing.JButton();
        CasillaE10x11 = new javax.swing.JButton();
        CasillaE1x6 = new javax.swing.JButton();
        CasillaE10x12 = new javax.swing.JButton();
        CasillaE1x1 = new javax.swing.JButton();
        CasillaE10x7 = new javax.swing.JButton();
        CasillaE1x2 = new javax.swing.JButton();
        CasillaE10x8 = new javax.swing.JButton();
        CasillaE1x3 = new javax.swing.JButton();
        CasillaE10x9 = new javax.swing.JButton();
        CasillaE3x4 = new javax.swing.JButton();
        CasillaE11x15 = new javax.swing.JButton();
        CasillaE3x5 = new javax.swing.JButton();
        CasillaE11x14 = new javax.swing.JButton();
        CasillaE3x6 = new javax.swing.JButton();
        CasillaE11x13 = new javax.swing.JButton();
        CasillaE3x1 = new javax.swing.JButton();
        CasillaE11x10 = new javax.swing.JButton();
        CasillaE3x2 = new javax.swing.JButton();
        CasillaE11x11 = new javax.swing.JButton();
        CasillaE3x3 = new javax.swing.JButton();
        CasillaE11x12 = new javax.swing.JButton();
        CasillaE2x15 = new javax.swing.JButton();
        CasillaE10x4 = new javax.swing.JButton();
        CasillaE2x14 = new javax.swing.JButton();
        CasillaE11x7 = new javax.swing.JButton();
        CasillaE2x13 = new javax.swing.JButton();
        CasillaE10x5 = new javax.swing.JButton();
        CasillaE2x10 = new javax.swing.JButton();
        CasillaE11x8 = new javax.swing.JButton();
        CasillaE2x11 = new javax.swing.JButton();
        CasillaE10x6 = new javax.swing.JButton();
        CasillaE2x12 = new javax.swing.JButton();
        CasillaE11x9 = new javax.swing.JButton();
        CasillaE2x7 = new javax.swing.JButton();
        CasillaE10x1 = new javax.swing.JButton();
        CasillaE2x8 = new javax.swing.JButton();
        CasillaE10x2 = new javax.swing.JButton();
        CasillaE2x9 = new javax.swing.JButton();
        CasillaE10x3 = new javax.swing.JButton();
        CasillaE3x15 = new javax.swing.JButton();
        CasillaE13x4 = new javax.swing.JButton();
        CasillaE3x14 = new javax.swing.JButton();
        CasillaE13x5 = new javax.swing.JButton();
        CasillaE3x13 = new javax.swing.JButton();
        CasillaE13x6 = new javax.swing.JButton();
        CasillaE3x10 = new javax.swing.JButton();
        CasillaE13x1 = new javax.swing.JButton();
        CasillaE3x11 = new javax.swing.JButton();
        CasillaE13x2 = new javax.swing.JButton();
        CasillaE3x12 = new javax.swing.JButton();
        CasillaE13x3 = new javax.swing.JButton();
        CasillaE2x4 = new javax.swing.JButton();
        CasillaE3x7 = new javax.swing.JButton();
        CasillaE2x5 = new javax.swing.JButton();
        CasillaE3x8 = new javax.swing.JButton();
        CasillaE2x6 = new javax.swing.JButton();
        CasillaE3x9 = new javax.swing.JButton();
        CasillaE2x1 = new javax.swing.JButton();
        CasillaE14x15 = new javax.swing.JButton();
        CasillaE2x2 = new javax.swing.JButton();
        CasillaE14x14 = new javax.swing.JButton();
        CasillaE2x3 = new javax.swing.JButton();
        CasillaE14x13 = new javax.swing.JButton();
        CasillaE5x4 = new javax.swing.JButton();
        CasillaE14x10 = new javax.swing.JButton();
        CasillaE5x5 = new javax.swing.JButton();
        CasillaE14x11 = new javax.swing.JButton();
        CasillaE5x6 = new javax.swing.JButton();
        CasillaE14x12 = new javax.swing.JButton();
        CasillaE5x1 = new javax.swing.JButton();
        CasillaE14x7 = new javax.swing.JButton();
        CasillaE5x2 = new javax.swing.JButton();
        CasillaE14x8 = new javax.swing.JButton();
        CasillaE5x3 = new javax.swing.JButton();
        CasillaE14x9 = new javax.swing.JButton();
        CasillaE7x4 = new javax.swing.JButton();
        CasillaE7x5 = new javax.swing.JButton();
        CasillaE13x8 = new javax.swing.JButton();
        CasillaE7x6 = new javax.swing.JButton();
        CasillaE7x1 = new javax.swing.JButton();
        CasillaE12x6 = new javax.swing.JButton();
        CasillaE7x2 = new javax.swing.JButton();
        CasillaE7x3 = new javax.swing.JButton();
        CasillaE13x9 = new javax.swing.JButton();
        CasillaE6x15 = new javax.swing.JButton();
        CasillaE12x1 = new javax.swing.JButton();
        CasillaE6x14 = new javax.swing.JButton();
        CasillaE12x2 = new javax.swing.JButton();
        CasillaE6x13 = new javax.swing.JButton();
        CasillaE12x3 = new javax.swing.JButton();
        CasillaE6x10 = new javax.swing.JButton();
        CasillaE6x11 = new javax.swing.JButton();
        CasillaE6x12 = new javax.swing.JButton();
        CasillaE6x7 = new javax.swing.JButton();
        CasillaE14x4 = new javax.swing.JButton();
        CasillaE6x8 = new javax.swing.JButton();
        CasillaE6x9 = new javax.swing.JButton();
        CasillaE14x5 = new javax.swing.JButton();
        CasillaE7x15 = new javax.swing.JButton();
        CasillaE12x15 = new javax.swing.JButton();
        CasillaE7x14 = new javax.swing.JButton();
        CasillaE12x14 = new javax.swing.JButton();
        CasillaE7x13 = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        CasillaE12x13 = new javax.swing.JButton();
        CasillaE7x10 = new javax.swing.JButton();
        CasillaE12x10 = new javax.swing.JButton();
        CasillaE7x11 = new javax.swing.JButton();
        CasillaE8x15 = new javax.swing.JButton();
        CasillaE7x12 = new javax.swing.JButton();
        CasillaE8x14 = new javax.swing.JButton();
        CasillaE6x4 = new javax.swing.JButton();
        CasillaE8x13 = new javax.swing.JButton();
        CasillaE7x7 = new javax.swing.JButton();
        CasillaE8x10 = new javax.swing.JButton();
        CasillaE6x5 = new javax.swing.JButton();
        CasillaE8x11 = new javax.swing.JButton();
        CasillaE4x15 = new javax.swing.JButton();
        CasillaE8x12 = new javax.swing.JButton();
        CasillaE4x14 = new javax.swing.JButton();
        CasillaE8x7 = new javax.swing.JButton();
        CasillaE4x13 = new javax.swing.JButton();
        CasillaE8x8 = new javax.swing.JButton();
        CasillaE4x10 = new javax.swing.JButton();
        CasillaE15x15 = new javax.swing.JButton();
        CasillaE15x14 = new javax.swing.JButton();
        CasillaE15x13 = new javax.swing.JButton();
        CasillaE15x10 = new javax.swing.JButton();
        CasillaE15x11 = new javax.swing.JButton();
        CasillaE15x12 = new javax.swing.JButton();
        CasillaE15x7 = new javax.swing.JButton();
        CasillaE15x8 = new javax.swing.JButton();
        CasillaE15x9 = new javax.swing.JButton();
        CasillaE4x11 = new javax.swing.JButton();
        CasillaE4x12 = new javax.swing.JButton();
        CasillaE4x7 = new javax.swing.JButton();
        CasillaE4x8 = new javax.swing.JButton();
        CasillaE4x9 = new javax.swing.JButton();
        CasillaE7x8 = new javax.swing.JButton();
        CasillaE6x6 = new javax.swing.JButton();
        CasillaE7x9 = new javax.swing.JButton();
        CasillaE6x1 = new javax.swing.JButton();
        CasillaE6x2 = new javax.swing.JButton();
        CasillaE15x4 = new javax.swing.JButton();
        CasillaE15x5 = new javax.swing.JButton();
        CasillaE15x6 = new javax.swing.JButton();
        CasillaE15x1 = new javax.swing.JButton();
        CasillaE15x2 = new javax.swing.JButton();
        CasillaE15x3 = new javax.swing.JButton();
        CasillaE5x15 = new javax.swing.JButton();
        CasillaE6x3 = new javax.swing.JButton();
        CasillaE5x14 = new javax.swing.JButton();
        CasillaE5x13 = new javax.swing.JButton();
        CasillaE5x10 = new javax.swing.JButton();
        CasillaE5x11 = new javax.swing.JButton();
        CasillaE5x12 = new javax.swing.JButton();
        CasillaE4x4 = new javax.swing.JButton();
        CasillaE5x7 = new javax.swing.JButton();
        CasillaE4x5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMensajes = new javax.swing.JTextArea();
        txfMensaje = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        lblFase = new javax.swing.JLabel();
        cbxAtaque = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Casilla9x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x10ActionPerformed(evt);
            }
        });

        Casilla9x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x11ActionPerformed(evt);
            }
        });

        Casilla9x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x12ActionPerformed(evt);
            }
        });

        Casilla8x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x4ActionPerformed(evt);
            }
        });

        Casilla9x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x7ActionPerformed(evt);
            }
        });

        Casilla8x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x5ActionPerformed(evt);
            }
        });

        Casilla9x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x8ActionPerformed(evt);
            }
        });

        Casilla5x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x8ActionPerformed(evt);
            }
        });

        Casilla8x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x6ActionPerformed(evt);
            }
        });

        Casilla4x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x6ActionPerformed(evt);
            }
        });

        Casilla9x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x9ActionPerformed(evt);
            }
        });

        Casilla5x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x9ActionPerformed(evt);
            }
        });

        Casilla8x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x1ActionPerformed(evt);
            }
        });

        Casilla4x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x1ActionPerformed(evt);
            }
        });

        Casilla8x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x2ActionPerformed(evt);
            }
        });

        Casilla4x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x2ActionPerformed(evt);
            }
        });

        Casilla8x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x3ActionPerformed(evt);
            }
        });

        Casilla4x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x3ActionPerformed(evt);
            }
        });

        Casilla13x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x15ActionPerformed(evt);
            }
        });

        Casilla14x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x3ActionPerformed(evt);
            }
        });

        Casilla13x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x14ActionPerformed(evt);
            }
        });

        Casilla14x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x7ActionPerformed(evt);
            }
        });

        Casilla13x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x13ActionPerformed(evt);
            }
        });

        Casilla5x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x2ActionPerformed(evt);
            }
        });

        Casilla13x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x10ActionPerformed(evt);
            }
        });

        Casilla14x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x8ActionPerformed(evt);
            }
        });

        Casilla13x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x11ActionPerformed(evt);
            }
        });

        Casilla5x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x3ActionPerformed(evt);
            }
        });

        Casilla13x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x12ActionPerformed(evt);
            }
        });

        Casilla14x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x9ActionPerformed(evt);
            }
        });

        Casilla12x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x4ActionPerformed(evt);
            }
        });

        Casilla7x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x4ActionPerformed(evt);
            }
        });

        Casilla9x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x4ActionPerformed(evt);
            }
        });

        Casilla7x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x5ActionPerformed(evt);
            }
        });

        Casilla13x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x7ActionPerformed(evt);
            }
        });

        Casilla13x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x8ActionPerformed(evt);
            }
        });

        Casilla9x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x5ActionPerformed(evt);
            }
        });

        Casilla7x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x6ActionPerformed(evt);
            }
        });

        Casilla12x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x5ActionPerformed(evt);
            }
        });

        Casilla7x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x1ActionPerformed(evt);
            }
        });

        Casilla9x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x6ActionPerformed(evt);
            }
        });

        Casilla12x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x6ActionPerformed(evt);
            }
        });

        Casilla9x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x1ActionPerformed(evt);
            }
        });

        Casilla7x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x2ActionPerformed(evt);
            }
        });

        Casilla9x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x2ActionPerformed(evt);
            }
        });

        Casilla7x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x3ActionPerformed(evt);
            }
        });

        Casilla9x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x3ActionPerformed(evt);
            }
        });

        Casilla13x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x9ActionPerformed(evt);
            }
        });

        Casilla1x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x15ActionPerformed(evt);
            }
        });

        Casilla6x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x15ActionPerformed(evt);
            }
        });

        Casilla11x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x4ActionPerformed(evt);
            }
        });

        Casilla12x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x1ActionPerformed(evt);
            }
        });

        Casilla1x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x14ActionPerformed(evt);
            }
        });

        Casilla6x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x14ActionPerformed(evt);
            }
        });

        Casilla11x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x5ActionPerformed(evt);
            }
        });

        Casilla12x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x2ActionPerformed(evt);
            }
        });

        Casilla1x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x13ActionPerformed(evt);
            }
        });

        Casilla6x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x13ActionPerformed(evt);
            }
        });

        Casilla11x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x6ActionPerformed(evt);
            }
        });

        Casilla12x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x3ActionPerformed(evt);
            }
        });

        Casilla1x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x10ActionPerformed(evt);
            }
        });

        Casilla6x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x10ActionPerformed(evt);
            }
        });

        Casilla11x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x1ActionPerformed(evt);
            }
        });

        Casilla6x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x11ActionPerformed(evt);
            }
        });

        Casilla1x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x11ActionPerformed(evt);
            }
        });

        Casilla6x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x12ActionPerformed(evt);
            }
        });

        Casilla11x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x2ActionPerformed(evt);
            }
        });

        Casilla6x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x7ActionPerformed(evt);
            }
        });

        Casilla1x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x12ActionPerformed(evt);
            }
        });

        Casilla14x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x4ActionPerformed(evt);
            }
        });

        Casilla11x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x3ActionPerformed(evt);
            }
        });

        Casilla6x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x8ActionPerformed(evt);
            }
        });

        Casilla1x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x7ActionPerformed(evt);
            }
        });

        Casilla6x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x9ActionPerformed(evt);
            }
        });

        Casilla10x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x15ActionPerformed(evt);
            }
        });

        Casilla14x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x5ActionPerformed(evt);
            }
        });

        Casilla1x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x8ActionPerformed(evt);
            }
        });

        Casilla7x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x15ActionPerformed(evt);
            }
        });

        Casilla10x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x14ActionPerformed(evt);
            }
        });

        Casilla12x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x15ActionPerformed(evt);
            }
        });

        Casilla1x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x9ActionPerformed(evt);
            }
        });

        Casilla7x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x14ActionPerformed(evt);
            }
        });

        Casilla12x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x14ActionPerformed(evt);
            }
        });

        Casilla7x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x13ActionPerformed(evt);
            }
        });

        Casilla12x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x13ActionPerformed(evt);
            }
        });

        Casilla7x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x10ActionPerformed(evt);
            }
        });

        Casilla12x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x10ActionPerformed(evt);
            }
        });

        Casilla7x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x11ActionPerformed(evt);
            }
        });

        Casilla8x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x15ActionPerformed(evt);
            }
        });

        Casilla7x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x12ActionPerformed(evt);
            }
        });

        Casilla8x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x14ActionPerformed(evt);
            }
        });

        Casilla6x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x4ActionPerformed(evt);
            }
        });

        Casilla8x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x13ActionPerformed(evt);
            }
        });

        Casilla7x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x7ActionPerformed(evt);
            }
        });

        Casilla8x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x10ActionPerformed(evt);
            }
        });

        Casilla6x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x5ActionPerformed(evt);
            }
        });

        Casilla8x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x11ActionPerformed(evt);
            }
        });

        Casilla4x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x15ActionPerformed(evt);
            }
        });

        Casilla10x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x13ActionPerformed(evt);
            }
        });

        Casilla8x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x12ActionPerformed(evt);
            }
        });

        Casilla1x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x4ActionPerformed(evt);
            }
        });

        Casilla4x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x14ActionPerformed(evt);
            }
        });

        Casilla10x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x10ActionPerformed(evt);
            }
        });

        Casilla8x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x7ActionPerformed(evt);
            }
        });

        Casilla1x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x5ActionPerformed(evt);
            }
        });

        Casilla4x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x13ActionPerformed(evt);
            }
        });

        Casilla10x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x11ActionPerformed(evt);
            }
        });

        Casilla8x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x8ActionPerformed(evt);
            }
        });

        Casilla1x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x6ActionPerformed(evt);
            }
        });

        Casilla4x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x10ActionPerformed(evt);
            }
        });

        Casilla10x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x12ActionPerformed(evt);
            }
        });

        Casilla15x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x15ActionPerformed(evt);
            }
        });

        Casilla1x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x1ActionPerformed(evt);
            }
        });

        Casilla15x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x14ActionPerformed(evt);
            }
        });

        Casilla10x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x7ActionPerformed(evt);
            }
        });

        Casilla15x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x13ActionPerformed(evt);
            }
        });

        Casilla1x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x2ActionPerformed(evt);
            }
        });

        Casilla15x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x10ActionPerformed(evt);
            }
        });

        Casilla10x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x8ActionPerformed(evt);
            }
        });

        Casilla15x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x11ActionPerformed(evt);
            }
        });

        Casilla1x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla1x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla1x3ActionPerformed(evt);
            }
        });

        Casilla15x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x12ActionPerformed(evt);
            }
        });

        Casilla10x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x9ActionPerformed(evt);
            }
        });

        Casilla15x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x7ActionPerformed(evt);
            }
        });

        Casilla3x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x4ActionPerformed(evt);
            }
        });

        Casilla15x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x8ActionPerformed(evt);
            }
        });

        Casilla11x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x15ActionPerformed(evt);
            }
        });

        Casilla15x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x9ActionPerformed(evt);
            }
        });

        Casilla3x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x5ActionPerformed(evt);
            }
        });

        Casilla4x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x11ActionPerformed(evt);
            }
        });

        Casilla11x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x14ActionPerformed(evt);
            }
        });

        Casilla4x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x12ActionPerformed(evt);
            }
        });

        Casilla3x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x6ActionPerformed(evt);
            }
        });

        Casilla4x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x7ActionPerformed(evt);
            }
        });

        Casilla11x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x13ActionPerformed(evt);
            }
        });

        Casilla4x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x8ActionPerformed(evt);
            }
        });

        Casilla3x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x1ActionPerformed(evt);
            }
        });

        Casilla4x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x9ActionPerformed(evt);
            }
        });

        Casilla11x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x10ActionPerformed(evt);
            }
        });

        Casilla7x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x8ActionPerformed(evt);
            }
        });

        Casilla3x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x2ActionPerformed(evt);
            }
        });

        Casilla6x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x6ActionPerformed(evt);
            }
        });

        Casilla11x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x11ActionPerformed(evt);
            }
        });

        Casilla7x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla7x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla7x9ActionPerformed(evt);
            }
        });

        Casilla3x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x3ActionPerformed(evt);
            }
        });

        Casilla6x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x1ActionPerformed(evt);
            }
        });

        Casilla11x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x12ActionPerformed(evt);
            }
        });

        Casilla6x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x2ActionPerformed(evt);
            }
        });

        Casilla2x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x15ActionPerformed(evt);
            }
        });

        Casilla15x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x4ActionPerformed(evt);
            }
        });

        Casilla10x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x4ActionPerformed(evt);
            }
        });

        Casilla15x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x5ActionPerformed(evt);
            }
        });

        Casilla2x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x14ActionPerformed(evt);
            }
        });

        Casilla15x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x6ActionPerformed(evt);
            }
        });

        Casilla11x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x7ActionPerformed(evt);
            }
        });

        Casilla15x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x1ActionPerformed(evt);
            }
        });

        Casilla2x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x13ActionPerformed(evt);
            }
        });

        Casilla15x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x2ActionPerformed(evt);
            }
        });

        Casilla10x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x5ActionPerformed(evt);
            }
        });

        Casilla15x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla15x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla15x3ActionPerformed(evt);
            }
        });

        Casilla2x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x10ActionPerformed(evt);
            }
        });

        Casilla5x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x15ActionPerformed(evt);
            }
        });

        Casilla11x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x8ActionPerformed(evt);
            }
        });

        Casilla6x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla6x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla6x3ActionPerformed(evt);
            }
        });

        Casilla2x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x11ActionPerformed(evt);
            }
        });

        Casilla5x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x14ActionPerformed(evt);
            }
        });

        Casilla10x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x6ActionPerformed(evt);
            }
        });

        Casilla5x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x13ActionPerformed(evt);
            }
        });

        Casilla2x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x12ActionPerformed(evt);
            }
        });

        Casilla5x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x10ActionPerformed(evt);
            }
        });

        Casilla11x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla11x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla11x9ActionPerformed(evt);
            }
        });

        Casilla5x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x11ActionPerformed(evt);
            }
        });

        Casilla2x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x7ActionPerformed(evt);
            }
        });

        Casilla5x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x12ActionPerformed(evt);
            }
        });

        Casilla10x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x1ActionPerformed(evt);
            }
        });

        Casilla4x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x4ActionPerformed(evt);
            }
        });

        Casilla2x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x8ActionPerformed(evt);
            }
        });

        Casilla5x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x7ActionPerformed(evt);
            }
        });

        Casilla10x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x2ActionPerformed(evt);
            }
        });

        Casilla4x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla4x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla4x5ActionPerformed(evt);
            }
        });

        Casilla2x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x9ActionPerformed(evt);
            }
        });

        Casilla8x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla8x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla8x9ActionPerformed(evt);
            }
        });

        Casilla10x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla10x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla10x3ActionPerformed(evt);
            }
        });

        Casilla12x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x11ActionPerformed(evt);
            }
        });

        Casilla3x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x15ActionPerformed(evt);
            }
        });

        Casilla12x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x12ActionPerformed(evt);
            }
        });

        Casilla13x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x4ActionPerformed(evt);
            }
        });

        Casilla12x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x7ActionPerformed(evt);
            }
        });

        Casilla3x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x14ActionPerformed(evt);
            }
        });

        Casilla12x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x8ActionPerformed(evt);
            }
        });

        Casilla13x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x5ActionPerformed(evt);
            }
        });

        Casilla12x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla12x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla12x9ActionPerformed(evt);
            }
        });

        Casilla3x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x13ActionPerformed(evt);
            }
        });

        Casilla14x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x6ActionPerformed(evt);
            }
        });

        Casilla13x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x6ActionPerformed(evt);
            }
        });

        Casilla14x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x1ActionPerformed(evt);
            }
        });

        Casilla3x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x10ActionPerformed(evt);
            }
        });

        Casilla9x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x15ActionPerformed(evt);
            }
        });

        Casilla13x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x1ActionPerformed(evt);
            }
        });

        Casilla14x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x2ActionPerformed(evt);
            }
        });

        Casilla3x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x11ActionPerformed(evt);
            }
        });

        Casilla9x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x14ActionPerformed(evt);
            }
        });

        Casilla13x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x2ActionPerformed(evt);
            }
        });

        Casilla9x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla9x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla9x13ActionPerformed(evt);
            }
        });

        Casilla3x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x12ActionPerformed(evt);
            }
        });

        Casilla13x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla13x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla13x3ActionPerformed(evt);
            }
        });

        Casilla2x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x4ActionPerformed(evt);
            }
        });

        Casilla3x7.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x7ActionPerformed(evt);
            }
        });

        Casilla2x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x5ActionPerformed(evt);
            }
        });

        Casilla3x8.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x8ActionPerformed(evt);
            }
        });

        Casilla2x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x6ActionPerformed(evt);
            }
        });

        Casilla3x9.setBackground(new java.awt.Color(255, 255, 255));
        Casilla3x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla3x9ActionPerformed(evt);
            }
        });

        Casilla2x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x1ActionPerformed(evt);
            }
        });

        Casilla14x15.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x15ActionPerformed(evt);
            }
        });

        Casilla2x2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x2ActionPerformed(evt);
            }
        });

        Casilla14x14.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x14ActionPerformed(evt);
            }
        });

        Casilla2x3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla2x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla2x3ActionPerformed(evt);
            }
        });

        Casilla14x13.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x13ActionPerformed(evt);
            }
        });

        Casilla5x4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x4ActionPerformed(evt);
            }
        });

        Casilla14x10.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x10ActionPerformed(evt);
            }
        });

        Casilla5x5.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x5ActionPerformed(evt);
            }
        });

        Casilla14x11.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x11ActionPerformed(evt);
            }
        });

        Casilla5x6.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x6ActionPerformed(evt);
            }
        });

        Casilla14x12.setBackground(new java.awt.Color(255, 255, 255));
        Casilla14x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla14x12ActionPerformed(evt);
            }
        });

        Casilla5x1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla5x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla5x1ActionPerformed(evt);
            }
        });

        CasillaE8x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x9ActionPerformed(evt);
            }
        });

        CasillaE12x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x11ActionPerformed(evt);
            }
        });

        CasillaE12x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x12ActionPerformed(evt);
            }
        });

        CasillaE12x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x7ActionPerformed(evt);
            }
        });

        CasillaE12x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x8ActionPerformed(evt);
            }
        });

        CasillaE12x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x9ActionPerformed(evt);
            }
        });

        CasillaE14x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x6ActionPerformed(evt);
            }
        });

        CasillaE14x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x1ActionPerformed(evt);
            }
        });

        lblEnemigo.setBackground(new java.awt.Color(153, 153, 153));
        lblEnemigo.setForeground(new java.awt.Color(255, 255, 255));
        lblEnemigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEnemigo.setOpaque(true);

        CasillaE9x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x15ActionPerformed(evt);
            }
        });

        CasillaE14x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x2ActionPerformed(evt);
            }
        });

        CasillaE9x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x14ActionPerformed(evt);
            }
        });

        CasillaE9x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x13ActionPerformed(evt);
            }
        });

        CasillaE9x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x10ActionPerformed(evt);
            }
        });

        CasillaE9x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x11ActionPerformed(evt);
            }
        });

        CasillaE9x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x12ActionPerformed(evt);
            }
        });

        CasillaE8x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x4ActionPerformed(evt);
            }
        });

        CasillaE9x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x7ActionPerformed(evt);
            }
        });

        CasillaE8x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x5ActionPerformed(evt);
            }
        });

        CasillaE9x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x8ActionPerformed(evt);
            }
        });

        CasillaE5x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x8ActionPerformed(evt);
            }
        });

        CasillaE8x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x6ActionPerformed(evt);
            }
        });

        CasillaE4x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x6ActionPerformed(evt);
            }
        });

        CasillaE9x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x9ActionPerformed(evt);
            }
        });

        CasillaE5x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x9ActionPerformed(evt);
            }
        });

        CasillaE8x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x1ActionPerformed(evt);
            }
        });

        CasillaE4x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x1ActionPerformed(evt);
            }
        });

        CasillaE8x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x2ActionPerformed(evt);
            }
        });

        CasillaE4x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x2ActionPerformed(evt);
            }
        });

        CasillaE8x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x3ActionPerformed(evt);
            }
        });

        CasillaE4x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x3ActionPerformed(evt);
            }
        });

        CasillaE13x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x15ActionPerformed(evt);
            }
        });

        CasillaE14x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x3ActionPerformed(evt);
            }
        });

        CasillaE13x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x14ActionPerformed(evt);
            }
        });

        CasillaE13x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x13ActionPerformed(evt);
            }
        });

        CasillaE13x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x10ActionPerformed(evt);
            }
        });

        CasillaE13x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x11ActionPerformed(evt);
            }
        });

        CasillaE13x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x12ActionPerformed(evt);
            }
        });

        CasillaE12x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x4ActionPerformed(evt);
            }
        });

        CasillaE9x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x4ActionPerformed(evt);
            }
        });

        CasillaE13x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x7ActionPerformed(evt);
            }
        });

        CasillaE9x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x5ActionPerformed(evt);
            }
        });

        CasillaE12x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x5ActionPerformed(evt);
            }
        });

        CasillaE9x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x6ActionPerformed(evt);
            }
        });

        CasillaE9x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x1ActionPerformed(evt);
            }
        });

        CasillaE9x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x2ActionPerformed(evt);
            }
        });

        CasillaE9x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE9x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE9x3ActionPerformed(evt);
            }
        });

        CasillaE1x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x15ActionPerformed(evt);
            }
        });

        CasillaE11x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x4ActionPerformed(evt);
            }
        });

        CasillaE1x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x14ActionPerformed(evt);
            }
        });

        CasillaE11x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x5ActionPerformed(evt);
            }
        });

        CasillaE1x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x13ActionPerformed(evt);
            }
        });

        CasillaE11x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x6ActionPerformed(evt);
            }
        });

        CasillaE1x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x10ActionPerformed(evt);
            }
        });

        CasillaE11x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x1ActionPerformed(evt);
            }
        });

        CasillaE1x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x11ActionPerformed(evt);
            }
        });

        CasillaE11x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x2ActionPerformed(evt);
            }
        });

        CasillaE1x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x12ActionPerformed(evt);
            }
        });

        CasillaE11x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x3ActionPerformed(evt);
            }
        });

        CasillaE1x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x7ActionPerformed(evt);
            }
        });

        CasillaE10x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x15ActionPerformed(evt);
            }
        });

        CasillaE1x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x8ActionPerformed(evt);
            }
        });

        CasillaE10x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x14ActionPerformed(evt);
            }
        });

        CasillaE1x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x9ActionPerformed(evt);
            }
        });

        CasillaE10x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x13ActionPerformed(evt);
            }
        });

        CasillaE1x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x4ActionPerformed(evt);
            }
        });

        CasillaE10x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x10ActionPerformed(evt);
            }
        });

        CasillaE1x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x5ActionPerformed(evt);
            }
        });

        CasillaE10x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x11ActionPerformed(evt);
            }
        });

        CasillaE1x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x6ActionPerformed(evt);
            }
        });

        CasillaE10x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x12ActionPerformed(evt);
            }
        });

        CasillaE1x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x1ActionPerformed(evt);
            }
        });

        CasillaE10x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x7ActionPerformed(evt);
            }
        });

        CasillaE1x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x2ActionPerformed(evt);
            }
        });

        CasillaE10x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x8ActionPerformed(evt);
            }
        });

        CasillaE1x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE1x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE1x3ActionPerformed(evt);
            }
        });

        CasillaE10x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x9ActionPerformed(evt);
            }
        });

        CasillaE3x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x4ActionPerformed(evt);
            }
        });

        CasillaE11x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x15ActionPerformed(evt);
            }
        });

        CasillaE3x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x5ActionPerformed(evt);
            }
        });

        CasillaE11x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x14ActionPerformed(evt);
            }
        });

        CasillaE3x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x6ActionPerformed(evt);
            }
        });

        CasillaE11x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x13ActionPerformed(evt);
            }
        });

        CasillaE3x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x1ActionPerformed(evt);
            }
        });

        CasillaE11x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x10ActionPerformed(evt);
            }
        });

        CasillaE3x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x2ActionPerformed(evt);
            }
        });

        CasillaE11x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x11ActionPerformed(evt);
            }
        });

        CasillaE3x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x3ActionPerformed(evt);
            }
        });

        CasillaE11x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x12ActionPerformed(evt);
            }
        });

        CasillaE2x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x15ActionPerformed(evt);
            }
        });

        CasillaE10x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x4ActionPerformed(evt);
            }
        });

        CasillaE2x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x14ActionPerformed(evt);
            }
        });

        CasillaE11x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x7ActionPerformed(evt);
            }
        });

        CasillaE2x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x13ActionPerformed(evt);
            }
        });

        CasillaE10x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x5ActionPerformed(evt);
            }
        });

        CasillaE2x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x10ActionPerformed(evt);
            }
        });

        CasillaE11x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x8ActionPerformed(evt);
            }
        });

        CasillaE2x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x11ActionPerformed(evt);
            }
        });

        CasillaE10x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x6ActionPerformed(evt);
            }
        });

        CasillaE2x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x12ActionPerformed(evt);
            }
        });

        CasillaE11x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE11x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE11x9ActionPerformed(evt);
            }
        });

        CasillaE2x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x7ActionPerformed(evt);
            }
        });

        CasillaE10x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x1ActionPerformed(evt);
            }
        });

        CasillaE2x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x8ActionPerformed(evt);
            }
        });

        CasillaE10x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x2ActionPerformed(evt);
            }
        });

        CasillaE2x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x9ActionPerformed(evt);
            }
        });

        CasillaE10x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE10x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE10x3ActionPerformed(evt);
            }
        });

        CasillaE3x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x15ActionPerformed(evt);
            }
        });

        CasillaE13x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x4ActionPerformed(evt);
            }
        });

        CasillaE3x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x14ActionPerformed(evt);
            }
        });

        CasillaE13x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x5ActionPerformed(evt);
            }
        });

        CasillaE3x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x13ActionPerformed(evt);
            }
        });

        CasillaE13x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x6ActionPerformed(evt);
            }
        });

        CasillaE3x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x10ActionPerformed(evt);
            }
        });

        CasillaE13x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x1ActionPerformed(evt);
            }
        });

        CasillaE3x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x11ActionPerformed(evt);
            }
        });

        CasillaE13x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x2ActionPerformed(evt);
            }
        });

        CasillaE3x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x12ActionPerformed(evt);
            }
        });

        CasillaE13x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x3ActionPerformed(evt);
            }
        });

        CasillaE2x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x4ActionPerformed(evt);
            }
        });

        CasillaE3x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x7ActionPerformed(evt);
            }
        });

        CasillaE2x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x5ActionPerformed(evt);
            }
        });

        CasillaE3x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x8ActionPerformed(evt);
            }
        });

        CasillaE2x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x6ActionPerformed(evt);
            }
        });

        CasillaE3x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE3x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE3x9ActionPerformed(evt);
            }
        });

        CasillaE2x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x1ActionPerformed(evt);
            }
        });

        CasillaE14x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x15ActionPerformed(evt);
            }
        });

        CasillaE2x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x2ActionPerformed(evt);
            }
        });

        CasillaE14x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x14ActionPerformed(evt);
            }
        });

        CasillaE2x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE2x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE2x3ActionPerformed(evt);
            }
        });

        CasillaE14x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x13ActionPerformed(evt);
            }
        });

        CasillaE5x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x4ActionPerformed(evt);
            }
        });

        CasillaE14x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x10ActionPerformed(evt);
            }
        });

        CasillaE5x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x5ActionPerformed(evt);
            }
        });

        CasillaE14x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x11ActionPerformed(evt);
            }
        });

        CasillaE5x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x6ActionPerformed(evt);
            }
        });

        CasillaE14x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x12ActionPerformed(evt);
            }
        });

        CasillaE5x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x1ActionPerformed(evt);
            }
        });

        CasillaE14x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x7ActionPerformed(evt);
            }
        });

        CasillaE5x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x2ActionPerformed(evt);
            }
        });

        CasillaE14x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x8ActionPerformed(evt);
            }
        });

        CasillaE5x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x3ActionPerformed(evt);
            }
        });

        CasillaE14x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x9ActionPerformed(evt);
            }
        });

        CasillaE7x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x4ActionPerformed(evt);
            }
        });

        CasillaE7x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x5ActionPerformed(evt);
            }
        });

        CasillaE13x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x8ActionPerformed(evt);
            }
        });

        CasillaE7x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x6ActionPerformed(evt);
            }
        });

        CasillaE7x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x1ActionPerformed(evt);
            }
        });

        CasillaE12x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x6ActionPerformed(evt);
            }
        });

        CasillaE7x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x2ActionPerformed(evt);
            }
        });

        CasillaE7x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x3ActionPerformed(evt);
            }
        });

        CasillaE13x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE13x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE13x9ActionPerformed(evt);
            }
        });

        CasillaE6x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x15ActionPerformed(evt);
            }
        });

        CasillaE12x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x1ActionPerformed(evt);
            }
        });

        CasillaE6x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x14ActionPerformed(evt);
            }
        });

        CasillaE12x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x2ActionPerformed(evt);
            }
        });

        CasillaE6x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x13ActionPerformed(evt);
            }
        });

        CasillaE12x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x3ActionPerformed(evt);
            }
        });

        CasillaE6x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x10ActionPerformed(evt);
            }
        });

        CasillaE6x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x11ActionPerformed(evt);
            }
        });

        CasillaE6x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x12ActionPerformed(evt);
            }
        });

        CasillaE6x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x7ActionPerformed(evt);
            }
        });

        CasillaE14x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x4ActionPerformed(evt);
            }
        });

        CasillaE6x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x8ActionPerformed(evt);
            }
        });

        CasillaE6x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x9ActionPerformed(evt);
            }
        });

        CasillaE14x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE14x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE14x5ActionPerformed(evt);
            }
        });

        CasillaE7x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x15ActionPerformed(evt);
            }
        });

        CasillaE12x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x15ActionPerformed(evt);
            }
        });

        CasillaE7x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x14ActionPerformed(evt);
            }
        });

        CasillaE12x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x14ActionPerformed(evt);
            }
        });

        CasillaE7x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x13ActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        CasillaE12x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x13ActionPerformed(evt);
            }
        });

        CasillaE7x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x10ActionPerformed(evt);
            }
        });

        CasillaE12x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE12x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE12x10ActionPerformed(evt);
            }
        });

        CasillaE7x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x11ActionPerformed(evt);
            }
        });

        CasillaE8x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x15ActionPerformed(evt);
            }
        });

        CasillaE7x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x12ActionPerformed(evt);
            }
        });

        CasillaE8x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x14ActionPerformed(evt);
            }
        });

        CasillaE6x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x4ActionPerformed(evt);
            }
        });

        CasillaE8x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x13ActionPerformed(evt);
            }
        });

        CasillaE7x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x7ActionPerformed(evt);
            }
        });

        CasillaE8x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x10ActionPerformed(evt);
            }
        });

        CasillaE6x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x5ActionPerformed(evt);
            }
        });

        CasillaE8x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x11ActionPerformed(evt);
            }
        });

        CasillaE4x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x15ActionPerformed(evt);
            }
        });

        CasillaE8x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x12ActionPerformed(evt);
            }
        });

        CasillaE4x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x14ActionPerformed(evt);
            }
        });

        CasillaE8x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x7ActionPerformed(evt);
            }
        });

        CasillaE4x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x13ActionPerformed(evt);
            }
        });

        CasillaE8x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE8x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE8x8ActionPerformed(evt);
            }
        });

        CasillaE4x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x10ActionPerformed(evt);
            }
        });

        CasillaE15x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x15ActionPerformed(evt);
            }
        });

        CasillaE15x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x14ActionPerformed(evt);
            }
        });

        CasillaE15x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x13ActionPerformed(evt);
            }
        });

        CasillaE15x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x10ActionPerformed(evt);
            }
        });

        CasillaE15x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x11ActionPerformed(evt);
            }
        });

        CasillaE15x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x12ActionPerformed(evt);
            }
        });

        CasillaE15x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x7ActionPerformed(evt);
            }
        });

        CasillaE15x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x8ActionPerformed(evt);
            }
        });

        CasillaE15x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x9ActionPerformed(evt);
            }
        });

        CasillaE4x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x11ActionPerformed(evt);
            }
        });

        CasillaE4x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x12ActionPerformed(evt);
            }
        });

        CasillaE4x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x7ActionPerformed(evt);
            }
        });

        CasillaE4x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x8ActionPerformed(evt);
            }
        });

        CasillaE4x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x9ActionPerformed(evt);
            }
        });

        CasillaE7x8.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x8ActionPerformed(evt);
            }
        });

        CasillaE6x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x6ActionPerformed(evt);
            }
        });

        CasillaE7x9.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE7x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE7x9ActionPerformed(evt);
            }
        });

        CasillaE6x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x1ActionPerformed(evt);
            }
        });

        CasillaE6x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x2ActionPerformed(evt);
            }
        });

        CasillaE15x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x4ActionPerformed(evt);
            }
        });

        CasillaE15x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x5ActionPerformed(evt);
            }
        });

        CasillaE15x6.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x6ActionPerformed(evt);
            }
        });

        CasillaE15x1.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x1ActionPerformed(evt);
            }
        });

        CasillaE15x2.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x2ActionPerformed(evt);
            }
        });

        CasillaE15x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE15x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE15x3ActionPerformed(evt);
            }
        });

        CasillaE5x15.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x15ActionPerformed(evt);
            }
        });

        CasillaE6x3.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE6x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE6x3ActionPerformed(evt);
            }
        });

        CasillaE5x14.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x14ActionPerformed(evt);
            }
        });

        CasillaE5x13.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x13ActionPerformed(evt);
            }
        });

        CasillaE5x10.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x10ActionPerformed(evt);
            }
        });

        CasillaE5x11.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x11ActionPerformed(evt);
            }
        });

        CasillaE5x12.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x12ActionPerformed(evt);
            }
        });

        CasillaE4x4.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x4ActionPerformed(evt);
            }
        });

        CasillaE5x7.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE5x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE5x7ActionPerformed(evt);
            }
        });

        CasillaE4x5.setBackground(new java.awt.Color(255, 255, 255));
        CasillaE4x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasillaE4x5ActionPerformed(evt);
            }
        });

        txaMensajes.setColumns(20);
        txaMensajes.setRows(5);
        jScrollPane1.setViewportView(txaMensajes);

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnIniciar.setText("Estoy listo!");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblFase.setForeground(new java.awt.Color(255, 255, 255));
        lblFase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFase.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        cbxAtaque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Misil", "Multi-shot", "Bombo", "Combo-shot" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla10x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla10x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla11x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla11x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla12x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla12x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla13x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla13x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla14x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla14x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla1x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla2x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla3x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla4x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla5x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla6x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla6x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla7x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla7x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla8x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla8x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Casilla9x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(Casilla9x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE2x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE3x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE4x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE5x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE6x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE6x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE7x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE7x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE8x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE8x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE9x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE9x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE10x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE10x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE11x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE11x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE12x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE12x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE13x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE13x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE14x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE14x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblEnemigo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CasillaE1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(CasillaE1x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Casilla15x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Casilla15x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CasillaE15x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE15x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE15x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CasillaE15x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxAtaque, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addComponent(CasillaE15x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(CasillaE15x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(CasillaE15x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(CasillaE15x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(CasillaE15x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(CasillaE15x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(CasillaE15x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(CasillaE15x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(CasillaE15x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(CasillaE15x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(CasillaE15x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txfMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CasillaE15x10, CasillaE15x11, CasillaE15x12, CasillaE15x13, CasillaE15x14, CasillaE15x15, CasillaE15x2, CasillaE15x3, CasillaE15x4, CasillaE15x5, CasillaE15x6, CasillaE15x7, CasillaE15x8, CasillaE15x9});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEnemigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSiguiente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE1x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE2x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE3x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE4x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE5x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE6x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE6x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE7x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE7x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE8x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE8x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE9x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE9x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE10x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE10x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE11x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE11x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE12x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE12x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE13x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE13x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CasillaE14x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CasillaE14x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla1x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla2x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla3x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla4x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla5x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla6x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla6x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla7x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla7x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla8x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla8x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla9x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla9x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla10x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla10x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla11x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla11x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla12x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla12x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla13x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla13x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla14x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla14x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CasillaE15x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CasillaE15x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Casilla15x1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblFase, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(cbxAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try {
            refCliente.hiloCliente.writer.writeInt(2);
            refCliente.hiloCliente.writer.writeUTF(txfMensaje.getText());
            txfMensaje.setText("");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        ++numEnemigo;
        if (numEnemigo >= enemigos.size()){
            numEnemigo = 0;
        }
        if (enemigos.size() != 0){
            lblEnemigo.setText(enemigos.get(numEnemigo));
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void Casilla1x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x1ActionPerformed
        int x = 0;
        int y = 0;
    }//GEN-LAST:event_Casilla1x1ActionPerformed

    private void Casilla1x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x2ActionPerformed
        int x = 0;
        int y = 1;
    }//GEN-LAST:event_Casilla1x2ActionPerformed

    private void Casilla1x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x3ActionPerformed
        int x = 0;
        int y = 2;
    }//GEN-LAST:event_Casilla1x3ActionPerformed

    private void Casilla1x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x4ActionPerformed
        int x = 0;
        int y = 3;
    }//GEN-LAST:event_Casilla1x4ActionPerformed

    private void Casilla1x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x5ActionPerformed
        int x = 0;
        int y = 4;
    }//GEN-LAST:event_Casilla1x5ActionPerformed

    private void Casilla1x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x6ActionPerformed
        int x = 0;
        int y = 5;
    }//GEN-LAST:event_Casilla1x6ActionPerformed

    private void Casilla1x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x7ActionPerformed
        int x = 0;
        int y = 6;
    }//GEN-LAST:event_Casilla1x7ActionPerformed

    private void Casilla1x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x8ActionPerformed
        int x = 0;
        int y = 7;
    }//GEN-LAST:event_Casilla1x8ActionPerformed

    private void Casilla1x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x9ActionPerformed
        int x = 0;
        int y = 8;
    }//GEN-LAST:event_Casilla1x9ActionPerformed

    private void Casilla1x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x10ActionPerformed
        int x = 0;
        int y = 9;
    }//GEN-LAST:event_Casilla1x10ActionPerformed

    private void Casilla1x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x11ActionPerformed
        int x = 0;
        int y = 10;
    }//GEN-LAST:event_Casilla1x11ActionPerformed

    private void Casilla1x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x12ActionPerformed
        int x = 0;
        int y = 11;
    }//GEN-LAST:event_Casilla1x12ActionPerformed

    private void Casilla1x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x13ActionPerformed
        int x = 0;
        int y = 12;
    }//GEN-LAST:event_Casilla1x13ActionPerformed

    private void Casilla1x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x14ActionPerformed
        int x = 0;
        int y = 13;
    }//GEN-LAST:event_Casilla1x14ActionPerformed

    private void Casilla1x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla1x15ActionPerformed
        int x = 0;
        int y = 14;
    }//GEN-LAST:event_Casilla1x15ActionPerformed

    private void Casilla2x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x1ActionPerformed
        int x = 1;
        int y = 0;
    }//GEN-LAST:event_Casilla2x1ActionPerformed

    private void Casilla2x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x2ActionPerformed
        int x = 1;
        int y = 1;
    }//GEN-LAST:event_Casilla2x2ActionPerformed

    private void Casilla2x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x3ActionPerformed
        int x = 1;
        int y = 2;
    }//GEN-LAST:event_Casilla2x3ActionPerformed

    private void Casilla2x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x4ActionPerformed
        int x = 1;
        int y = 3;
    }//GEN-LAST:event_Casilla2x4ActionPerformed

    private void Casilla2x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x5ActionPerformed
        int x = 1;
        int y = 4;
    }//GEN-LAST:event_Casilla2x5ActionPerformed

    private void Casilla2x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x6ActionPerformed
        int x = 1;
        int y = 5;
    }//GEN-LAST:event_Casilla2x6ActionPerformed

    private void Casilla2x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x7ActionPerformed
        int x = 1;
        int y = 6;
    }//GEN-LAST:event_Casilla2x7ActionPerformed

    private void Casilla2x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x8ActionPerformed
        int x = 1;
        int y = 7;
    }//GEN-LAST:event_Casilla2x8ActionPerformed

    private void Casilla2x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x9ActionPerformed
        int x = 1;
        int y = 8;
    }//GEN-LAST:event_Casilla2x9ActionPerformed

    private void Casilla2x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x10ActionPerformed
        int x = 1;
        int y = 9;
    }//GEN-LAST:event_Casilla2x10ActionPerformed

    private void Casilla2x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x11ActionPerformed
        int x = 1;
        int y = 10;
    }//GEN-LAST:event_Casilla2x11ActionPerformed

    private void Casilla2x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x12ActionPerformed
        int x = 1;
        int y = 11;
    }//GEN-LAST:event_Casilla2x12ActionPerformed

    private void Casilla2x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x13ActionPerformed
        int x = 1;
        int y = 12;
    }//GEN-LAST:event_Casilla2x13ActionPerformed

    private void Casilla2x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x14ActionPerformed
        int x = 1;
        int y = 13;
    }//GEN-LAST:event_Casilla2x14ActionPerformed

    private void Casilla2x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla2x15ActionPerformed
        int x = 1;
        int y = 14;
    }//GEN-LAST:event_Casilla2x15ActionPerformed

    private void Casilla3x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x1ActionPerformed
        int x = 2;
        int y = 0;
    }//GEN-LAST:event_Casilla3x1ActionPerformed

    private void Casilla3x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x2ActionPerformed
        int x = 2;
        int y = 1;
    }//GEN-LAST:event_Casilla3x2ActionPerformed

    private void Casilla3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x3ActionPerformed
        int x = 2;
        int y = 2;
    }//GEN-LAST:event_Casilla3x3ActionPerformed

    private void Casilla3x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x4ActionPerformed
        int x = 2;
        int y = 3;
    }//GEN-LAST:event_Casilla3x4ActionPerformed

    private void Casilla3x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x5ActionPerformed
        int x = 2;
        int y = 4;
    }//GEN-LAST:event_Casilla3x5ActionPerformed

    private void Casilla3x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x6ActionPerformed
        int x = 2;
        int y = 5;
    }//GEN-LAST:event_Casilla3x6ActionPerformed

    private void Casilla3x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x7ActionPerformed
        int x = 2;
        int y = 6;
    }//GEN-LAST:event_Casilla3x7ActionPerformed

    private void Casilla3x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x8ActionPerformed
        int x = 2;
        int y = 7;
    }//GEN-LAST:event_Casilla3x8ActionPerformed

    private void Casilla3x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x9ActionPerformed
        int x = 2;
        int y = 8;
    }//GEN-LAST:event_Casilla3x9ActionPerformed

    private void Casilla3x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x10ActionPerformed
        int x = 2;
        int y = 9;
    }//GEN-LAST:event_Casilla3x10ActionPerformed

    private void Casilla3x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x11ActionPerformed
        int x = 2;
        int y = 10;
    }//GEN-LAST:event_Casilla3x11ActionPerformed

    private void Casilla3x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x12ActionPerformed
        int x = 2;
        int y = 11;
    }//GEN-LAST:event_Casilla3x12ActionPerformed

    private void Casilla3x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x13ActionPerformed
        int x = 2;
        int y = 12;
    }//GEN-LAST:event_Casilla3x13ActionPerformed

    private void Casilla3x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x14ActionPerformed
        int x = 2;
        int y = 13;
    }//GEN-LAST:event_Casilla3x14ActionPerformed

    private void Casilla3x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla3x15ActionPerformed
        int x = 2;
        int y = 14;
    }//GEN-LAST:event_Casilla3x15ActionPerformed

    private void Casilla4x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x1ActionPerformed
        int x = 3;
        int y = 0;
    }//GEN-LAST:event_Casilla4x1ActionPerformed

    private void Casilla4x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x2ActionPerformed
        int x = 3;
        int y = 1;
    }//GEN-LAST:event_Casilla4x2ActionPerformed

    private void Casilla4x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x3ActionPerformed
        int x = 3;
        int y = 2;
    }//GEN-LAST:event_Casilla4x3ActionPerformed

    private void Casilla4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x4ActionPerformed
        int x = 3;
        int y = 3;
    }//GEN-LAST:event_Casilla4x4ActionPerformed

    private void Casilla4x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x5ActionPerformed
        int x = 3;
        int y = 4;
    }//GEN-LAST:event_Casilla4x5ActionPerformed

    private void Casilla4x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x6ActionPerformed
        int x = 3;
        int y = 5;
    }//GEN-LAST:event_Casilla4x6ActionPerformed

    private void Casilla4x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x7ActionPerformed
        int x = 3;
        int y = 6;
    }//GEN-LAST:event_Casilla4x7ActionPerformed

    private void Casilla4x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x8ActionPerformed
        int x = 3;
        int y = 7;
    }//GEN-LAST:event_Casilla4x8ActionPerformed

    private void Casilla4x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x9ActionPerformed
        int x = 3;
        int y = 8;
    }//GEN-LAST:event_Casilla4x9ActionPerformed

    private void Casilla4x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x10ActionPerformed
        int x = 3;
        int y = 9;
    }//GEN-LAST:event_Casilla4x10ActionPerformed

    private void Casilla4x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x11ActionPerformed
        int x = 3;
        int y = 10;
    }//GEN-LAST:event_Casilla4x11ActionPerformed

    private void Casilla4x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x12ActionPerformed
        int x = 3;
        int y = 11;
    }//GEN-LAST:event_Casilla4x12ActionPerformed

    private void Casilla4x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x13ActionPerformed
        int x = 3;
        int y = 12;
    }//GEN-LAST:event_Casilla4x13ActionPerformed

    private void Casilla4x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x14ActionPerformed
        int x = 3;
        int y = 13;
    }//GEN-LAST:event_Casilla4x14ActionPerformed

    private void Casilla4x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla4x15ActionPerformed
        int x = 3;
        int y = 14;
    }//GEN-LAST:event_Casilla4x15ActionPerformed

    private void Casilla5x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x1ActionPerformed
        int x = 4;
        int y = 0;
    }//GEN-LAST:event_Casilla5x1ActionPerformed

    private void Casilla5x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x2ActionPerformed
        int x = 4;
        int y = 1;
    }//GEN-LAST:event_Casilla5x2ActionPerformed

    private void Casilla5x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x3ActionPerformed
        int x = 4;
        int y = 2;
    }//GEN-LAST:event_Casilla5x3ActionPerformed

    private void Casilla5x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x4ActionPerformed
        int x = 4;
        int y = 3;
    }//GEN-LAST:event_Casilla5x4ActionPerformed

    private void Casilla5x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x5ActionPerformed
        int x = 4;
        int y = 4;
    }//GEN-LAST:event_Casilla5x5ActionPerformed

    private void Casilla5x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x6ActionPerformed
        int x = 4;
        int y = 5;
    }//GEN-LAST:event_Casilla5x6ActionPerformed

    private void Casilla5x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x7ActionPerformed
        int x = 4;
        int y = 6;
    }//GEN-LAST:event_Casilla5x7ActionPerformed

    private void Casilla5x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x8ActionPerformed
        int x = 4;
        int y = 7;
    }//GEN-LAST:event_Casilla5x8ActionPerformed

    private void Casilla5x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x9ActionPerformed
        int x = 4;
        int y = 8;
    }//GEN-LAST:event_Casilla5x9ActionPerformed

    private void Casilla5x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x10ActionPerformed
        int x = 4;
        int y = 9;
    }//GEN-LAST:event_Casilla5x10ActionPerformed

    private void Casilla5x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x11ActionPerformed
        int x = 4;
        int y = 10;
    }//GEN-LAST:event_Casilla5x11ActionPerformed

    private void Casilla5x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x12ActionPerformed
        int x = 4;
        int y = 11;
    }//GEN-LAST:event_Casilla5x12ActionPerformed

    private void Casilla5x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x13ActionPerformed
        int x = 4;
        int y = 12;
    }//GEN-LAST:event_Casilla5x13ActionPerformed

    private void Casilla5x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x14ActionPerformed
        int x = 4;
        int y = 13;
    }//GEN-LAST:event_Casilla5x14ActionPerformed

    private void Casilla5x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla5x15ActionPerformed
        int x = 4;
        int y = 14;
    }//GEN-LAST:event_Casilla5x15ActionPerformed

    private void Casilla6x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x1ActionPerformed
        int x = 5;
        int y = 0;
    }//GEN-LAST:event_Casilla6x1ActionPerformed

    private void Casilla6x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x2ActionPerformed
        int x = 5;
        int y = 1;
    }//GEN-LAST:event_Casilla6x2ActionPerformed

    private void Casilla6x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x3ActionPerformed
        int x = 5;
        int y = 2;
    }//GEN-LAST:event_Casilla6x3ActionPerformed

    private void Casilla6x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x4ActionPerformed
        int x = 5;
        int y = 3;
    }//GEN-LAST:event_Casilla6x4ActionPerformed

    private void Casilla6x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x5ActionPerformed
        int x = 5;
        int y = 4;
    }//GEN-LAST:event_Casilla6x5ActionPerformed

    private void Casilla6x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x6ActionPerformed
        int x = 5;
        int y = 5;
    }//GEN-LAST:event_Casilla6x6ActionPerformed

    private void Casilla6x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x7ActionPerformed
        int x = 5;
        int y = 6;
    }//GEN-LAST:event_Casilla6x7ActionPerformed

    private void Casilla6x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x8ActionPerformed
        int x = 5;
        int y = 7;
    }//GEN-LAST:event_Casilla6x8ActionPerformed

    private void Casilla6x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x9ActionPerformed
        int x = 5;
        int y = 8;
    }//GEN-LAST:event_Casilla6x9ActionPerformed

    private void Casilla6x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x10ActionPerformed
        int x = 5;
        int y = 9;
    }//GEN-LAST:event_Casilla6x10ActionPerformed

    private void Casilla6x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x11ActionPerformed
        int x = 5;
        int y = 10;
    }//GEN-LAST:event_Casilla6x11ActionPerformed

    private void Casilla6x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x12ActionPerformed
        int x = 5;
        int y = 11;
    }//GEN-LAST:event_Casilla6x12ActionPerformed

    private void Casilla6x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x13ActionPerformed
        int x = 5;
        int y = 12;
    }//GEN-LAST:event_Casilla6x13ActionPerformed

    private void Casilla6x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x14ActionPerformed
        int x = 5;
        int y = 13;
    }//GEN-LAST:event_Casilla6x14ActionPerformed

    private void Casilla6x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla6x15ActionPerformed
        int x = 5;
        int y = 14;
    }//GEN-LAST:event_Casilla6x15ActionPerformed

    private void Casilla7x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x1ActionPerformed
        int x = 6;
        int y = 0;
    }//GEN-LAST:event_Casilla7x1ActionPerformed

    private void Casilla7x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x2ActionPerformed
        int x = 6;
        int y = 1;
    }//GEN-LAST:event_Casilla7x2ActionPerformed

    private void Casilla7x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x3ActionPerformed
        int x = 6;
        int y = 2;
    }//GEN-LAST:event_Casilla7x3ActionPerformed

    private void Casilla7x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x4ActionPerformed
        int x = 6;
        int y = 3;
    }//GEN-LAST:event_Casilla7x4ActionPerformed

    private void Casilla7x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x5ActionPerformed
        int x = 6;
        int y = 4;
    }//GEN-LAST:event_Casilla7x5ActionPerformed

    private void Casilla7x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x6ActionPerformed
        int x = 6;
        int y = 5;
    }//GEN-LAST:event_Casilla7x6ActionPerformed

    private void Casilla7x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x7ActionPerformed
        int x = 6;
        int y = 6;
    }//GEN-LAST:event_Casilla7x7ActionPerformed

    private void Casilla7x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x8ActionPerformed
        int x = 6;
        int y = 7;
    }//GEN-LAST:event_Casilla7x8ActionPerformed

    private void Casilla7x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x9ActionPerformed
        int x = 6;
        int y = 8;
    }//GEN-LAST:event_Casilla7x9ActionPerformed

    private void Casilla7x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x10ActionPerformed
        int x = 6;
        int y = 9;
    }//GEN-LAST:event_Casilla7x10ActionPerformed

    private void Casilla7x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x11ActionPerformed
        int x = 6;
        int y = 10;
    }//GEN-LAST:event_Casilla7x11ActionPerformed

    private void Casilla7x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x12ActionPerformed
        int x = 6;
        int y = 11;
    }//GEN-LAST:event_Casilla7x12ActionPerformed

    private void Casilla7x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x13ActionPerformed
        int x = 6;
        int y = 12;
    }//GEN-LAST:event_Casilla7x13ActionPerformed

    private void Casilla7x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x14ActionPerformed
        int x = 6;
        int y = 13;
    }//GEN-LAST:event_Casilla7x14ActionPerformed

    private void Casilla7x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla7x15ActionPerformed
        int x = 6;
        int y = 14;
    }//GEN-LAST:event_Casilla7x15ActionPerformed

    private void Casilla8x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x1ActionPerformed
        int x = 7;
        int y = 0;
    }//GEN-LAST:event_Casilla8x1ActionPerformed

    private void Casilla8x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x2ActionPerformed
        int x = 7;
        int y = 1;
    }//GEN-LAST:event_Casilla8x2ActionPerformed

    private void Casilla8x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x3ActionPerformed
        int x = 7;
        int y = 2;
    }//GEN-LAST:event_Casilla8x3ActionPerformed

    private void Casilla8x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x4ActionPerformed
        int x = 7;
        int y = 3;
    }//GEN-LAST:event_Casilla8x4ActionPerformed

    private void Casilla8x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x5ActionPerformed
        int x = 7;
        int y = 4;
    }//GEN-LAST:event_Casilla8x5ActionPerformed

    private void Casilla8x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x6ActionPerformed
        int x = 7;
        int y = 5;
    }//GEN-LAST:event_Casilla8x6ActionPerformed

    private void Casilla8x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x7ActionPerformed
        int x = 7;
        int y = 6;
    }//GEN-LAST:event_Casilla8x7ActionPerformed

    private void Casilla8x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x8ActionPerformed
        int x = 7;
        int y = 7;
    }//GEN-LAST:event_Casilla8x8ActionPerformed

    private void Casilla8x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x9ActionPerformed
        int x = 7;
        int y = 8;
    }//GEN-LAST:event_Casilla8x9ActionPerformed

    private void Casilla8x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x10ActionPerformed
        int x = 7;
        int y = 9;
    }//GEN-LAST:event_Casilla8x10ActionPerformed

    private void Casilla8x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x11ActionPerformed
        int x = 7;
        int y = 10;
    }//GEN-LAST:event_Casilla8x11ActionPerformed

    private void Casilla8x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x12ActionPerformed
        int x = 7;
        int y = 11;
    }//GEN-LAST:event_Casilla8x12ActionPerformed

    private void Casilla8x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x13ActionPerformed
        int x = 7;
        int y = 12;
    }//GEN-LAST:event_Casilla8x13ActionPerformed

    private void Casilla8x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x14ActionPerformed
        int x = 7;
        int y = 13;
    }//GEN-LAST:event_Casilla8x14ActionPerformed

    private void Casilla8x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla8x15ActionPerformed
        int x = 7;
        int y = 14;
    }//GEN-LAST:event_Casilla8x15ActionPerformed

    private void Casilla9x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x1ActionPerformed
        int x = 8;
        int y = 0;
    }//GEN-LAST:event_Casilla9x1ActionPerformed

    private void Casilla9x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x2ActionPerformed
        int x = 8;
        int y = 1;
    }//GEN-LAST:event_Casilla9x2ActionPerformed

    private void Casilla9x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x3ActionPerformed
        int x = 8;
        int y = 2;
    }//GEN-LAST:event_Casilla9x3ActionPerformed

    private void Casilla9x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x4ActionPerformed
        int x = 8;
        int y = 3;
    }//GEN-LAST:event_Casilla9x4ActionPerformed

    private void Casilla9x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x5ActionPerformed
        int x = 8;
        int y = 4;
    }//GEN-LAST:event_Casilla9x5ActionPerformed

    private void Casilla9x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x6ActionPerformed
        int x = 8;
        int y = 5;
    }//GEN-LAST:event_Casilla9x6ActionPerformed

    private void Casilla9x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x7ActionPerformed
        int x = 8;
        int y = 6;
    }//GEN-LAST:event_Casilla9x7ActionPerformed

    private void Casilla9x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x8ActionPerformed
        int x = 8;
        int y = 7;
    }//GEN-LAST:event_Casilla9x8ActionPerformed

    private void Casilla9x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x9ActionPerformed
        int x = 8;
        int y = 8;
    }//GEN-LAST:event_Casilla9x9ActionPerformed

    private void Casilla9x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x10ActionPerformed
        int x = 8;
        int y = 9;
    }//GEN-LAST:event_Casilla9x10ActionPerformed

    private void Casilla9x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x11ActionPerformed
        int x = 8;
        int y = 10;
    }//GEN-LAST:event_Casilla9x11ActionPerformed

    private void Casilla9x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x12ActionPerformed
        int x = 8;
        int y = 11;
    }//GEN-LAST:event_Casilla9x12ActionPerformed

    private void Casilla9x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x13ActionPerformed
        int x = 8;
        int y = 12;
    }//GEN-LAST:event_Casilla9x13ActionPerformed

    private void Casilla9x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x14ActionPerformed
        int x = 8;
        int y = 13;
    }//GEN-LAST:event_Casilla9x14ActionPerformed

    private void Casilla9x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla9x15ActionPerformed
        int x = 8;
        int y = 14;
    }//GEN-LAST:event_Casilla9x15ActionPerformed

    private void Casilla10x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x1ActionPerformed
        int x = 9;
        int y = 0;
    }//GEN-LAST:event_Casilla10x1ActionPerformed

    private void Casilla10x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x2ActionPerformed
        int x = 9;
        int y = 1;
    }//GEN-LAST:event_Casilla10x2ActionPerformed

    private void Casilla10x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x3ActionPerformed
        int x = 9;
        int y = 2;
    }//GEN-LAST:event_Casilla10x3ActionPerformed

    private void Casilla10x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x4ActionPerformed
        int x = 9;
        int y = 3;
    }//GEN-LAST:event_Casilla10x4ActionPerformed

    private void Casilla10x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x5ActionPerformed
        int x = 9;
        int y = 4;
    }//GEN-LAST:event_Casilla10x5ActionPerformed

    private void Casilla10x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x6ActionPerformed
        int x = 9;
        int y = 5;
    }//GEN-LAST:event_Casilla10x6ActionPerformed

    private void Casilla10x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x7ActionPerformed
        int x = 9;
        int y = 6;
    }//GEN-LAST:event_Casilla10x7ActionPerformed

    private void Casilla10x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x8ActionPerformed
        int x = 9;
        int y = 7;
    }//GEN-LAST:event_Casilla10x8ActionPerformed

    private void Casilla10x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x9ActionPerformed
        int x = 9;
        int y = 8;
    }//GEN-LAST:event_Casilla10x9ActionPerformed

    private void Casilla10x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x10ActionPerformed
        int x = 9;
        int y = 9;
    }//GEN-LAST:event_Casilla10x10ActionPerformed

    private void Casilla10x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x11ActionPerformed
        int x = 9;
        int y = 10;
    }//GEN-LAST:event_Casilla10x11ActionPerformed

    private void Casilla10x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x12ActionPerformed
        int x = 9;
        int y = 11;
    }//GEN-LAST:event_Casilla10x12ActionPerformed

    private void Casilla10x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x13ActionPerformed
        int x = 9;
        int y = 12;
    }//GEN-LAST:event_Casilla10x13ActionPerformed

    private void Casilla10x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x14ActionPerformed
        int x = 9;
        int y = 13;
    }//GEN-LAST:event_Casilla10x14ActionPerformed

    private void Casilla10x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla10x15ActionPerformed
        int x = 9;
        int y = 14;
    }//GEN-LAST:event_Casilla10x15ActionPerformed

    private void Casilla11x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x1ActionPerformed
        int x = 10;
        int y = 0;
    }//GEN-LAST:event_Casilla11x1ActionPerformed

    private void Casilla11x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x2ActionPerformed
        int x = 10;
        int y = 1;
    }//GEN-LAST:event_Casilla11x2ActionPerformed

    private void Casilla11x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x3ActionPerformed
        int x = 10;
        int y = 2;
    }//GEN-LAST:event_Casilla11x3ActionPerformed

    private void Casilla11x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x4ActionPerformed
        int x = 10;
        int y = 3;
    }//GEN-LAST:event_Casilla11x4ActionPerformed

    private void Casilla11x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x5ActionPerformed
        int x = 10;
        int y = 4;
    }//GEN-LAST:event_Casilla11x5ActionPerformed

    private void Casilla11x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x6ActionPerformed
        int x = 10;
        int y = 5;
    }//GEN-LAST:event_Casilla11x6ActionPerformed

    private void Casilla11x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x7ActionPerformed
        int x = 10;
        int y = 6;
    }//GEN-LAST:event_Casilla11x7ActionPerformed

    private void Casilla11x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x8ActionPerformed
        int x = 10;
        int y = 7;
    }//GEN-LAST:event_Casilla11x8ActionPerformed

    private void Casilla11x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x9ActionPerformed
        int x = 10;
        int y = 8;
    }//GEN-LAST:event_Casilla11x9ActionPerformed

    private void Casilla11x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x10ActionPerformed
        int x = 10;
        int y = 9;
    }//GEN-LAST:event_Casilla11x10ActionPerformed

    private void Casilla11x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x11ActionPerformed
        int x = 10;
        int y = 10;
    }//GEN-LAST:event_Casilla11x11ActionPerformed

    private void Casilla11x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x12ActionPerformed
        int x = 10;
        int y = 11;
    }//GEN-LAST:event_Casilla11x12ActionPerformed

    private void Casilla11x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x13ActionPerformed
        int x = 10;
        int y = 12;
    }//GEN-LAST:event_Casilla11x13ActionPerformed

    private void Casilla11x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x14ActionPerformed
        int x = 10;
        int y = 13;
    }//GEN-LAST:event_Casilla11x14ActionPerformed

    private void Casilla11x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla11x15ActionPerformed
        int x = 10;
        int y = 14;
    }//GEN-LAST:event_Casilla11x15ActionPerformed

    private void Casilla12x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x1ActionPerformed
        int x = 11;
        int y = 0;
    }//GEN-LAST:event_Casilla12x1ActionPerformed

    private void Casilla12x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x2ActionPerformed
        int x = 11;
        int y = 1;
    }//GEN-LAST:event_Casilla12x2ActionPerformed

    private void Casilla12x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x3ActionPerformed
        int x = 11;
        int y = 2;
    }//GEN-LAST:event_Casilla12x3ActionPerformed

    private void Casilla12x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x4ActionPerformed
        int x = 11;
        int y = 3;
    }//GEN-LAST:event_Casilla12x4ActionPerformed

    private void Casilla12x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x5ActionPerformed
        int x = 11;
        int y = 4;
    }//GEN-LAST:event_Casilla12x5ActionPerformed

    private void Casilla12x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x6ActionPerformed
        int x = 11;
        int y = 5;
    }//GEN-LAST:event_Casilla12x6ActionPerformed

    private void Casilla12x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x7ActionPerformed
        int x = 11;
        int y = 6;
    }//GEN-LAST:event_Casilla12x7ActionPerformed

    private void Casilla12x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x8ActionPerformed
        int x = 11;
        int y = 7;
    }//GEN-LAST:event_Casilla12x8ActionPerformed

    private void Casilla12x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x9ActionPerformed
        int x = 11;
        int y = 8;
    }//GEN-LAST:event_Casilla12x9ActionPerformed

    private void Casilla12x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x10ActionPerformed
        int x = 11;
        int y = 9;
    }//GEN-LAST:event_Casilla12x10ActionPerformed

    private void Casilla12x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x11ActionPerformed
        int x = 11;
        int y = 10;
    }//GEN-LAST:event_Casilla12x11ActionPerformed

    private void Casilla12x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x12ActionPerformed
        int x = 11;
        int y = 11;
    }//GEN-LAST:event_Casilla12x12ActionPerformed

    private void Casilla12x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x13ActionPerformed
        int x = 11;
        int y = 12;
    }//GEN-LAST:event_Casilla12x13ActionPerformed

    private void Casilla12x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x14ActionPerformed
        int x = 11;
        int y = 13;
    }//GEN-LAST:event_Casilla12x14ActionPerformed

    private void Casilla12x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla12x15ActionPerformed
        int x = 11;
        int y = 14;
    }//GEN-LAST:event_Casilla12x15ActionPerformed

    private void Casilla13x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x1ActionPerformed
        int x = 12;
        int y = 0;
    }//GEN-LAST:event_Casilla13x1ActionPerformed

    private void Casilla13x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x2ActionPerformed
        int x = 12;
        int y = 1;
    }//GEN-LAST:event_Casilla13x2ActionPerformed

    private void Casilla13x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x3ActionPerformed
        int x = 12;
        int y = 2;
    }//GEN-LAST:event_Casilla13x3ActionPerformed

    private void Casilla13x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x4ActionPerformed
        int x = 12;
        int y = 3;
    }//GEN-LAST:event_Casilla13x4ActionPerformed

    private void Casilla13x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x5ActionPerformed
        int x = 12;
        int y = 4;
    }//GEN-LAST:event_Casilla13x5ActionPerformed

    private void Casilla13x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x6ActionPerformed
        int x = 12;
        int y = 5;
    }//GEN-LAST:event_Casilla13x6ActionPerformed

    private void Casilla13x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x7ActionPerformed
        int x = 12;
        int y = 6;
    }//GEN-LAST:event_Casilla13x7ActionPerformed

    private void Casilla13x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x8ActionPerformed
        int x = 12;
        int y = 7;
    }//GEN-LAST:event_Casilla13x8ActionPerformed

    private void Casilla13x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x9ActionPerformed
        int x = 12;
        int y = 8;
    }//GEN-LAST:event_Casilla13x9ActionPerformed

    private void Casilla13x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x10ActionPerformed
        int x = 12;
        int y = 9;
    }//GEN-LAST:event_Casilla13x10ActionPerformed

    private void Casilla13x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x11ActionPerformed
        int x = 12;
        int y = 10;
    }//GEN-LAST:event_Casilla13x11ActionPerformed

    private void Casilla13x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x12ActionPerformed
        int x = 12;
        int y = 11;
    }//GEN-LAST:event_Casilla13x12ActionPerformed

    private void Casilla13x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x13ActionPerformed
        int x = 12;
        int y = 12;
    }//GEN-LAST:event_Casilla13x13ActionPerformed

    private void Casilla13x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x14ActionPerformed
        int x = 12;
        int y = 13;
    }//GEN-LAST:event_Casilla13x14ActionPerformed

    private void Casilla13x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla13x15ActionPerformed
        int x = 12;
        int y = 14;
    }//GEN-LAST:event_Casilla13x15ActionPerformed

    private void Casilla14x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x1ActionPerformed
        int x = 13;
        int y = 0;
    }//GEN-LAST:event_Casilla14x1ActionPerformed

    private void Casilla14x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x2ActionPerformed
        int x = 13;
        int y = 1;
    }//GEN-LAST:event_Casilla14x2ActionPerformed

    private void Casilla14x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x3ActionPerformed
        int x = 13;
        int y = 2;
    }//GEN-LAST:event_Casilla14x3ActionPerformed

    private void Casilla14x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x4ActionPerformed
        int x = 13;
        int y = 3;
    }//GEN-LAST:event_Casilla14x4ActionPerformed

    private void Casilla14x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x5ActionPerformed
        int x = 13;
        int y = 4;
    }//GEN-LAST:event_Casilla14x5ActionPerformed

    private void Casilla14x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x6ActionPerformed
        int x = 13;
        int y = 5;
    }//GEN-LAST:event_Casilla14x6ActionPerformed

    private void Casilla14x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x7ActionPerformed
        int x = 13;
        int y = 6;
    }//GEN-LAST:event_Casilla14x7ActionPerformed

    private void Casilla14x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x8ActionPerformed
        int x = 13;
        int y = 7;
    }//GEN-LAST:event_Casilla14x8ActionPerformed

    private void Casilla14x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x9ActionPerformed
        int x = 13;
        int y = 8;
    }//GEN-LAST:event_Casilla14x9ActionPerformed

    private void Casilla14x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x10ActionPerformed
        int x = 13;
        int y = 9;
    }//GEN-LAST:event_Casilla14x10ActionPerformed

    private void Casilla14x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x11ActionPerformed
        int x = 13;
        int y = 10;
    }//GEN-LAST:event_Casilla14x11ActionPerformed

    private void Casilla14x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x12ActionPerformed
        int x = 13;
        int y = 11;
    }//GEN-LAST:event_Casilla14x12ActionPerformed

    private void Casilla14x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x13ActionPerformed
        int x = 13;
        int y = 12;
    }//GEN-LAST:event_Casilla14x13ActionPerformed

    private void Casilla14x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x14ActionPerformed
        int x = 13;
        int y = 13;
    }//GEN-LAST:event_Casilla14x14ActionPerformed

    private void Casilla14x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla14x15ActionPerformed
        int x = 13;
        int y = 14;
    }//GEN-LAST:event_Casilla14x15ActionPerformed

    private void Casilla15x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x1ActionPerformed
        int x = 14;
        int y = 0;
    }//GEN-LAST:event_Casilla15x1ActionPerformed

    private void Casilla15x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x2ActionPerformed
        int x = 14;
        int y = 1;
    }//GEN-LAST:event_Casilla15x2ActionPerformed

    private void Casilla15x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x3ActionPerformed
        int x = 14;
        int y = 2;
    }//GEN-LAST:event_Casilla15x3ActionPerformed

    private void Casilla15x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x4ActionPerformed
        int x = 14;
        int y = 3;
    }//GEN-LAST:event_Casilla15x4ActionPerformed

    private void Casilla15x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x5ActionPerformed
        int x = 14;
        int y = 4;
    }//GEN-LAST:event_Casilla15x5ActionPerformed

    private void Casilla15x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x6ActionPerformed
        int x = 14;
        int y = 5;
    }//GEN-LAST:event_Casilla15x6ActionPerformed

    private void Casilla15x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x7ActionPerformed
        int x = 14;
        int y = 6;
    }//GEN-LAST:event_Casilla15x7ActionPerformed

    private void Casilla15x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x8ActionPerformed
        int x = 14;
        int y = 7;
    }//GEN-LAST:event_Casilla15x8ActionPerformed

    private void Casilla15x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x9ActionPerformed
        int x = 14;
        int y = 8;
    }//GEN-LAST:event_Casilla15x9ActionPerformed

    private void Casilla15x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x10ActionPerformed
        int x = 14;
        int y = 9;
    }//GEN-LAST:event_Casilla15x10ActionPerformed

    private void Casilla15x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x11ActionPerformed
        int x = 14;
        int y = 10;
    }//GEN-LAST:event_Casilla15x11ActionPerformed

    private void Casilla15x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x12ActionPerformed
        int x = 14;
        int y = 11;
    }//GEN-LAST:event_Casilla15x12ActionPerformed

    private void Casilla15x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x13ActionPerformed
        int x = 14;
        int y = 12;
    }//GEN-LAST:event_Casilla15x13ActionPerformed

    private void Casilla15x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x14ActionPerformed
        int x = 14;
        int y = 13;
    }//GEN-LAST:event_Casilla15x14ActionPerformed

    private void Casilla15x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla15x15ActionPerformed
        int x = 14;
        int y = 14;
    }//GEN-LAST:event_Casilla15x15ActionPerformed

    
    
    private void CasillaE1x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x1ActionPerformed
        int x = 0;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x1ActionPerformed

    private void CasillaE1x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x2ActionPerformed
        int x = 0;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x2ActionPerformed

    private void CasillaE1x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x3ActionPerformed
        int x = 0;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x3ActionPerformed

    private void CasillaE1x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x4ActionPerformed
        int x = 0;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x4ActionPerformed

    private void CasillaE1x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x5ActionPerformed
        int x = 0;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x5ActionPerformed

    private void CasillaE1x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x6ActionPerformed
        int x = 0;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x6ActionPerformed

    private void CasillaE1x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x7ActionPerformed
        int x = 0;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x7ActionPerformed

    private void CasillaE1x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x8ActionPerformed
        int x = 0;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x8ActionPerformed

    private void CasillaE1x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x9ActionPerformed
        int x = 0;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x9ActionPerformed

    private void CasillaE1x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x10ActionPerformed
        int x = 0;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x10ActionPerformed

    private void CasillaE1x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x11ActionPerformed
        int x = 0;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x11ActionPerformed

    private void CasillaE1x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x12ActionPerformed
        int x = 0;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x12ActionPerformed

    private void CasillaE1x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x13ActionPerformed
        int x = 0;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x13ActionPerformed

    private void CasillaE1x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x14ActionPerformed
        int x = 0;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x14ActionPerformed

    private void CasillaE1x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE1x15ActionPerformed
        int x = 0;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE1x15ActionPerformed

    private void CasillaE2x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x1ActionPerformed
        int x = 1;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x1ActionPerformed

    private void CasillaE2x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x2ActionPerformed
        int x = 1;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x2ActionPerformed

    private void CasillaE2x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x3ActionPerformed
        int x = 1;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x3ActionPerformed

    private void CasillaE2x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x4ActionPerformed
        int x = 1;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x4ActionPerformed

    private void CasillaE2x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x5ActionPerformed
        int x = 1;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x5ActionPerformed

    private void CasillaE2x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x6ActionPerformed
        int x = 1;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x6ActionPerformed

    private void CasillaE2x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x7ActionPerformed
        int x = 1;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x7ActionPerformed

    private void CasillaE2x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x8ActionPerformed
        int x = 1;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x8ActionPerformed

    private void CasillaE2x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x9ActionPerformed
        int x = 1;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x9ActionPerformed

    private void CasillaE2x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x10ActionPerformed
        int x = 1;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x10ActionPerformed

    private void CasillaE2x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x11ActionPerformed
        int x = 1;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x11ActionPerformed

    private void CasillaE2x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x12ActionPerformed
        int x = 1;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x12ActionPerformed

    private void CasillaE2x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x13ActionPerformed
        int x = 1;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x13ActionPerformed

    private void CasillaE2x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x14ActionPerformed
        int x = 1;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x14ActionPerformed

    private void CasillaE2x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE2x15ActionPerformed
        int x = 1;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE2x15ActionPerformed

    private void CasillaE3x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x1ActionPerformed
        int x = 2;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x1ActionPerformed

    private void CasillaE3x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x2ActionPerformed
        int x = 2;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x2ActionPerformed

    private void CasillaE3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x3ActionPerformed
        int x = 2;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x3ActionPerformed

    private void CasillaE3x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x4ActionPerformed
        int x = 2;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x4ActionPerformed

    private void CasillaE3x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x5ActionPerformed
        int x = 2;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x5ActionPerformed

    private void CasillaE3x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x6ActionPerformed
        int x = 2;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x6ActionPerformed

    private void CasillaE3x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x7ActionPerformed
        int x = 2;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x7ActionPerformed

    private void CasillaE3x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x8ActionPerformed
        int x = 2;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x8ActionPerformed

    private void CasillaE3x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x9ActionPerformed
        int x = 2;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x9ActionPerformed

    private void CasillaE3x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x10ActionPerformed
        int x = 2;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x10ActionPerformed

    private void CasillaE3x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x11ActionPerformed
        int x = 2;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x11ActionPerformed

    private void CasillaE3x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x12ActionPerformed
        int x = 2;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x12ActionPerformed

    private void CasillaE3x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x13ActionPerformed
        int x = 2;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x13ActionPerformed

    private void CasillaE3x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x14ActionPerformed
        int x = 2;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x14ActionPerformed

    private void CasillaE3x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE3x15ActionPerformed
        int x = 2;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE3x15ActionPerformed

    private void CasillaE4x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x1ActionPerformed
        int x = 3;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x1ActionPerformed

    private void CasillaE4x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x2ActionPerformed
        int x = 3;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x2ActionPerformed

    private void CasillaE4x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x3ActionPerformed
        int x = 3;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x3ActionPerformed

    private void CasillaE4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x4ActionPerformed
        int x = 3;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x4ActionPerformed

    private void CasillaE4x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x5ActionPerformed
        int x = 3;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x5ActionPerformed

    private void CasillaE4x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x6ActionPerformed
        int x = 3;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x6ActionPerformed

    private void CasillaE4x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x7ActionPerformed
        int x = 3;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x7ActionPerformed

    private void CasillaE4x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x8ActionPerformed
        int x = 3;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x8ActionPerformed

    private void CasillaE4x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x9ActionPerformed
        int x = 3;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x9ActionPerformed

    private void CasillaE4x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x10ActionPerformed
        int x = 3;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x10ActionPerformed

    private void CasillaE4x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x11ActionPerformed
        int x = 3;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x11ActionPerformed

    private void CasillaE4x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x12ActionPerformed
        int x = 3;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x12ActionPerformed

    private void CasillaE4x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x13ActionPerformed
        int x = 3;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x13ActionPerformed

    private void CasillaE4x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x14ActionPerformed
        int x = 3;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x14ActionPerformed

    private void CasillaE4x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE4x15ActionPerformed
        int x = 3;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE4x15ActionPerformed

    private void CasillaE5x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x1ActionPerformed
        int x = 4;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x1ActionPerformed

    private void CasillaE5x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x2ActionPerformed
        int x = 4;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x2ActionPerformed

    private void CasillaE5x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x3ActionPerformed
        int x = 4;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x3ActionPerformed

    private void CasillaE5x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x4ActionPerformed
        int x = 4;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x4ActionPerformed

    private void CasillaE5x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x5ActionPerformed
        int x = 4;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x5ActionPerformed

    private void CasillaE5x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x6ActionPerformed
        int x = 4;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x6ActionPerformed

    private void CasillaE5x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x7ActionPerformed
        int x = 4;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x7ActionPerformed

    private void CasillaE5x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x8ActionPerformed
        int x = 4;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x8ActionPerformed

    private void CasillaE5x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x9ActionPerformed
        int x = 4;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x9ActionPerformed

    private void CasillaE5x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x10ActionPerformed
        int x = 4;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x10ActionPerformed

    private void CasillaE5x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x11ActionPerformed
        int x = 4;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x11ActionPerformed

    private void CasillaE5x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x12ActionPerformed
        int x = 4;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x12ActionPerformed

    private void CasillaE5x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x13ActionPerformed
        int x = 4;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x13ActionPerformed

    private void CasillaE5x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x14ActionPerformed
        int x = 4;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x14ActionPerformed

    private void CasillaE5x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE5x15ActionPerformed
        int x = 4;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE5x15ActionPerformed

    private void CasillaE6x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x1ActionPerformed
        int x = 5;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x1ActionPerformed

    private void CasillaE6x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x2ActionPerformed
        int x = 5;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x2ActionPerformed

    private void CasillaE6x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x3ActionPerformed
        int x = 5;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x3ActionPerformed

    private void CasillaE6x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x4ActionPerformed
        int x = 5;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x4ActionPerformed

    private void CasillaE6x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x5ActionPerformed
        int x = 5;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x5ActionPerformed

    private void CasillaE6x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x6ActionPerformed
        int x = 5;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x6ActionPerformed

    private void CasillaE6x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x7ActionPerformed
        int x = 5;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x7ActionPerformed

    private void CasillaE6x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x8ActionPerformed
        int x = 5;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x8ActionPerformed

    private void CasillaE6x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x9ActionPerformed
        int x = 5;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x9ActionPerformed

    private void CasillaE6x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x10ActionPerformed
        int x = 5;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x10ActionPerformed

    private void CasillaE6x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x11ActionPerformed
        int x = 5;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x11ActionPerformed

    private void CasillaE6x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x12ActionPerformed
        int x = 5;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x12ActionPerformed

    private void CasillaE6x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x13ActionPerformed
        int x = 5;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x13ActionPerformed

    private void CasillaE6x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x14ActionPerformed
        int x = 5;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x14ActionPerformed

    private void CasillaE6x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE6x15ActionPerformed
        int x = 5;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE6x15ActionPerformed

    private void CasillaE7x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x1ActionPerformed
        int x = 6;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x1ActionPerformed

    private void CasillaE7x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x2ActionPerformed
        int x = 6;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x2ActionPerformed

    private void CasillaE7x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x3ActionPerformed
        int x = 6;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x3ActionPerformed

    private void CasillaE7x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x4ActionPerformed
        int x = 6;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x4ActionPerformed

    private void CasillaE7x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x5ActionPerformed
        int x = 6;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x5ActionPerformed

    private void CasillaE7x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x6ActionPerformed
        int x = 6;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x6ActionPerformed

    private void CasillaE7x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x7ActionPerformed
        int x = 6;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x7ActionPerformed

    private void CasillaE7x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x8ActionPerformed
        int x = 6;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x8ActionPerformed

    private void CasillaE7x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x9ActionPerformed
        int x = 6;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x9ActionPerformed

    private void CasillaE7x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x10ActionPerformed
        int x = 6;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x10ActionPerformed

    private void CasillaE7x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x11ActionPerformed
        int x = 6;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x11ActionPerformed

    private void CasillaE7x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x12ActionPerformed
        int x = 6;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x12ActionPerformed

    private void CasillaE7x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x13ActionPerformed
        int x = 6;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x13ActionPerformed

    private void CasillaE7x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x14ActionPerformed
        int x = 6;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x14ActionPerformed

    private void CasillaE7x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE7x15ActionPerformed
        int x = 6;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE7x15ActionPerformed

    private void CasillaE8x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x1ActionPerformed
        int x = 7;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x1ActionPerformed

    private void CasillaE8x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x2ActionPerformed
        int x = 7;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x2ActionPerformed

    private void CasillaE8x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x3ActionPerformed
        int x = 7;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x3ActionPerformed

    private void CasillaE8x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x4ActionPerformed
        int x = 7;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x4ActionPerformed

    private void CasillaE8x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x5ActionPerformed
        int x = 7;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x5ActionPerformed

    private void CasillaE8x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x6ActionPerformed
        int x = 7;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x6ActionPerformed

    private void CasillaE8x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x7ActionPerformed
        int x = 7;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x7ActionPerformed

    private void CasillaE8x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x8ActionPerformed
        int x = 7;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x8ActionPerformed

    private void CasillaE8x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x9ActionPerformed
        int x = 7;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x9ActionPerformed

    private void CasillaE8x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x10ActionPerformed
        int x = 7;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x10ActionPerformed

    private void CasillaE8x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x11ActionPerformed
        int x = 7;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x11ActionPerformed

    private void CasillaE8x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x12ActionPerformed
        int x = 7;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x12ActionPerformed

    private void CasillaE8x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x13ActionPerformed
        int x = 7;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x13ActionPerformed

    private void CasillaE8x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x14ActionPerformed
        int x = 7;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x14ActionPerformed

    private void CasillaE8x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE8x15ActionPerformed
        int x = 7;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE8x15ActionPerformed

    private void CasillaE9x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x1ActionPerformed
        int x = 8;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x1ActionPerformed

    private void CasillaE9x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x2ActionPerformed
        int x = 8;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x2ActionPerformed

    private void CasillaE9x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x3ActionPerformed
        int x = 8;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x3ActionPerformed

    private void CasillaE9x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x4ActionPerformed
        int x = 8;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x4ActionPerformed

    private void CasillaE9x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x5ActionPerformed
        int x = 8;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x5ActionPerformed

    private void CasillaE9x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x6ActionPerformed
        int x = 8;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x6ActionPerformed

    private void CasillaE9x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x7ActionPerformed
        int x = 8;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x7ActionPerformed

    private void CasillaE9x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x8ActionPerformed
        int x = 8;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x8ActionPerformed

    private void CasillaE9x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x9ActionPerformed
        int x = 8;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x9ActionPerformed

    private void CasillaE9x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x10ActionPerformed
        int x = 8;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x10ActionPerformed

    private void CasillaE9x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x11ActionPerformed
        int x = 8;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x11ActionPerformed

    private void CasillaE9x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x12ActionPerformed
        int x = 8;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x12ActionPerformed

    private void CasillaE9x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x13ActionPerformed
        int x = 8;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x13ActionPerformed

    private void CasillaE9x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x14ActionPerformed
        int x = 8;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x14ActionPerformed

    private void CasillaE9x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE9x15ActionPerformed
        int x = 8;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE9x15ActionPerformed

    private void CasillaE10x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x1ActionPerformed
        int x = 9;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x1ActionPerformed

    private void CasillaE10x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x2ActionPerformed
        int x = 9;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x2ActionPerformed

    private void CasillaE10x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x3ActionPerformed
        int x = 9;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x3ActionPerformed

    private void CasillaE10x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x4ActionPerformed
        int x = 9;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x4ActionPerformed

    private void CasillaE10x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x5ActionPerformed
        int x = 9;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x5ActionPerformed

    private void CasillaE10x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x6ActionPerformed
        int x = 9;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x6ActionPerformed

    private void CasillaE10x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x7ActionPerformed
        int x = 9;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x7ActionPerformed

    private void CasillaE10x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x8ActionPerformed
        int x = 9;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x8ActionPerformed

    private void CasillaE10x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x9ActionPerformed
        int x = 9;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x9ActionPerformed

    private void CasillaE10x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x10ActionPerformed
        int x = 9;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x10ActionPerformed

    private void CasillaE10x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x11ActionPerformed
        int x = 9;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x11ActionPerformed

    private void CasillaE10x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x12ActionPerformed
        int x = 9;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x12ActionPerformed

    private void CasillaE10x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x13ActionPerformed
        int x = 9;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x13ActionPerformed

    private void CasillaE10x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x14ActionPerformed
        int x = 9;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x14ActionPerformed

    private void CasillaE10x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE10x15ActionPerformed
        int x = 9;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE10x15ActionPerformed

    private void CasillaE11x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x1ActionPerformed
        int x = 10;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x1ActionPerformed

    private void CasillaE11x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x2ActionPerformed
        int x = 10;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x2ActionPerformed

    private void CasillaE11x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x3ActionPerformed
        int x = 10;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x3ActionPerformed

    private void CasillaE11x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x4ActionPerformed
        int x = 10;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x4ActionPerformed

    private void CasillaE11x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x5ActionPerformed
        int x = 10;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x5ActionPerformed

    private void CasillaE11x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x6ActionPerformed
        int x = 10;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x6ActionPerformed

    private void CasillaE11x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x7ActionPerformed
        int x = 10;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x7ActionPerformed

    private void CasillaE11x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x8ActionPerformed
        int x = 10;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x8ActionPerformed

    private void CasillaE11x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x9ActionPerformed
        int x = 10;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x9ActionPerformed

    private void CasillaE11x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x10ActionPerformed
        int x = 10;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x10ActionPerformed

    private void CasillaE11x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x11ActionPerformed
        int x = 10;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x11ActionPerformed

    private void CasillaE11x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x12ActionPerformed
        int x = 10;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x12ActionPerformed

    private void CasillaE11x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x13ActionPerformed
        int x = 10;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x13ActionPerformed

    private void CasillaE11x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x14ActionPerformed
        int x = 10;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x14ActionPerformed

    private void CasillaE11x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE11x15ActionPerformed
        int x = 10;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE11x15ActionPerformed

    private void CasillaE12x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x1ActionPerformed
        int x = 11;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x1ActionPerformed

    private void CasillaE12x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x2ActionPerformed
        int x = 11;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x2ActionPerformed

    private void CasillaE12x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x3ActionPerformed
        int x = 11;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x3ActionPerformed

    private void CasillaE12x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x4ActionPerformed
        int x = 11;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x4ActionPerformed

    private void CasillaE12x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x5ActionPerformed
        int x = 11;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x5ActionPerformed

    private void CasillaE12x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x6ActionPerformed
        int x = 11;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x6ActionPerformed

    private void CasillaE12x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x7ActionPerformed
        int x = 11;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x7ActionPerformed

    private void CasillaE12x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x8ActionPerformed
        int x = 11;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x8ActionPerformed

    private void CasillaE12x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x9ActionPerformed
        int x = 11;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x9ActionPerformed

    private void CasillaE12x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x10ActionPerformed
        int x = 11;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x10ActionPerformed

    private void CasillaE12x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x11ActionPerformed
        int x = 11;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x11ActionPerformed

    private void CasillaE12x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x12ActionPerformed
        int x = 11;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x12ActionPerformed

    private void CasillaE12x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x13ActionPerformed
        int x = 11;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x13ActionPerformed

    private void CasillaE12x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x14ActionPerformed
        int x = 11;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x14ActionPerformed

    private void CasillaE12x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE12x15ActionPerformed
        int x = 11;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE12x15ActionPerformed

    private void CasillaE13x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x1ActionPerformed
        int x = 12;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x1ActionPerformed

    private void CasillaE13x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x2ActionPerformed
        int x = 12;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x2ActionPerformed

    private void CasillaE13x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x3ActionPerformed
        int x = 12;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x3ActionPerformed

    private void CasillaE13x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x4ActionPerformed
        int x = 12;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x4ActionPerformed

    private void CasillaE13x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x5ActionPerformed
        int x = 12;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x5ActionPerformed

    private void CasillaE13x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x6ActionPerformed
        int x = 12;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x6ActionPerformed

    private void CasillaE13x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x7ActionPerformed
        int x = 12;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x7ActionPerformed

    private void CasillaE13x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x8ActionPerformed
        int x = 12;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x8ActionPerformed

    private void CasillaE13x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x9ActionPerformed
        int x = 12;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x9ActionPerformed

    private void CasillaE13x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x10ActionPerformed
        int x = 12;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x10ActionPerformed

    private void CasillaE13x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x11ActionPerformed
        int x = 12;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x11ActionPerformed

    private void CasillaE13x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x12ActionPerformed
        int x = 12;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x12ActionPerformed

    private void CasillaE13x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x13ActionPerformed
        int x = 12;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x13ActionPerformed

    private void CasillaE13x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x14ActionPerformed
        int x = 12;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x14ActionPerformed

    private void CasillaE13x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE13x15ActionPerformed
        int x = 12;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE13x15ActionPerformed

    private void CasillaE14x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x1ActionPerformed
        int x = 13;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x1ActionPerformed

    private void CasillaE14x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x2ActionPerformed
        int x = 13;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x2ActionPerformed

    private void CasillaE14x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x3ActionPerformed
        int x = 13;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x3ActionPerformed

    private void CasillaE14x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x4ActionPerformed
        int x = 13;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x4ActionPerformed

    private void CasillaE14x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x5ActionPerformed
        int x = 13;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x5ActionPerformed

    private void CasillaE14x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x6ActionPerformed
        int x = 13;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x6ActionPerformed

    private void CasillaE14x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x7ActionPerformed
        int x = 13;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x7ActionPerformed

    private void CasillaE14x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x8ActionPerformed
        int x = 13;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x8ActionPerformed

    private void CasillaE14x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x9ActionPerformed
        int x = 13;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x9ActionPerformed

    private void CasillaE14x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x10ActionPerformed
        int x = 13;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x10ActionPerformed

    private void CasillaE14x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x11ActionPerformed
        int x = 13;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x11ActionPerformed

    private void CasillaE14x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x12ActionPerformed
        int x = 13;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x12ActionPerformed

    private void CasillaE14x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x13ActionPerformed
        int x = 13;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x13ActionPerformed

    private void CasillaE14x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x14ActionPerformed
        int x = 13;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x14ActionPerformed

    private void CasillaE14x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE14x15ActionPerformed
        int x = 13;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE14x15ActionPerformed

    private void CasillaE15x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x1ActionPerformed
        int x = 14;
        int y = 0;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x1ActionPerformed

    private void CasillaE15x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x2ActionPerformed
        int x = 14;
        int y = 1;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x2ActionPerformed

    private void CasillaE15x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x3ActionPerformed
        int x = 14;
        int y = 2;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x3ActionPerformed

    private void CasillaE15x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x4ActionPerformed
        int x = 14;
        int y = 3;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x4ActionPerformed

    private void CasillaE15x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x5ActionPerformed
        int x = 14;
        int y = 4;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x5ActionPerformed

    private void CasillaE15x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x6ActionPerformed
        int x = 14;
        int y = 5;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x6ActionPerformed

    private void CasillaE15x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x7ActionPerformed
        int x = 14;
        int y = 6;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x7ActionPerformed

    private void CasillaE15x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x8ActionPerformed
        int x = 14;
        int y = 7;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x8ActionPerformed

    private void CasillaE15x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x9ActionPerformed
        int x = 14;
        int y = 8;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x9ActionPerformed

    private void CasillaE15x10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x10ActionPerformed
        int x = 14;
        int y = 9;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x10ActionPerformed

    private void CasillaE15x11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x11ActionPerformed
        int x = 14;
        int y = 10;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x11ActionPerformed

    private void CasillaE15x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x12ActionPerformed
        int x = 14;
        int y = 11;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x12ActionPerformed

    private void CasillaE15x13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x13ActionPerformed
        int x = 14;
        int y = 12;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x13ActionPerformed

    private void CasillaE15x14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x14ActionPerformed
        int x = 14;
        int y = 13;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x14ActionPerformed

    private void CasillaE15x15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasillaE15x15ActionPerformed
        int x = 14;
        int y = 14;
        
        atacar(x, y);
    }//GEN-LAST:event_CasillaE15x15ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        try {
            if (lblFase.getText().equals("")){
                lblFase.setText("Listo");
            }else{
                lblFase.setText("");
            }
            refCliente.hiloCliente.writer.writeInt(4);
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Casilla10x1;
    private javax.swing.JButton Casilla10x10;
    private javax.swing.JButton Casilla10x11;
    private javax.swing.JButton Casilla10x12;
    private javax.swing.JButton Casilla10x13;
    private javax.swing.JButton Casilla10x14;
    private javax.swing.JButton Casilla10x15;
    private javax.swing.JButton Casilla10x2;
    private javax.swing.JButton Casilla10x3;
    private javax.swing.JButton Casilla10x4;
    private javax.swing.JButton Casilla10x5;
    private javax.swing.JButton Casilla10x6;
    private javax.swing.JButton Casilla10x7;
    private javax.swing.JButton Casilla10x8;
    private javax.swing.JButton Casilla10x9;
    private javax.swing.JButton Casilla11x1;
    private javax.swing.JButton Casilla11x10;
    private javax.swing.JButton Casilla11x11;
    private javax.swing.JButton Casilla11x12;
    private javax.swing.JButton Casilla11x13;
    private javax.swing.JButton Casilla11x14;
    private javax.swing.JButton Casilla11x15;
    private javax.swing.JButton Casilla11x2;
    private javax.swing.JButton Casilla11x3;
    private javax.swing.JButton Casilla11x4;
    private javax.swing.JButton Casilla11x5;
    private javax.swing.JButton Casilla11x6;
    private javax.swing.JButton Casilla11x7;
    private javax.swing.JButton Casilla11x8;
    private javax.swing.JButton Casilla11x9;
    private javax.swing.JButton Casilla12x1;
    private javax.swing.JButton Casilla12x10;
    private javax.swing.JButton Casilla12x11;
    private javax.swing.JButton Casilla12x12;
    private javax.swing.JButton Casilla12x13;
    private javax.swing.JButton Casilla12x14;
    private javax.swing.JButton Casilla12x15;
    private javax.swing.JButton Casilla12x2;
    private javax.swing.JButton Casilla12x3;
    private javax.swing.JButton Casilla12x4;
    private javax.swing.JButton Casilla12x5;
    private javax.swing.JButton Casilla12x6;
    private javax.swing.JButton Casilla12x7;
    private javax.swing.JButton Casilla12x8;
    private javax.swing.JButton Casilla12x9;
    private javax.swing.JButton Casilla13x1;
    private javax.swing.JButton Casilla13x10;
    private javax.swing.JButton Casilla13x11;
    private javax.swing.JButton Casilla13x12;
    private javax.swing.JButton Casilla13x13;
    private javax.swing.JButton Casilla13x14;
    private javax.swing.JButton Casilla13x15;
    private javax.swing.JButton Casilla13x2;
    private javax.swing.JButton Casilla13x3;
    private javax.swing.JButton Casilla13x4;
    private javax.swing.JButton Casilla13x5;
    private javax.swing.JButton Casilla13x6;
    private javax.swing.JButton Casilla13x7;
    private javax.swing.JButton Casilla13x8;
    private javax.swing.JButton Casilla13x9;
    private javax.swing.JButton Casilla14x1;
    private javax.swing.JButton Casilla14x10;
    private javax.swing.JButton Casilla14x11;
    private javax.swing.JButton Casilla14x12;
    private javax.swing.JButton Casilla14x13;
    private javax.swing.JButton Casilla14x14;
    private javax.swing.JButton Casilla14x15;
    private javax.swing.JButton Casilla14x2;
    private javax.swing.JButton Casilla14x3;
    private javax.swing.JButton Casilla14x4;
    private javax.swing.JButton Casilla14x5;
    private javax.swing.JButton Casilla14x6;
    private javax.swing.JButton Casilla14x7;
    private javax.swing.JButton Casilla14x8;
    private javax.swing.JButton Casilla14x9;
    private javax.swing.JButton Casilla15x1;
    private javax.swing.JButton Casilla15x10;
    private javax.swing.JButton Casilla15x11;
    private javax.swing.JButton Casilla15x12;
    private javax.swing.JButton Casilla15x13;
    private javax.swing.JButton Casilla15x14;
    private javax.swing.JButton Casilla15x15;
    private javax.swing.JButton Casilla15x2;
    private javax.swing.JButton Casilla15x3;
    private javax.swing.JButton Casilla15x4;
    private javax.swing.JButton Casilla15x5;
    private javax.swing.JButton Casilla15x6;
    private javax.swing.JButton Casilla15x7;
    private javax.swing.JButton Casilla15x8;
    private javax.swing.JButton Casilla15x9;
    private javax.swing.JButton Casilla1x1;
    private javax.swing.JButton Casilla1x10;
    private javax.swing.JButton Casilla1x11;
    private javax.swing.JButton Casilla1x12;
    private javax.swing.JButton Casilla1x13;
    private javax.swing.JButton Casilla1x14;
    private javax.swing.JButton Casilla1x15;
    private javax.swing.JButton Casilla1x2;
    private javax.swing.JButton Casilla1x3;
    private javax.swing.JButton Casilla1x4;
    private javax.swing.JButton Casilla1x5;
    private javax.swing.JButton Casilla1x6;
    private javax.swing.JButton Casilla1x7;
    private javax.swing.JButton Casilla1x8;
    private javax.swing.JButton Casilla1x9;
    private javax.swing.JButton Casilla2x1;
    private javax.swing.JButton Casilla2x10;
    private javax.swing.JButton Casilla2x11;
    private javax.swing.JButton Casilla2x12;
    private javax.swing.JButton Casilla2x13;
    private javax.swing.JButton Casilla2x14;
    private javax.swing.JButton Casilla2x15;
    private javax.swing.JButton Casilla2x2;
    private javax.swing.JButton Casilla2x3;
    private javax.swing.JButton Casilla2x4;
    private javax.swing.JButton Casilla2x5;
    private javax.swing.JButton Casilla2x6;
    private javax.swing.JButton Casilla2x7;
    private javax.swing.JButton Casilla2x8;
    private javax.swing.JButton Casilla2x9;
    private javax.swing.JButton Casilla3x1;
    private javax.swing.JButton Casilla3x10;
    private javax.swing.JButton Casilla3x11;
    private javax.swing.JButton Casilla3x12;
    private javax.swing.JButton Casilla3x13;
    private javax.swing.JButton Casilla3x14;
    private javax.swing.JButton Casilla3x15;
    private javax.swing.JButton Casilla3x2;
    private javax.swing.JButton Casilla3x3;
    private javax.swing.JButton Casilla3x4;
    private javax.swing.JButton Casilla3x5;
    private javax.swing.JButton Casilla3x6;
    private javax.swing.JButton Casilla3x7;
    private javax.swing.JButton Casilla3x8;
    private javax.swing.JButton Casilla3x9;
    private javax.swing.JButton Casilla4x1;
    private javax.swing.JButton Casilla4x10;
    private javax.swing.JButton Casilla4x11;
    private javax.swing.JButton Casilla4x12;
    private javax.swing.JButton Casilla4x13;
    private javax.swing.JButton Casilla4x14;
    private javax.swing.JButton Casilla4x15;
    private javax.swing.JButton Casilla4x2;
    private javax.swing.JButton Casilla4x3;
    private javax.swing.JButton Casilla4x4;
    private javax.swing.JButton Casilla4x5;
    private javax.swing.JButton Casilla4x6;
    private javax.swing.JButton Casilla4x7;
    private javax.swing.JButton Casilla4x8;
    private javax.swing.JButton Casilla4x9;
    private javax.swing.JButton Casilla5x1;
    private javax.swing.JButton Casilla5x10;
    private javax.swing.JButton Casilla5x11;
    private javax.swing.JButton Casilla5x12;
    private javax.swing.JButton Casilla5x13;
    private javax.swing.JButton Casilla5x14;
    private javax.swing.JButton Casilla5x15;
    private javax.swing.JButton Casilla5x2;
    private javax.swing.JButton Casilla5x3;
    private javax.swing.JButton Casilla5x4;
    private javax.swing.JButton Casilla5x5;
    private javax.swing.JButton Casilla5x6;
    private javax.swing.JButton Casilla5x7;
    private javax.swing.JButton Casilla5x8;
    private javax.swing.JButton Casilla5x9;
    private javax.swing.JButton Casilla6x1;
    private javax.swing.JButton Casilla6x10;
    private javax.swing.JButton Casilla6x11;
    private javax.swing.JButton Casilla6x12;
    private javax.swing.JButton Casilla6x13;
    private javax.swing.JButton Casilla6x14;
    private javax.swing.JButton Casilla6x15;
    private javax.swing.JButton Casilla6x2;
    private javax.swing.JButton Casilla6x3;
    private javax.swing.JButton Casilla6x4;
    private javax.swing.JButton Casilla6x5;
    private javax.swing.JButton Casilla6x6;
    private javax.swing.JButton Casilla6x7;
    private javax.swing.JButton Casilla6x8;
    private javax.swing.JButton Casilla6x9;
    private javax.swing.JButton Casilla7x1;
    private javax.swing.JButton Casilla7x10;
    private javax.swing.JButton Casilla7x11;
    private javax.swing.JButton Casilla7x12;
    private javax.swing.JButton Casilla7x13;
    private javax.swing.JButton Casilla7x14;
    private javax.swing.JButton Casilla7x15;
    private javax.swing.JButton Casilla7x2;
    private javax.swing.JButton Casilla7x3;
    private javax.swing.JButton Casilla7x4;
    private javax.swing.JButton Casilla7x5;
    private javax.swing.JButton Casilla7x6;
    private javax.swing.JButton Casilla7x7;
    private javax.swing.JButton Casilla7x8;
    private javax.swing.JButton Casilla7x9;
    private javax.swing.JButton Casilla8x1;
    private javax.swing.JButton Casilla8x10;
    private javax.swing.JButton Casilla8x11;
    private javax.swing.JButton Casilla8x12;
    private javax.swing.JButton Casilla8x13;
    private javax.swing.JButton Casilla8x14;
    private javax.swing.JButton Casilla8x15;
    private javax.swing.JButton Casilla8x2;
    private javax.swing.JButton Casilla8x3;
    private javax.swing.JButton Casilla8x4;
    private javax.swing.JButton Casilla8x5;
    private javax.swing.JButton Casilla8x6;
    private javax.swing.JButton Casilla8x7;
    private javax.swing.JButton Casilla8x8;
    private javax.swing.JButton Casilla8x9;
    private javax.swing.JButton Casilla9x1;
    private javax.swing.JButton Casilla9x10;
    private javax.swing.JButton Casilla9x11;
    private javax.swing.JButton Casilla9x12;
    private javax.swing.JButton Casilla9x13;
    private javax.swing.JButton Casilla9x14;
    private javax.swing.JButton Casilla9x15;
    private javax.swing.JButton Casilla9x2;
    private javax.swing.JButton Casilla9x3;
    private javax.swing.JButton Casilla9x4;
    private javax.swing.JButton Casilla9x5;
    private javax.swing.JButton Casilla9x6;
    private javax.swing.JButton Casilla9x7;
    private javax.swing.JButton Casilla9x8;
    private javax.swing.JButton Casilla9x9;
    private javax.swing.JButton CasillaE10x1;
    private javax.swing.JButton CasillaE10x10;
    private javax.swing.JButton CasillaE10x11;
    private javax.swing.JButton CasillaE10x12;
    private javax.swing.JButton CasillaE10x13;
    private javax.swing.JButton CasillaE10x14;
    private javax.swing.JButton CasillaE10x15;
    private javax.swing.JButton CasillaE10x2;
    private javax.swing.JButton CasillaE10x3;
    private javax.swing.JButton CasillaE10x4;
    private javax.swing.JButton CasillaE10x5;
    private javax.swing.JButton CasillaE10x6;
    private javax.swing.JButton CasillaE10x7;
    private javax.swing.JButton CasillaE10x8;
    private javax.swing.JButton CasillaE10x9;
    private javax.swing.JButton CasillaE11x1;
    private javax.swing.JButton CasillaE11x10;
    private javax.swing.JButton CasillaE11x11;
    private javax.swing.JButton CasillaE11x12;
    private javax.swing.JButton CasillaE11x13;
    private javax.swing.JButton CasillaE11x14;
    private javax.swing.JButton CasillaE11x15;
    private javax.swing.JButton CasillaE11x2;
    private javax.swing.JButton CasillaE11x3;
    private javax.swing.JButton CasillaE11x4;
    private javax.swing.JButton CasillaE11x5;
    private javax.swing.JButton CasillaE11x6;
    private javax.swing.JButton CasillaE11x7;
    private javax.swing.JButton CasillaE11x8;
    private javax.swing.JButton CasillaE11x9;
    private javax.swing.JButton CasillaE12x1;
    private javax.swing.JButton CasillaE12x10;
    private javax.swing.JButton CasillaE12x11;
    private javax.swing.JButton CasillaE12x12;
    private javax.swing.JButton CasillaE12x13;
    private javax.swing.JButton CasillaE12x14;
    private javax.swing.JButton CasillaE12x15;
    private javax.swing.JButton CasillaE12x2;
    private javax.swing.JButton CasillaE12x3;
    private javax.swing.JButton CasillaE12x4;
    private javax.swing.JButton CasillaE12x5;
    private javax.swing.JButton CasillaE12x6;
    private javax.swing.JButton CasillaE12x7;
    private javax.swing.JButton CasillaE12x8;
    private javax.swing.JButton CasillaE12x9;
    private javax.swing.JButton CasillaE13x1;
    private javax.swing.JButton CasillaE13x10;
    private javax.swing.JButton CasillaE13x11;
    private javax.swing.JButton CasillaE13x12;
    private javax.swing.JButton CasillaE13x13;
    private javax.swing.JButton CasillaE13x14;
    private javax.swing.JButton CasillaE13x15;
    private javax.swing.JButton CasillaE13x2;
    private javax.swing.JButton CasillaE13x3;
    private javax.swing.JButton CasillaE13x4;
    private javax.swing.JButton CasillaE13x5;
    private javax.swing.JButton CasillaE13x6;
    private javax.swing.JButton CasillaE13x7;
    private javax.swing.JButton CasillaE13x8;
    private javax.swing.JButton CasillaE13x9;
    private javax.swing.JButton CasillaE14x1;
    private javax.swing.JButton CasillaE14x10;
    private javax.swing.JButton CasillaE14x11;
    private javax.swing.JButton CasillaE14x12;
    private javax.swing.JButton CasillaE14x13;
    private javax.swing.JButton CasillaE14x14;
    private javax.swing.JButton CasillaE14x15;
    private javax.swing.JButton CasillaE14x2;
    private javax.swing.JButton CasillaE14x3;
    private javax.swing.JButton CasillaE14x4;
    private javax.swing.JButton CasillaE14x5;
    private javax.swing.JButton CasillaE14x6;
    private javax.swing.JButton CasillaE14x7;
    private javax.swing.JButton CasillaE14x8;
    private javax.swing.JButton CasillaE14x9;
    private javax.swing.JButton CasillaE15x1;
    private javax.swing.JButton CasillaE15x10;
    private javax.swing.JButton CasillaE15x11;
    private javax.swing.JButton CasillaE15x12;
    private javax.swing.JButton CasillaE15x13;
    private javax.swing.JButton CasillaE15x14;
    private javax.swing.JButton CasillaE15x15;
    private javax.swing.JButton CasillaE15x2;
    private javax.swing.JButton CasillaE15x3;
    private javax.swing.JButton CasillaE15x4;
    private javax.swing.JButton CasillaE15x5;
    private javax.swing.JButton CasillaE15x6;
    private javax.swing.JButton CasillaE15x7;
    private javax.swing.JButton CasillaE15x8;
    private javax.swing.JButton CasillaE15x9;
    private javax.swing.JButton CasillaE1x1;
    private javax.swing.JButton CasillaE1x10;
    private javax.swing.JButton CasillaE1x11;
    private javax.swing.JButton CasillaE1x12;
    private javax.swing.JButton CasillaE1x13;
    private javax.swing.JButton CasillaE1x14;
    private javax.swing.JButton CasillaE1x15;
    private javax.swing.JButton CasillaE1x2;
    private javax.swing.JButton CasillaE1x3;
    private javax.swing.JButton CasillaE1x4;
    private javax.swing.JButton CasillaE1x5;
    private javax.swing.JButton CasillaE1x6;
    private javax.swing.JButton CasillaE1x7;
    private javax.swing.JButton CasillaE1x8;
    private javax.swing.JButton CasillaE1x9;
    private javax.swing.JButton CasillaE2x1;
    private javax.swing.JButton CasillaE2x10;
    private javax.swing.JButton CasillaE2x11;
    private javax.swing.JButton CasillaE2x12;
    private javax.swing.JButton CasillaE2x13;
    private javax.swing.JButton CasillaE2x14;
    private javax.swing.JButton CasillaE2x15;
    private javax.swing.JButton CasillaE2x2;
    private javax.swing.JButton CasillaE2x3;
    private javax.swing.JButton CasillaE2x4;
    private javax.swing.JButton CasillaE2x5;
    private javax.swing.JButton CasillaE2x6;
    private javax.swing.JButton CasillaE2x7;
    private javax.swing.JButton CasillaE2x8;
    private javax.swing.JButton CasillaE2x9;
    private javax.swing.JButton CasillaE3x1;
    private javax.swing.JButton CasillaE3x10;
    private javax.swing.JButton CasillaE3x11;
    private javax.swing.JButton CasillaE3x12;
    private javax.swing.JButton CasillaE3x13;
    private javax.swing.JButton CasillaE3x14;
    private javax.swing.JButton CasillaE3x15;
    private javax.swing.JButton CasillaE3x2;
    private javax.swing.JButton CasillaE3x3;
    private javax.swing.JButton CasillaE3x4;
    private javax.swing.JButton CasillaE3x5;
    private javax.swing.JButton CasillaE3x6;
    private javax.swing.JButton CasillaE3x7;
    private javax.swing.JButton CasillaE3x8;
    private javax.swing.JButton CasillaE3x9;
    private javax.swing.JButton CasillaE4x1;
    private javax.swing.JButton CasillaE4x10;
    private javax.swing.JButton CasillaE4x11;
    private javax.swing.JButton CasillaE4x12;
    private javax.swing.JButton CasillaE4x13;
    private javax.swing.JButton CasillaE4x14;
    private javax.swing.JButton CasillaE4x15;
    private javax.swing.JButton CasillaE4x2;
    private javax.swing.JButton CasillaE4x3;
    private javax.swing.JButton CasillaE4x4;
    private javax.swing.JButton CasillaE4x5;
    private javax.swing.JButton CasillaE4x6;
    private javax.swing.JButton CasillaE4x7;
    private javax.swing.JButton CasillaE4x8;
    private javax.swing.JButton CasillaE4x9;
    private javax.swing.JButton CasillaE5x1;
    private javax.swing.JButton CasillaE5x10;
    private javax.swing.JButton CasillaE5x11;
    private javax.swing.JButton CasillaE5x12;
    private javax.swing.JButton CasillaE5x13;
    private javax.swing.JButton CasillaE5x14;
    private javax.swing.JButton CasillaE5x15;
    private javax.swing.JButton CasillaE5x2;
    private javax.swing.JButton CasillaE5x3;
    private javax.swing.JButton CasillaE5x4;
    private javax.swing.JButton CasillaE5x5;
    private javax.swing.JButton CasillaE5x6;
    private javax.swing.JButton CasillaE5x7;
    private javax.swing.JButton CasillaE5x8;
    private javax.swing.JButton CasillaE5x9;
    private javax.swing.JButton CasillaE6x1;
    private javax.swing.JButton CasillaE6x10;
    private javax.swing.JButton CasillaE6x11;
    private javax.swing.JButton CasillaE6x12;
    private javax.swing.JButton CasillaE6x13;
    private javax.swing.JButton CasillaE6x14;
    private javax.swing.JButton CasillaE6x15;
    private javax.swing.JButton CasillaE6x2;
    private javax.swing.JButton CasillaE6x3;
    private javax.swing.JButton CasillaE6x4;
    private javax.swing.JButton CasillaE6x5;
    private javax.swing.JButton CasillaE6x6;
    private javax.swing.JButton CasillaE6x7;
    private javax.swing.JButton CasillaE6x8;
    private javax.swing.JButton CasillaE6x9;
    private javax.swing.JButton CasillaE7x1;
    private javax.swing.JButton CasillaE7x10;
    private javax.swing.JButton CasillaE7x11;
    private javax.swing.JButton CasillaE7x12;
    private javax.swing.JButton CasillaE7x13;
    private javax.swing.JButton CasillaE7x14;
    private javax.swing.JButton CasillaE7x15;
    private javax.swing.JButton CasillaE7x2;
    private javax.swing.JButton CasillaE7x3;
    private javax.swing.JButton CasillaE7x4;
    private javax.swing.JButton CasillaE7x5;
    private javax.swing.JButton CasillaE7x6;
    private javax.swing.JButton CasillaE7x7;
    private javax.swing.JButton CasillaE7x8;
    private javax.swing.JButton CasillaE7x9;
    private javax.swing.JButton CasillaE8x1;
    private javax.swing.JButton CasillaE8x10;
    private javax.swing.JButton CasillaE8x11;
    private javax.swing.JButton CasillaE8x12;
    private javax.swing.JButton CasillaE8x13;
    private javax.swing.JButton CasillaE8x14;
    private javax.swing.JButton CasillaE8x15;
    private javax.swing.JButton CasillaE8x2;
    private javax.swing.JButton CasillaE8x3;
    private javax.swing.JButton CasillaE8x4;
    private javax.swing.JButton CasillaE8x5;
    private javax.swing.JButton CasillaE8x6;
    private javax.swing.JButton CasillaE8x7;
    private javax.swing.JButton CasillaE8x8;
    private javax.swing.JButton CasillaE8x9;
    private javax.swing.JButton CasillaE9x1;
    private javax.swing.JButton CasillaE9x10;
    private javax.swing.JButton CasillaE9x11;
    private javax.swing.JButton CasillaE9x12;
    private javax.swing.JButton CasillaE9x13;
    private javax.swing.JButton CasillaE9x14;
    private javax.swing.JButton CasillaE9x15;
    private javax.swing.JButton CasillaE9x2;
    private javax.swing.JButton CasillaE9x3;
    private javax.swing.JButton CasillaE9x4;
    private javax.swing.JButton CasillaE9x5;
    private javax.swing.JButton CasillaE9x6;
    private javax.swing.JButton CasillaE9x7;
    private javax.swing.JButton CasillaE9x8;
    private javax.swing.JButton CasillaE9x9;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cbxAtaque;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnemigo;
    private javax.swing.JLabel lblFase;
    private javax.swing.JTextArea txaMensajes;
    private javax.swing.JTextField txfMensaje;
    // End of variables declaration//GEN-END:variables
}
