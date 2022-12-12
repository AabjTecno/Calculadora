/*
Apuntes :  
   
    El activado igual a true es para que no de error para cuando el usuario presione mas sin anteriormente 
    aver digitado algun numero
    ---------------------------------------------------------------------------------------------------------
    Repaso del actionpunto :  creamos una variable tipo boolean llamada punto por el error de que al a ver un 
    espacio vacio si presionamos punto se agrega y cuando despues de poner un numero lo posterior del numero
    se pone puntos infinitos . 
    La Solucion Fue :  

    1.creamos la variable action punto como true . (activado )  
    2.creamos una condicion que si el punto es true  haga las condiciones : 
    2.1- si la condicion principal es true y la condicion de que hay un espacio vacio se agrege un 0.  
    Caso contrario solo se agrega el punto  
    2.2- Para volver a activar el boton se debe hacer una operacion osea presionar (+) (-) ect  . 
    ---------------------------------------------------------------------------------------------- 
    boton cambio de numero 
    // Cortame desde la posicion 1 al resto de la cadena 
      valoracum =valoracum.substring(1,valoracum.length()); 
        boton eliminar 
       // osea vamos a imprimir desde 0 osea principio hasta 4-1
                                            // ejemplo 430 4=0 y 0 =4  
                                            // 43
    
 */
package Ventanas_Codigo;

import java.awt.Image;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Calculadora extends javax.swing.JFrame {

    static DecimalFormat redondear = new DecimalFormat("0.00");

    private double primerNUM, resultado;

    private String valoracum = "";
    private String operacion = "nula";
    private boolean activado = true, actionpunto = true, forma = true;
   
    
    private void CerrarPrograma(){
        String botones[]={"Cerrar" ,"Cancelar"}; 
        
        int opcion = JOptionPane.showOptionDialog(null,"¿Desea Cerrar el Programa ?"
                , "Finalizar Programa", JOptionPane.INFORMATION_MESSAGE, 0, null, botones,botones[0]);
        
        if (opcion== JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else if (opcion == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Programa no Finalizado ");
        }
    }
    

    public Calculadora() {
        this.setSize(320, 459);
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
        setIconImage(new ImageIcon(getClass().getResource("/Img/346399.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenu2 = new javax.swing.JMenu();
        panelbotones = new javax.swing.JPanel();
        limpiar = new javax.swing.JButton();
        cambiarsigno = new javax.swing.JButton();
        residuo = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        sumar = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        numero0 = new javax.swing.JButton();
        numero1 = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        division = new javax.swing.JButton();
        Imprimir = new javax.swing.JLabel();
        imprimirarriba = new javax.swing.JLabel();
        numero5 = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JMenuBar();
        MenuUso = new javax.swing.JMenu();
        separadorP = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        modooscuro = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        modolight = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ConversorD = new javax.swing.JMenuItem();
        separador2 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        BotonSalir = new javax.swing.JMenuItem();
        separador3 = new javax.swing.JPopupMenu.Separator();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora (Autor Brayan Almengor)");
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelbotones.setBackground(new java.awt.Color(51, 51, 51));
        panelbotones.setForeground(new java.awt.Color(102, 102, 102));
        panelbotones.setLayout(new java.awt.GridBagLayout());

        limpiar.setBackground(new java.awt.Color(255, 153, 0));
        limpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("AC");
        limpiar.setBorder(null);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(limpiar, gridBagConstraints);

        cambiarsigno.setBackground(new java.awt.Color(51, 51, 51));
        cambiarsigno.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        cambiarsigno.setForeground(new java.awt.Color(0, 0, 0));
        cambiarsigno.setText("+/-");
        cambiarsigno.setBorder(null);
        cambiarsigno.setOpaque(true);
        cambiarsigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarsignoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(cambiarsigno, gridBagConstraints);

        residuo.setBackground(new java.awt.Color(51, 51, 51));
        residuo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        residuo.setForeground(new java.awt.Color(255, 255, 255));
        residuo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/raiz.png"))); // NOI18N
        residuo.setBorder(null);
        residuo.setOpaque(true);
        residuo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                residuoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(residuo, gridBagConstraints);

        borrar.setBackground(new java.awt.Color(255, 153, 0));
        borrar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(204, 204, 204));
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Borrar.png"))); // NOI18N
        borrar.setBorder(null);
        borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrar.setOpaque(true);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(borrar, gridBagConstraints);

        multiplicar.setBackground(new java.awt.Color(255, 153, 0));
        multiplicar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        multiplicar.setForeground(new java.awt.Color(255, 255, 255));
        multiplicar.setText("X");
        multiplicar.setBorder(null);
        multiplicar.setOpaque(true);
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(multiplicar, gridBagConstraints);

        restar.setBackground(new java.awt.Color(255, 153, 0));
        restar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        restar.setForeground(new java.awt.Color(255, 255, 255));
        restar.setText("-");
        restar.setBorder(null);
        restar.setOpaque(true);
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(restar, gridBagConstraints);

        sumar.setBackground(new java.awt.Color(255, 153, 0));
        sumar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        sumar.setForeground(new java.awt.Color(255, 255, 255));
        sumar.setText("+");
        sumar.setBorder(null);
        sumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sumarMouseReleased(evt);
            }
        });
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(sumar, gridBagConstraints);

        igual.setBackground(new java.awt.Color(51, 51, 51));
        igual.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setText("=");
        igual.setBorder(null);
        igual.setOpaque(true);
        igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igualMouseClicked(evt);
            }
        });
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(igual, gridBagConstraints);

        punto.setBackground(new java.awt.Color(51, 51, 51));
        punto.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        punto.setForeground(new java.awt.Color(255, 255, 255));
        punto.setText(".");
        punto.setBorder(null);
        punto.setOpaque(true);
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(punto, gridBagConstraints);

        numero0.setBackground(new java.awt.Color(51, 51, 51));
        numero0.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero0.setForeground(new java.awt.Color(255, 255, 255));
        numero0.setText("0");
        numero0.setBorder(null);
        numero0.setOpaque(true);
        numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(numero0, gridBagConstraints);

        numero1.setBackground(new java.awt.Color(51, 51, 51));
        numero1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero1.setForeground(new java.awt.Color(255, 255, 255));
        numero1.setText("1");
        numero1.setBorder(null);
        numero1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        numero1.setOpaque(true);
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(numero1, gridBagConstraints);

        numero2.setBackground(new java.awt.Color(51, 51, 51));
        numero2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero2.setForeground(new java.awt.Color(255, 255, 255));
        numero2.setText("2");
        numero2.setBorder(null);
        numero2.setOpaque(true);
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(numero2, gridBagConstraints);

        numero3.setBackground(new java.awt.Color(51, 51, 51));
        numero3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero3.setForeground(new java.awt.Color(255, 255, 255));
        numero3.setText("3");
        numero3.setBorder(null);
        numero3.setOpaque(true);
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(numero3, gridBagConstraints);

        numero4.setBackground(new java.awt.Color(51, 51, 51));
        numero4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero4.setForeground(new java.awt.Color(255, 255, 255));
        numero4.setText("4");
        numero4.setBorder(null);
        numero4.setOpaque(true);
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(numero4, gridBagConstraints);

        numero6.setBackground(new java.awt.Color(51, 51, 51));
        numero6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero6.setForeground(new java.awt.Color(255, 255, 255));
        numero6.setText("6");
        numero6.setBorder(null);
        numero6.setOpaque(true);
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(numero6, gridBagConstraints);

        numero7.setBackground(new java.awt.Color(51, 51, 51));
        numero7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero7.setForeground(new java.awt.Color(204, 204, 204));
        numero7.setText("7");
        numero7.setBorder(null);
        numero7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        numero7.setOpaque(true);
        numero7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                numero7MouseReleased(evt);
            }
        });
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(numero7, gridBagConstraints);

        numero8.setBackground(new java.awt.Color(51, 51, 51));
        numero8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero8.setForeground(new java.awt.Color(255, 255, 255));
        numero8.setText("8");
        numero8.setBorder(null);
        numero8.setOpaque(true);
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(numero8, gridBagConstraints);

        numero9.setBackground(new java.awt.Color(51, 51, 51));
        numero9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero9.setForeground(new java.awt.Color(255, 255, 255));
        numero9.setText("9");
        numero9.setBorder(null);
        numero9.setOpaque(true);
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(numero9, gridBagConstraints);

        division.setBackground(new java.awt.Color(255, 153, 0));
        division.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        division.setForeground(new java.awt.Color(255, 255, 255));
        division.setText("/");
        division.setBorder(null);
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(division, gridBagConstraints);

        Imprimir.setBackground(new java.awt.Color(30, 30, 30));
        Imprimir.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        Imprimir.setForeground(new java.awt.Color(0, 204, 0));
        Imprimir.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Imprimir.setText("0  ");
        Imprimir.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(Imprimir, gridBagConstraints);

        imprimirarriba.setBackground(new java.awt.Color(29, 30, 30));
        imprimirarriba.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        imprimirarriba.setForeground(new java.awt.Color(0, 204, 0));
        imprimirarriba.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        imprimirarriba.setText(" ");
        imprimirarriba.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 45;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(imprimirarriba, gridBagConstraints);

        numero5.setBackground(new java.awt.Color(51, 51, 51));
        numero5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero5.setForeground(new java.awt.Color(255, 255, 255));
        numero5.setText("5");
        numero5.setBorder(null);
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelbotones.add(numero5, gridBagConstraints);

        MenuPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        MenuUso.setForeground(new java.awt.Color(255, 255, 255));
        MenuUso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ajustes.png"))); // NOI18N
        MenuUso.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        MenuUso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuUso.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        MenuUso.add(separadorP);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calculadora.png"))); // NOI18N
        jMenu1.setText("Calculadora Estandar");
        jMenu1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jMenu1.add(jSeparator3);

        modooscuro.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        modooscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Modooscuroo.png"))); // NOI18N
        modooscuro.setText("Tema Oscuro");
        jMenu1.add(modooscuro);
        jMenu1.add(jSeparator4);

        modolight.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        modolight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Modo Light.png"))); // NOI18N
        modolight.setText("Tema Claro");
        modolight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modolightActionPerformed(evt);
            }
        });
        jMenu1.add(modolight);
        jMenu1.add(jSeparator5);

        MenuUso.add(jMenu1);
        MenuUso.add(jSeparator1);

        ConversorD.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        ConversorD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/divisas.png"))); // NOI18N
        ConversorD.setText(" Convertor Divisas");
        ConversorD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConversorDActionPerformed(evt);
            }
        });
        MenuUso.add(ConversorD);
        MenuUso.add(separador2);
        MenuUso.add(jSeparator2);

        BotonSalir.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonSalir.png"))); // NOI18N
        BotonSalir.setText(" Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        MenuUso.add(BotonSalir);
        MenuUso.add(separador3);

        MenuPrincipal.add(MenuUso);

        setJMenuBar(MenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbotones, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ActionPerformed

        valoracum += "7";
        Imprimir.setText(valoracum);
        activado = true;
    }//GEN-LAST:event_numero7ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // resets 
        valoracum=""; 
        Imprimir.setText("0"); 
        imprimirarriba.setText("");
        
        primerNUM=0 ;  
        resultado=0 ; 
         operacion="nula"; 
         
         activado=true ; 
         actionpunto=true ; 


    }//GEN-LAST:event_limpiarActionPerformed

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero9ActionPerformed
        valoracum += "9";
        Imprimir.setText(valoracum);
        activado = true;
    }//GEN-LAST:event_numero9ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
        valoracum += "4";
        Imprimir.setText(valoracum);
        activado = true;
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ActionPerformed
        valoracum += "6";
        Imprimir.setText(valoracum);
        activado = true;
    }//GEN-LAST:event_numero6ActionPerformed

    private void numero7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numero7MouseReleased

    }//GEN-LAST:event_numero7MouseReleased

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        valoracum += "1";
        Imprimir.setText(valoracum);
        activado = true;
    }//GEN-LAST:event_numero1ActionPerformed

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed
        valoracum += "3";
        Imprimir.setText(valoracum);
        activado = true;
    }//GEN-LAST:event_numero3ActionPerformed

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed

        if (valoracum.equals("")) {
            valoracum = "";
            activado = false;
        }

        if (activado == true) {
            // Cuando el Usuario digite el numero en la etiqueta quiero  
            primerNUM = Double.parseDouble(valoracum);// lo transformamos a double  
            //Quiero que mi etiqueta Imprimir arriba se muestre  
            imprimirarriba.setText(valoracum + "+");
            valoracum = ""; // vuelve hacer vacio    

            // Operacion va hacer  
            operacion = "sumar";
            activado = false;
            actionpunto = true;
            // para que solo sea pueda activar una ves para volver activarlo se debe tocar cualquier de los numeros 

        }


    }//GEN-LAST:event_sumarActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        activado = true;

        double numero2;

        if (valoracum.equals("")) {
            valoracum = "";
            activado = false;
        }

        if (operacion.equals("nula")) {
            // quiero que me muestres namas el numero  
            Imprimir.setText(valoracum);

        } else if (operacion.equals("sumar")) {
            /* quiero hacer la suma 
            // osea si es nula no pasaria por la condicion suma  osea 
            // obtendriamos el valor acomulado nuevo  
             */
            numero2 = Double.parseDouble(valoracum);
            resultado = primerNUM + numero2;

            // String.format %.2f= 2 decimales
            Imprimir.setText(String.valueOf(redondear.format(resultado)));
            valoracum = String.valueOf(resultado); // para guardar el resultado actual  
            operacion = "nula";// asi evito acumular cuando el usuario digite mas de una vez el igual 

        } else if (operacion.equals("restar")) {
            numero2 = Double.parseDouble(valoracum);
            resultado = primerNUM - numero2;
            Imprimir.setText(String.valueOf(redondear.format(resultado)));
            valoracum = String.valueOf(resultado);
            operacion = "nula";

        } else if (operacion.equals("multiplicar")) {
            numero2 = Double.parseDouble(valoracum);
            resultado = primerNUM * numero2;
            Imprimir.setText(String.valueOf(redondear.format(resultado)));
            valoracum = String.valueOf(resultado);
            operacion = "nula";

        } else if (operacion.equals("dividir")) {
            numero2 = Double.parseDouble(valoracum);
            resultado = primerNUM / numero2;
            Imprimir.setText(String.valueOf(redondear.format(resultado)));
            valoracum = String.valueOf(resultado);
            operacion = "nula";
        } else if (operacion.equals("raiz")) {
            resultado = Math.sqrt(primerNUM);
            Imprimir.setText(String.valueOf(redondear.format(resultado)));
            valoracum = "";
            valoracum = String.valueOf(resultado);
            operacion = "nula";// reseteamos 

        }
        imprimirarriba.setText("");
        activado = true;


    }//GEN-LAST:event_igualActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed

        if (actionpunto == true) {

            if (valoracum.equals("")) {
                valoracum += "0.";
            } else {
                valoracum += ".";
            }

            Imprimir.setText(valoracum);
            actionpunto = false;  // para que se vuelva activar hay que hacer una operacion 
        }

    }//GEN-LAST:event_puntoActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed

        if (valoracum == "") {
            valoracum += "0";
            activado = false;
        }

        if (activado = true) { // si se presiono un numero  

            primerNUM = Double.parseDouble(valoracum);
            imprimirarriba.setText(valoracum + "-");
            valoracum = ""; // guardamos el valor y reseteamos el acumulador   

            operacion = "restar";
            activado = false;
            actionpunto = true;  //      
        }


    }//GEN-LAST:event_restarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        int tamaño = valoracum.length();
        if (tamaño > 0) {

            // Borar elementos por la derecha 
            valoracum = valoracum.substring(0, valoracum.length() - 1);
            Imprimir.setText(valoracum);
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        CerrarPrograma();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed

        if (valoracum.equals("")) {
            valoracum += "0";
            activado = false;
        }
        operacion = "multiplicar";
        if (activado = true) {

            primerNUM = Double.parseDouble(valoracum);
            imprimirarriba.setText(valoracum + "x");
            valoracum = "";
            activado = false;
            actionpunto = true;

        }

    }//GEN-LAST:event_multiplicarActionPerformed

    private void igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igualMouseClicked
        // SI el Usuario Clickea el Igual          

    }//GEN-LAST:event_igualMouseClicked

    private void sumarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumarMouseReleased

    }//GEN-LAST:event_sumarMouseReleased

    private void ConversorDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConversorDActionPerformed
        // para enlazar ventana se hace un objeto de la ventana   

        VentanaDivisas ven = new VentanaDivisas();
        ven.setVisible(true);
        dispose();// para cerrar la ventana

    }//GEN-LAST:event_ConversorDActionPerformed

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ActionPerformed
        valoracum += "8";
        Imprimir.setText(valoracum);
        activado = true;
    }//GEN-LAST:event_numero8ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        valoracum += "2";
        Imprimir.setText(valoracum);
        activado = true;
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero0ActionPerformed

        if (valoracum != "") {
            valoracum += "0";
            Imprimir.setText(valoracum);
            activado = true;
        }


    }//GEN-LAST:event_numero0ActionPerformed

    private void cambiarsignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarsignoActionPerformed
        // si el primer es diferente a un negativo  
        if (valoracum == "") {
            valoracum = "";
            Imprimir.setText(valoracum);
        }

        if ((valoracum.charAt(0) != '-')) {
            valoracum = "-" + valoracum;

        } else {
            // Cortame desde la posicion 1 al resto de la cadena 
            valoracum = valoracum.substring(1, valoracum.length());
        }
        Imprimir.setText(valoracum);


    }//GEN-LAST:event_cambiarsignoActionPerformed

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ActionPerformed
        valoracum += "5";
        Imprimir.setText(valoracum);
        activado = true;
    }//GEN-LAST:event_numero5ActionPerformed

    private void modolightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modolightActionPerformed
        VentanaModoLight modelight = new VentanaModoLight();
        modelight.setVisible(true);
        dispose();

    }//GEN-LAST:event_modolightActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        if (valoracum.equals("")) {
            valoracum += "0";
            activado = false;
        }
        operacion = "dividir";
        if (activado = true) {

            primerNUM = Double.parseDouble(valoracum);
            imprimirarriba.setText(valoracum + "/");
            valoracum = "";
            activado = false;
            actionpunto = true;

        }
    }//GEN-LAST:event_divisionActionPerformed

    private void residuoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_residuoActionPerformed

        if (valoracum.equals("")) {
            valoracum = "";
            activado = false;
        }

        if (activado == true) {
            // Cuando el Usuario digite el numero en la etiqueta quiero  
            primerNUM = Double.parseDouble(valoracum);// lo transformamos a double  
            //Quiero que mi etiqueta Imprimir arriba se muestre  
            imprimirarriba.setText("(" + primerNUM + ")" + "Raiz");
            valoracum = ""; // vuelve hacer vacio    

            // Operacion va hacer  
            operacion = "raiz";
            activado = false;
            actionpunto = true;
            // para que solo sea pueda activar una ves para volver activarlo se debe tocar cualquier de los numeros 

        }


    }//GEN-LAST:event_residuoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        CerrarPrograma();
        
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         */
 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BotonSalir;
    private javax.swing.JMenuItem ConversorD;
    private javax.swing.JLabel Imprimir;
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenu MenuUso;
    private javax.swing.JButton borrar;
    private javax.swing.JButton cambiarsigno;
    private javax.swing.JButton division;
    private javax.swing.JButton igual;
    private javax.swing.JLabel imprimirarriba;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JButton limpiar;
    private javax.swing.JMenuItem modolight;
    private javax.swing.JMenuItem modooscuro;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton numero0;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JButton numero3;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    private javax.swing.JPanel panelbotones;
    private javax.swing.JButton punto;
    private javax.swing.JButton residuo;
    private javax.swing.JButton restar;
    private javax.swing.JPopupMenu.Separator separador2;
    private javax.swing.JPopupMenu.Separator separador3;
    private javax.swing.JPopupMenu.Separator separadorP;
    private javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables
}
