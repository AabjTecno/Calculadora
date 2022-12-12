
package Ventanas_Codigo;

import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaModoLight extends javax.swing.JFrame {

    static DecimalFormat redondear = new DecimalFormat("0.00");

    private String numeroacum = "", Operacion = "nula";
    private double PrimerAcum = 0, resultado = 0;
    private boolean activar = false, operacionrealizado = true;

      
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
    
    
    public VentanaModoLight() {
        this.setSize(320, 459);
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setDefaultCloseOperation(0);
        setIconImage(new ImageIcon(getClass().getResource("/Img/346399.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelp = new javax.swing.JPanel();
        mostrarpantalla = new javax.swing.JLabel();
        MostrarArriba = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        cambiosignos = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        division = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        numero1 = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        numero0 = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        resultados = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuventanaligh = new javax.swing.JMenu();
        estandarcal = new javax.swing.JMenu();
        temaoscuro = new javax.swing.JMenuItem();
        modelight = new javax.swing.JMenuItem();
        conversor = new javax.swing.JMenuItem();
        botonsalirm = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tema Claro (Calculadora )");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panelp.setLayout(new java.awt.GridBagLayout());

        mostrarpantalla.setBackground(new java.awt.Color(102, 102, 102));
        mostrarpantalla.setFont(new java.awt.Font("Consolas", 1, 30)); // NOI18N
        mostrarpantalla.setForeground(new java.awt.Color(255, 255, 255));
        mostrarpantalla.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        mostrarpantalla.setText(" 0 ");
        mostrarpantalla.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        mostrarpantalla.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelp.add(mostrarpantalla, gridBagConstraints);

        MostrarArriba.setBackground(new java.awt.Color(102, 102, 102));
        MostrarArriba.setFont(new java.awt.Font("Consolas", 1, 20)); // NOI18N
        MostrarArriba.setForeground(new java.awt.Color(255, 255, 255));
        MostrarArriba.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        MostrarArriba.setText(" ");
        MostrarArriba.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        MostrarArriba.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 45;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelp.add(MostrarArriba, gridBagConstraints);

        limpiar.setBackground(new java.awt.Color(204, 204, 204));
        limpiar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(0, 0, 0));
        limpiar.setText("AC");
        limpiar.setBorder(null);
        limpiar.setOpaque(true);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelp.add(limpiar, gridBagConstraints);

        cambiosignos.setBackground(new java.awt.Color(153, 153, 153));
        cambiosignos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        cambiosignos.setForeground(new java.awt.Color(0, 0, 0));
        cambiosignos.setText("+/-");
        cambiosignos.setBorder(null);
        cambiosignos.setOpaque(true);
        cambiosignos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiosignosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelp.add(cambiosignos, gridBagConstraints);

        raiz.setBackground(new java.awt.Color(153, 153, 153));
        raiz.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        raiz.setForeground(new java.awt.Color(204, 204, 204));
        raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/raiz.png"))); // NOI18N
        raiz.setBorder(null);
        raiz.setOpaque(true);
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelp.add(raiz, gridBagConstraints);

        eliminar.setBackground(new java.awt.Color(153, 153, 153));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Borrar.png"))); // NOI18N
        eliminar.setBorder(null);
        eliminar.setOpaque(true);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelp.add(eliminar, gridBagConstraints);

        numero7.setBackground(new java.awt.Color(204, 204, 204));
        numero7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero7.setForeground(new java.awt.Color(102, 102, 102));
        numero7.setText("7");
        numero7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        numero7.setOpaque(true);
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelp.add(numero7, gridBagConstraints);

        numero8.setBackground(new java.awt.Color(204, 204, 204));
        numero8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero8.setForeground(new java.awt.Color(102, 102, 102));
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
        panelp.add(numero8, gridBagConstraints);

        numero9.setBackground(new java.awt.Color(204, 204, 204));
        numero9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero9.setForeground(new java.awt.Color(102, 102, 102));
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
        panelp.add(numero9, gridBagConstraints);

        multiplicacion.setBackground(new java.awt.Color(153, 153, 153));
        multiplicacion.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        multiplicacion.setForeground(new java.awt.Color(204, 204, 204));
        multiplicacion.setText("X");
        multiplicacion.setBorder(null);
        multiplicacion.setOpaque(true);
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
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
        panelp.add(multiplicacion, gridBagConstraints);

        numero6.setBackground(new java.awt.Color(204, 204, 204));
        numero6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero6.setForeground(new java.awt.Color(102, 102, 102));
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
        panelp.add(numero6, gridBagConstraints);

        numero5.setBackground(new java.awt.Color(204, 204, 204));
        numero5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero5.setForeground(new java.awt.Color(102, 102, 102));
        numero5.setText("5");
        numero5.setBorder(null);
        numero5.setOpaque(true);
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
        panelp.add(numero5, gridBagConstraints);

        numero4.setBackground(new java.awt.Color(204, 204, 204));
        numero4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero4.setForeground(new java.awt.Color(102, 102, 102));
        numero4.setText("4");
        numero4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
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
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelp.add(numero4, gridBagConstraints);

        suma.setBackground(new java.awt.Color(153, 153, 153));
        suma.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        suma.setForeground(new java.awt.Color(204, 204, 204));
        suma.setText("+");
        suma.setBorder(null);
        suma.setOpaque(true);
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
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
        panelp.add(suma, gridBagConstraints);

        division.setBackground(new java.awt.Color(153, 153, 153));
        division.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        division.setForeground(new java.awt.Color(204, 204, 204));
        division.setText("/");
        division.setBorder(null);
        division.setOpaque(true);
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
        panelp.add(division, gridBagConstraints);

        resta.setBackground(new java.awt.Color(153, 153, 153));
        resta.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        resta.setForeground(new java.awt.Color(204, 204, 204));
        resta.setText("-");
        resta.setBorder(null);
        resta.setOpaque(true);
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
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
        panelp.add(resta, gridBagConstraints);

        numero1.setBackground(new java.awt.Color(204, 204, 204));
        numero1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero1.setForeground(new java.awt.Color(102, 102, 102));
        numero1.setText("1");
        numero1.setBorder(null);
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
        panelp.add(numero1, gridBagConstraints);

        numero2.setBackground(new java.awt.Color(204, 204, 204));
        numero2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero2.setForeground(new java.awt.Color(102, 102, 102));
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
        panelp.add(numero2, gridBagConstraints);

        numero3.setBackground(new java.awt.Color(204, 204, 204));
        numero3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero3.setForeground(new java.awt.Color(102, 102, 102));
        numero3.setText("3");
        numero3.setBorder(null);
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
        panelp.add(numero3, gridBagConstraints);

        numero0.setBackground(new java.awt.Color(204, 204, 204));
        numero0.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero0.setForeground(new java.awt.Color(102, 102, 102));
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
        panelp.add(numero0, gridBagConstraints);

        punto.setBackground(new java.awt.Color(204, 204, 204));
        punto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        punto.setForeground(new java.awt.Color(102, 102, 102));
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
        panelp.add(punto, gridBagConstraints);

        resultados.setBackground(new java.awt.Color(204, 204, 204));
        resultados.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        resultados.setForeground(new java.awt.Color(102, 102, 102));
        resultados.setText("=");
        resultados.setBorder(null);
        resultados.setOpaque(true);
        resultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadosActionPerformed(evt);
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
        panelp.add(resultados, gridBagConstraints);

        menuventanaligh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ajustes.png"))); // NOI18N
        menuventanaligh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuventanalighActionPerformed(evt);
            }
        });

        estandarcal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calculadora.png"))); // NOI18N
        estandarcal.setText("Calculadora Estandar");
        estandarcal.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N

        temaoscuro.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        temaoscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Modooscuroo.png"))); // NOI18N
        temaoscuro.setText("Tema Oscuro");
        temaoscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temaoscuroActionPerformed(evt);
            }
        });
        estandarcal.add(temaoscuro);

        modelight.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        modelight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Modo Light.png"))); // NOI18N
        modelight.setText("Tema Claro");
        estandarcal.add(modelight);

        menuventanaligh.add(estandarcal);

        conversor.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        conversor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/divisas.png"))); // NOI18N
        conversor.setText("Conversor Divisas");
        conversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversorActionPerformed(evt);
            }
        });
        menuventanaligh.add(conversor);

        botonsalirm.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        botonsalirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonSalir.png"))); // NOI18N
        botonsalirm.setText("Salir");
        botonsalirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirmActionPerformed(evt);
            }
        });
        menuventanaligh.add(botonsalirm);

        jMenuBar1.add(menuventanaligh);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelp, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelp, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void temaoscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temaoscuroActionPerformed
        Calculadora modeblack = new Calculadora();
        modeblack.setVisible(true);
        dispose(); 
        
    }//GEN-LAST:event_temaoscuroActionPerformed

    private void conversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversorActionPerformed
        VentanaDivisas divisas = new VentanaDivisas();
        divisas.setVisible(true);
        dispose();

    }//GEN-LAST:event_conversorActionPerformed

    private void botonsalirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirmActionPerformed
        CerrarPrograma();
    }//GEN-LAST:event_botonsalirmActionPerformed

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed

        numeroacum += "1";
        mostrarpantalla.setText(numeroacum);
        activar = true;
    }//GEN-LAST:event_numero1ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed

        numeroacum += "2";
        mostrarpantalla.setText(numeroacum);
        activar = true;
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed
        numeroacum += "3";
        mostrarpantalla.setText(numeroacum);
        activar = true;
    }//GEN-LAST:event_numero3ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
        numeroacum += "4";
        mostrarpantalla.setText(numeroacum);
        activar = true;
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ActionPerformed
        numeroacum += "5";
        mostrarpantalla.setText(numeroacum);
        activar = true;
    }//GEN-LAST:event_numero5ActionPerformed

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ActionPerformed
        numeroacum += "6";
        mostrarpantalla.setText(numeroacum);
        activar = true;
    }//GEN-LAST:event_numero6ActionPerformed

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ActionPerformed
        numeroacum += "7";
        mostrarpantalla.setText(numeroacum);
        activar = true;
    }//GEN-LAST:event_numero7ActionPerformed

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ActionPerformed
        numeroacum += "8";
        mostrarpantalla.setText(numeroacum);
        activar = true;
    }//GEN-LAST:event_numero8ActionPerformed

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero9ActionPerformed
        numeroacum += "9";
        mostrarpantalla.setText(numeroacum);
        activar = true;
    }//GEN-LAST:event_numero9ActionPerformed

    private void numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero0ActionPerformed
        // solo se imprima si hay un numero antes 
        if (numeroacum != "") {
            numeroacum += "0";
            mostrarpantalla.setText(numeroacum);
            activar = true;
        }


    }//GEN-LAST:event_numero0ActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed

        if (numeroacum.equals("")) {
            numeroacum = "";
            activar = false;
        }

        if (activar == true) {
            // Cuando el Usuario digite el numero en la etiqueta quiero  
            PrimerAcum = Double.parseDouble(numeroacum);// lo transformamos a double  
            //Quiero que mi etiqueta Imprimir arriba se muestre  
            MostrarArriba.setText(PrimerAcum + "+");
            numeroacum = ""; // vuelve hacer vacio    

            // Operacion va hacer  
            Operacion = "sumar";
            activar = false;
            operacionrealizado = true;
            // para que solo sea pueda activar una ves para volver activarlo se debe tocar cualquier de los numeros 

        }


    }//GEN-LAST:event_sumaActionPerformed

    private void resultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadosActionPerformed
        activar = true;
        Double SegundoAcum;

        if (numeroacum.equals("")) {
            numeroacum = "";
            mostrarpantalla.setText(numeroacum);
        }

        switch (Operacion) {

            case "nula":
                // en el caso no se alla tocado ninguna operacion solo mostrara los numeros 
                mostrarpantalla.setText(numeroacum);
                break;

            case "sumar":

                SegundoAcum = Double.parseDouble(numeroacum);
                resultado = PrimerAcum + SegundoAcum;
                // lo guardo la variable acumulado (actualizo )   
                mostrarpantalla.setText(String.valueOf(redondear.format(resultado)));
                numeroacum = "";
                numeroacum = String.valueOf(resultado);
                Operacion = "nula";// reseteamos

                break;
            case "multiplicar":

                SegundoAcum = Double.parseDouble(numeroacum);
                resultado = PrimerAcum * SegundoAcum;
                // lo guardo la variable acumulado (actualizo )   
                mostrarpantalla.setText(String.valueOf(redondear.format(resultado)));
                numeroacum = "";
                numeroacum = String.valueOf(resultado);
                Operacion = "nula";// reseteamos
                break;
            case "restar":
                SegundoAcum = Double.parseDouble(numeroacum);
                resultado = PrimerAcum - SegundoAcum;
                // lo guardo la variable acumulado (actualizo )   
                mostrarpantalla.setText(String.valueOf(redondear.format(resultado)));
                numeroacum = "";
                numeroacum = String.valueOf(resultado);
                Operacion = "nula";// reseteamos
                break;
            case "dividir":
                SegundoAcum = Double.parseDouble(numeroacum);
                resultado = PrimerAcum / SegundoAcum;
                // lo guardo la variable acumulado (actualizo )   
                mostrarpantalla.setText(String.valueOf(redondear.format(resultado)));
                numeroacum = "";
                numeroacum = String.valueOf(resultado);
                Operacion = "nula";// reseteamos
                break; 
            case "raiz": 
                resultado = Math.sqrt(PrimerAcum);  
                mostrarpantalla.setText(String.valueOf(redondear.format(resultado)));
                numeroacum = "";
                numeroacum = String.valueOf(resultado);
                Operacion = "nula";// reseteamos 
                break; 
                

        }

        MostrarArriba.setText("");
        activar = true;
    }//GEN-LAST:event_resultadosActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        if (operacionrealizado == true) {
            if (numeroacum.equals("")) {
                numeroacum += "0.";
            } else {
                numeroacum += ".";
            }

            mostrarpantalla.setText(numeroacum);
            operacionrealizado = false;
        }
    }//GEN-LAST:event_puntoActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int tamañocadena = numeroacum.length();// retornara un numero  

        if (tamañocadena > 0) {
            // osea vamos a imprimir desde 0 osea principio hasta 4-1
            // ejemplo 430 4=0 y 0 =4  
            // 43
            numeroacum = numeroacum.substring(0, numeroacum.length() - 1);
        }
        mostrarpantalla.setText(numeroacum);

    }//GEN-LAST:event_eliminarActionPerformed

    private void cambiosignosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiosignosActionPerformed

        if (numeroacum == "") {
            numeroacum = "";
            mostrarpantalla.setText(numeroacum);

        }

        if ((numeroacum.charAt(0) != '-')) {
            numeroacum = "-" + numeroacum;

        } else {
            numeroacum = numeroacum.substring(1, numeroacum.length());
        }

        mostrarpantalla.setText(numeroacum);

    }//GEN-LAST:event_cambiosignosActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed

        if (numeroacum.equals("")) {
            numeroacum = "";
            activar = false;
        }

        if (activar == true) {
            // Cuando el Usuario digite el numero en la etiqueta quiero  
            PrimerAcum = Double.parseDouble(numeroacum);// lo transformamos a double  
            //Quiero que mi etiqueta Imprimir arriba se muestre  
            MostrarArriba.setText(PrimerAcum + "x");
            numeroacum = ""; // vuelve hacer vacio    

            // Operacion va hacer  
            Operacion = "multiplicar";
            activar = false;
            operacionrealizado = true;
            // para que solo sea pueda activar una ves para volver activarlo se debe tocar cualquier de los numeros 

        }


    }//GEN-LAST:event_multiplicacionActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed

        if (numeroacum.equals("")) {
            numeroacum = "";
            activar = false;
        }

        if (activar == true) {
            // Cuando el Usuario digite el numero en la etiqueta quiero  
            PrimerAcum = Double.parseDouble(numeroacum);// lo transformamos a double  
            //Quiero que mi etiqueta Imprimir arriba se muestre  
            MostrarArriba.setText(PrimerAcum + "+");
            numeroacum = ""; // vuelve hacer vacio    

            // Operacion va hacer  
            Operacion = "restar";
            activar = false;
            operacionrealizado = true;
            // para que solo sea pueda activar una ves para volver activarlo se debe tocar cualquier de los numeros 

        }


    }//GEN-LAST:event_restaActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed

        if (numeroacum.equals("")) {
            numeroacum = "";
            activar = false;
        }

        if (activar == true) {
            // Cuando el Usuario digite el numero en la etiqueta quiero  
            PrimerAcum = Double.parseDouble(numeroacum);// lo transformamos a double  
            //Quiero que mi etiqueta Imprimir arriba se muestre  
            MostrarArriba.setText(PrimerAcum + "/");
            numeroacum = ""; // vuelve hacer vacio    

            // Operacion va hacer  
            Operacion = "dividir";
            activar = false;
            operacionrealizado = true;
            // para que solo sea pueda activar una ves para volver activarlo se debe tocar cualquier de los numeros 

        }


    }//GEN-LAST:event_divisionActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        
            if (numeroacum.equals("")){
            numeroacum=""; 
            activar= false ; 
        }
        
        
        if (activar == true) {
            // Cuando el Usuario digite el numero en la etiqueta quiero  
            PrimerAcum = Double.parseDouble(numeroacum);// lo transformamos a double  
            //Quiero que mi etiqueta Imprimir arriba se muestre  
            MostrarArriba.setText("("+PrimerAcum+ ")"+"Raiz");
            numeroacum = ""; // vuelve hacer vacio    

            // Operacion va hacer  
            Operacion = "raiz"; 
            activar=false ; 
            operacionrealizado=true ; 
            // para que solo sea pueda activar una ves para volver activarlo se debe tocar cualquier de los numeros 

        } 
        
    }//GEN-LAST:event_raizActionPerformed

    private void menuventanalighActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuventanalighActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuventanalighActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        numeroacum=""; 
        mostrarpantalla.setText("0"); 
        MostrarArriba.setText("");
        
        PrimerAcum=0 ; 
        
        resultado=0 ; 
        Operacion="nula"; 
         
        activar=true ; 
        operacionrealizado=true ; 
       
    }//GEN-LAST:event_limpiarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        CerrarPrograma();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaModoLight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaModoLight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaModoLight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaModoLight.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModoLight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MostrarArriba;
    private javax.swing.JMenuItem botonsalirm;
    private javax.swing.JButton cambiosignos;
    private javax.swing.JMenuItem conversor;
    private javax.swing.JButton division;
    private javax.swing.JButton eliminar;
    private javax.swing.JMenu estandarcal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton limpiar;
    private javax.swing.JMenu menuventanaligh;
    private javax.swing.JMenuItem modelight;
    private javax.swing.JLabel mostrarpantalla;
    private javax.swing.JButton multiplicacion;
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
    private javax.swing.JPanel panelp;
    private javax.swing.JButton punto;
    private javax.swing.JButton raiz;
    private javax.swing.JButton resta;
    private javax.swing.JButton resultados;
    private javax.swing.JButton suma;
    private javax.swing.JMenuItem temaoscuro;
    // End of variables declaration//GEN-END:variables
}
