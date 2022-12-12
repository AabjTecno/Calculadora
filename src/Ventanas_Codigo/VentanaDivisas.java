/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas_Codigo;

import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaDivisas extends javax.swing.JFrame {

    static DecimalFormat redondear = new DecimalFormat("0.00");

    private String divisa1 = "", divisa2 = "", cantidad = "";
    private String numeroacum = "";
    private double dinero, cambio;
    private boolean activado = true;

    private void Cerrar() {
        String botones[] = {"Cerrar", "Cancelar"};

        int selecion = JOptionPane.showOptionDialog(null, "¿Desea Cerrar el Programa ?", "Ventana Divisas", 0, 0, null, botones, this);
        if (selecion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else if (selecion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa no Finalizado");
        }
    }

    public VentanaDivisas() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(350,530);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); 
        setIconImage(new ImageIcon(getClass().getResource("/Img/346399.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        paneldiv = new javax.swing.JPanel();
        cambiartipomoneda = new javax.swing.JLabel();
        combobox1 = new javax.swing.JComboBox<>();
        mostrarabajo = new javax.swing.JLabel();
        combodivisa2 = new javax.swing.JComboBox<>();
        limpiar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        numero1 = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        punto = new javax.swing.JButton();
        numero0 = new javax.swing.JButton();
        tipomoneda = new javax.swing.JLabel();
        etiquetacambio1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ajustes = new javax.swing.JMenu();
        separador1 = new javax.swing.JPopupMenu.Separator();
        estandar = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        modooscuro = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        modollight = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        separador2 = new javax.swing.JPopupMenu.Separator();
        divsas = new javax.swing.JMenuItem();
        separador3 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        separador4 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor Divisas");
        setPreferredSize(new java.awt.Dimension(310, 415));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        paneldiv.setBackground(new java.awt.Color(44, 44, 44));
        paneldiv.setLayout(new java.awt.GridBagLayout());

        cambiartipomoneda.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        cambiartipomoneda.setForeground(new java.awt.Color(0, 255, 51));
        cambiartipomoneda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cambiartipomoneda.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        paneldiv.add(cambiartipomoneda, gridBagConstraints);

        combobox1.setBackground(new java.awt.Color(255, 153, 0));
        combobox1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        combobox1.setForeground(new java.awt.Color(255, 255, 255));
        combobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos -Dolar", "Mexico-Peso", "Europa-Euro", " " }));
        combobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(combobox1, gridBagConstraints);

        mostrarabajo.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        mostrarabajo.setForeground(new java.awt.Color(0, 255, 51));
        mostrarabajo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        mostrarabajo.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(mostrarabajo, gridBagConstraints);

        combodivisa2.setBackground(new java.awt.Color(255, 153, 0));
        combodivisa2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        combodivisa2.setForeground(new java.awt.Color(255, 255, 255));
        combodivisa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos -Dolar", "Mexico-Peso", "Europa-Euro", " " }));
        combodivisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodivisa2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(combodivisa2, gridBagConstraints);

        limpiar.setBackground(new java.awt.Color(255, 153, 0));
        limpiar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("C");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        paneldiv.add(limpiar, gridBagConstraints);

        eliminar.setBackground(new java.awt.Color(255, 153, 0));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Borrar.png"))); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(eliminar, gridBagConstraints);

        numero7.setBackground(new java.awt.Color(102, 102, 102));
        numero7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        numero7.setForeground(new java.awt.Color(255, 255, 255));
        numero7.setText("7");
        numero7.setBorder(null);
        numero7.setOpaque(true);
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(numero7, gridBagConstraints);

        numero8.setBackground(new java.awt.Color(102, 102, 102));
        numero8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero8.setForeground(new java.awt.Color(255, 255, 255));
        numero8.setText("8");
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(numero8, gridBagConstraints);

        numero9.setBackground(new java.awt.Color(102, 102, 102));
        numero9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero9.setForeground(new java.awt.Color(255, 255, 255));
        numero9.setText("9");
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(numero9, gridBagConstraints);

        numero4.setBackground(new java.awt.Color(102, 102, 102));
        numero4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero4.setForeground(new java.awt.Color(255, 255, 255));
        numero4.setText("4");
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(numero4, gridBagConstraints);

        numero5.setBackground(new java.awt.Color(102, 102, 102));
        numero5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero5.setForeground(new java.awt.Color(255, 255, 255));
        numero5.setText("5");
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(numero5, gridBagConstraints);

        numero6.setBackground(new java.awt.Color(102, 102, 102));
        numero6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero6.setForeground(new java.awt.Color(255, 255, 255));
        numero6.setText("6");
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(numero6, gridBagConstraints);

        numero1.setBackground(new java.awt.Color(102, 102, 102));
        numero1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero1.setForeground(new java.awt.Color(255, 255, 255));
        numero1.setText("1");
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(numero1, gridBagConstraints);

        numero2.setBackground(new java.awt.Color(102, 102, 102));
        numero2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero2.setForeground(new java.awt.Color(255, 255, 255));
        numero2.setText("2");
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(numero2, gridBagConstraints);

        numero3.setBackground(new java.awt.Color(102, 102, 102));
        numero3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero3.setForeground(new java.awt.Color(255, 255, 255));
        numero3.setText("3");
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(numero3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(jLabel1, gridBagConstraints);

        punto.setBackground(new java.awt.Color(102, 102, 102));
        punto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        punto.setForeground(new java.awt.Color(255, 255, 255));
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(punto, gridBagConstraints);

        numero0.setBackground(new java.awt.Color(102, 102, 102));
        numero0.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        numero0.setForeground(new java.awt.Color(255, 255, 255));
        numero0.setText("0");
        numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(numero0, gridBagConstraints);

        tipomoneda.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        tipomoneda.setForeground(new java.awt.Color(0, 255, 51));
        tipomoneda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipomoneda.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 15);
        paneldiv.add(tipomoneda, gridBagConstraints);

        etiquetacambio1.setFont(new java.awt.Font("Consolas", 1, 28)); // NOI18N
        etiquetacambio1.setForeground(new java.awt.Color(0, 255, 51));
        etiquetacambio1.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(etiquetacambio1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        paneldiv.add(jLabel2, gridBagConstraints);

        ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Ajustes.png"))); // NOI18N
        ajustes.add(separador1);

        estandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calculadora.png"))); // NOI18N
        estandar.setText("Calculadora Estandar");
        estandar.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        estandar.add(jSeparator1);

        modooscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Modooscuroo.png"))); // NOI18N
        modooscuro.setText("Tema Oscuro");
        modooscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modooscuroActionPerformed(evt);
            }
        });
        estandar.add(modooscuro);
        estandar.add(jSeparator2);

        modollight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Modo Light.png"))); // NOI18N
        modollight.setText("Tema Claro");
        modollight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modollightActionPerformed(evt);
            }
        });
        estandar.add(modollight);
        estandar.add(jSeparator3);

        ajustes.add(estandar);
        ajustes.add(separador2);

        divsas.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        divsas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/divisas.png"))); // NOI18N
        divsas.setText("Calculadora Divisas");
        ajustes.add(divsas);
        ajustes.add(separador3);

        salir.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/BotonSalir.png"))); // NOI18N
        salir.setText(" Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        ajustes.add(salir);
        ajustes.add(separador4);

        jMenuBar1.add(ajustes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneldiv, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneldiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

        Cerrar();
    }//GEN-LAST:event_salirActionPerformed

    private void modooscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modooscuroActionPerformed

        Calculadora modeblack = new Calculadora();
        modeblack.setVisible(true);
        dispose();


    }//GEN-LAST:event_modooscuroActionPerformed

    private void modollightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modollightActionPerformed
        VentanaModoLight modelight = new VentanaModoLight();
        modelight.setVisible(true);
        dispose();
    }//GEN-LAST:event_modollightActionPerformed


    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        Cerrar();

    }//GEN-LAST:event_formWindowClosing

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ActionPerformed
        if (etiquetacambio1.getText() == "0") {
            numeroacum = "7";
        } else {
            numeroacum += "7";
        }

        etiquetacambio1.setText(numeroacum);
        ObtenerDinero();

    }//GEN-LAST:event_numero7ActionPerformed

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ActionPerformed

        if (etiquetacambio1.getText() == "0") {
            numeroacum = "8";
        } else {
            numeroacum += "8";
        }

        etiquetacambio1.setText(numeroacum);
        ObtenerDinero();

    }//GEN-LAST:event_numero8ActionPerformed

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero9ActionPerformed

        if (etiquetacambio1.getText() == "0") {
            numeroacum = "9";
        } else {
            numeroacum += "9";
        }

        etiquetacambio1.setText(numeroacum);
        ObtenerDinero();
        activado = true;
    }//GEN-LAST:event_numero9ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed

        if (etiquetacambio1.getText() == "0") {
            numeroacum = "4";
        } else {
            numeroacum += "4";
        }

        etiquetacambio1.setText(numeroacum);
        ObtenerDinero();
        activado = true;
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ActionPerformed

        if (etiquetacambio1.getText() == "0") {
            numeroacum = "5";
        } else {
            numeroacum += "5";
        }

        etiquetacambio1.setText(numeroacum);
        ObtenerDinero();

    }//GEN-LAST:event_numero5ActionPerformed

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ActionPerformed

        if (etiquetacambio1.getText() == "0") {
            numeroacum = "6";
        } else {
            numeroacum += "6";
        }

        etiquetacambio1.setText(numeroacum);
        ObtenerDinero();

    }//GEN-LAST:event_numero6ActionPerformed

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed

        if (etiquetacambio1.getText() == "0") {
            numeroacum = "1";
        } else {
            numeroacum += "1";
        }

        etiquetacambio1.setText(numeroacum);
        ObtenerDinero();

    }//GEN-LAST:event_numero1ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed

        if (etiquetacambio1.getText() == "0") {
            numeroacum = "2";
        } else {
            numeroacum += "2";
        }

        etiquetacambio1.setText(numeroacum);
        ObtenerDinero();

    }//GEN-LAST:event_numero2ActionPerformed

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed

        if (etiquetacambio1.getText() == "0") {
            numeroacum = "3";
        } else {
            numeroacum += "3";
        }

        etiquetacambio1.setText(numeroacum);
        ObtenerDinero();

    }//GEN-LAST:event_numero3ActionPerformed

    private void numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero0ActionPerformed

        if (numeroacum != "") {

            if (etiquetacambio1.getText() == "0") {
                numeroacum = "0";
            } else {
                numeroacum += "0";
            }
            etiquetacambio1.setText(numeroacum);
            ObtenerDinero();

        }
    }//GEN-LAST:event_numero0ActionPerformed

    private void ObtenerDinero() {
        numeroacum = etiquetacambio1.getText(); // guardamos la cantidad 
        dinero = Double.parseDouble(numeroacum);
        CambioDivisa();
        dinero *= cambio;
        mostrarabajo.setText(String.valueOf((redondear.format(dinero))));

    }

    private void CambioDivisa() {
        // cambio divisa de estados unidos 
        if (divisa1.equals(divisa2)) {
            cambio = 1;
        } else if (divisa1.equals("Estados Unidos -Dolar") && (divisa2.equals("Mexico-Peso"))) {
            cambio = 19.79;
        } else if (divisa1.equals("Estados Unidos -Dolar") && (divisa2.equals("Europa-Euro"))) {
            cambio = 0.95;
        } // Cambio Divisa Panama 
        else if (divisa1.equals("Europa-Euro") && (divisa2.equals("Mexico-Peso"))) {
            cambio = 20.82;
        }
        else if (divisa1.equals("Europa-Euro") && (divisa2.equals("Estados Unidos -Dolar"))) {
            cambio = 1.05;
        }
         else if (divisa1.equals("Europa-Euro") && (divisa2.equals("Estados Unidos -Dolar"))) {
            cambio = 0.95;
        }
        
        else if (divisa1.equals("Mexico-Peso") && (divisa2.equals("Estados Unidos -Dolar"))) {
            cambio = 0.051;
        }
        else if (divisa1.equals("Mexico-Peso") && (divisa2.equals("Europa-Euro"))) {
            cambio = 0.048;
        }

    }


    private void combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1ActionPerformed

        divisa1 = (String) combobox1.getSelectedItem();

        if (divisa1.equals("Estados Unidos -Dolar")) {
            tipomoneda.setText("$/");
        } else if (divisa1.equals("Mexico-Peso")) {
            tipomoneda.setText("MXN$/ ");//€
        } else if (divisa1.equals("Europa-Euro")) {
            tipomoneda.setText("€/");
        }

        ObtenerDinero();


    }//GEN-LAST:event_combobox1ActionPerformed

    private void combodivisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodivisa2ActionPerformed

        divisa2 = (String) combodivisa2.getSelectedItem();

        if (divisa2.equals("Estados Unidos -Dolar")) {
            cambiartipomoneda.setText("$/");
        } else if (divisa2.equals("Mexico-Peso")) {
            cambiartipomoneda.setText("MXN$/");//€
        } else if (divisa2.equals("Europa-Euro")) {
            cambiartipomoneda.setText("€/");
        }

        ObtenerDinero();


    }//GEN-LAST:event_combodivisa2ActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed

        if (activado == true) {

            if (numeroacum.equals("")) {
                numeroacum = "0.";

            } else {
                numeroacum += ".";
            }
            etiquetacambio1.setText(numeroacum);
            activado=false ; 

        }


    }//GEN-LAST:event_puntoActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        etiquetacambio1.setText("0");
        mostrarabajo.setText("0");
        activado = true;
        numeroacum = "";
    
    }//GEN-LAST:event_limpiarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       int tamaño = numeroacum.length(); 
       if (tamaño>0){
           
           if (tamaño ==1){
               numeroacum="0";
           }
           else {
               numeroacum = numeroacum.substring(0, numeroacum.length()-1);
           }
           etiquetacambio1.setText(numeroacum); 
           ObtenerDinero();// SE ACTUALIZA abajo 
       }
       
    }//GEN-LAST:event_eliminarActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajustes;
    private javax.swing.JLabel cambiartipomoneda;
    private javax.swing.JComboBox<String> combobox1;
    private javax.swing.JComboBox<String> combodivisa2;
    private javax.swing.JMenuItem divsas;
    private javax.swing.JButton eliminar;
    private javax.swing.JMenu estandar;
    private javax.swing.JLabel etiquetacambio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JButton limpiar;
    private javax.swing.JMenuItem modollight;
    private javax.swing.JMenuItem modooscuro;
    private javax.swing.JLabel mostrarabajo;
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
    private javax.swing.JPanel paneldiv;
    private javax.swing.JButton punto;
    private javax.swing.JMenuItem salir;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JPopupMenu.Separator separador2;
    private javax.swing.JPopupMenu.Separator separador3;
    private javax.swing.JPopupMenu.Separator separador4;
    private javax.swing.JLabel tipomoneda;
    // End of variables declaration//GEN-END:variables
}
