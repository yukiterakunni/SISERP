/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.views.comercial;

import com.siserp.usuarios.clsUsuarios;

/**
 *
 * @author yukit
 */
public class jpTiposInventario extends javax.swing.JPanel {

    /**
     * Creates new form jpHomeBlackboard
     */
    clsUsuarios objUsuario;
    private Long prvLngCodigo;
    private String prvStrDescripcion;
    private int prvIntIndTipoUsuario;
    private int prvIntIndEstado;
    private String prvStrNombre1;
    private String prvStrNombre2;
    private String prvStrApellido1;
    private String prvStrApellido2;
    private int prvIntCodigoPais;
    private int prvIntCodigoCiudad;
    private String prvStrDireccion;
    private String prvStrTelefono1;
    private String prvStrTelefono2;
    private String prvStrNotas;
    
    /*
    **
    ** Inicio Metodos propios
    **
    */
    private void CrearUsuario(){
        objUsuario = new clsUsuarios(prvLngCodigo,prvStrDescripcion,prvIntIndTipoUsuario,prvIntIndEstado);
    }
    
    
    public jpTiposInventario() {
        initComponents();
    }
    
    /*
    **
    ** Fin Metodos propios
    **
    */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnAyuda2 = new javax.swing.JButton();
        jToolBar = new javax.swing.JToolBar();
        btnHome = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDuplicar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnBuscar = new javax.swing.JButton();
        btnIrPrimero = new javax.swing.JButton();
        btnIrAnterior = new javax.swing.JButton();
        btnIrSiguiente = new javax.swing.JButton();
        btnIrUltimo = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnImprimir = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnAyuda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        chkEstado1 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        cboTipo1 = new javax.swing.JComboBox<>();
        txtCodigo3 = new javax.swing.JTextField();
        txtCodigo6 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();

        jPanel3.setBackground(new java.awt.Color(236, 240, 245));

        jPanel4.setBackground(new java.awt.Color(54, 127, 169));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/siserp/views/comercial/Bundle"); // NOI18N
        jLabel1.setText(bundle.getString("jpTiposInventario.jLabel1.text")); // NOI18N

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnAyuda2.setBackground(new java.awt.Color(50, 50, 50));
        btnAyuda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/Cancel_20px.png"))); // NOI18N
        btnAyuda2.setBorder(null);
        btnAyuda2.setFocusable(false);
        btnAyuda2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyuda2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAyuda2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 970, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jToolBar.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar.setBorder(null);
        jToolBar.setFloatable(false);
        jToolBar.setRollover(true);
        jToolBar.setBorderPainted(false);
        jToolBar.setOpaque(false);

        btnHome.setBackground(new java.awt.Color(236, 240, 245));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Home_22px.png"))); // NOI18N
        btnHome.setFocusable(false);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnHome);
        jToolBar.add(jSeparator2);

        btnGuardar.setBackground(new java.awt.Color(236, 240, 245));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Save_22px.png"))); // NOI18N
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar.add(btnGuardar);

        btnNuevo.setBackground(new java.awt.Color(236, 240, 245));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Add_File_22px.png"))); // NOI18N
        btnNuevo.setToolTipText(bundle.getString("jpTiposInventario.btnNuevo.toolTipText")); // NOI18N
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar.add(btnNuevo);

        btnEditar.setBackground(new java.awt.Color(236, 240, 245));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Edit_File_22px.png"))); // NOI18N
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jToolBar.add(btnEditar);

        btnDuplicar.setBackground(new java.awt.Color(236, 240, 245));
        btnDuplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Copy_22px.png"))); // NOI18N
        btnDuplicar.setFocusable(false);
        btnDuplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDuplicar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnDuplicar);

        btnEliminar.setBackground(new java.awt.Color(236, 240, 245));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Trash_Can_22px.png"))); // NOI18N
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnEliminar);
        jToolBar.add(jSeparator1);

        btnBuscar.setBackground(new java.awt.Color(236, 240, 245));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Search_22px.png"))); // NOI18N
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnBuscar);

        btnIrPrimero.setBackground(new java.awt.Color(236, 240, 245));
        btnIrPrimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Back_Arrow_22px.png"))); // NOI18N
        btnIrPrimero.setFocusable(false);
        btnIrPrimero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIrPrimero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnIrPrimero);

        btnIrAnterior.setBackground(new java.awt.Color(236, 240, 245));
        btnIrAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Back_To_22px.png"))); // NOI18N
        btnIrAnterior.setFocusable(false);
        btnIrAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIrAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnIrAnterior);

        btnIrSiguiente.setBackground(new java.awt.Color(236, 240, 245));
        btnIrSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Next_page_22px.png"))); // NOI18N
        btnIrSiguiente.setFocusable(false);
        btnIrSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIrSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnIrSiguiente);

        btnIrUltimo.setBackground(new java.awt.Color(236, 240, 245));
        btnIrUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Forward_Button_22px.png"))); // NOI18N
        btnIrUltimo.setFocusable(false);
        btnIrUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIrUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnIrUltimo);
        jToolBar.add(jSeparator4);

        btnImprimir.setBackground(new java.awt.Color(236, 240, 245));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Print_22px.png"))); // NOI18N
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnImprimir);
        jToolBar.add(jSeparator3);

        btnAyuda.setBackground(new java.awt.Color(236, 240, 245));
        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/icons8_Help_22px.png"))); // NOI18N
        btnAyuda.setFocusable(false);
        btnAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar.add(btnAyuda);

        jPanel2.setBackground(new java.awt.Color(236, 240, 245));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 192, 239)));

        jPanel6.setBackground(new java.awt.Color(0, 192, 239));
        jPanel6.setMaximumSize(new java.awt.Dimension(32767, 4));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)), bundle.getString("jpTiposInventario.jPanel7.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 12), new java.awt.Color(210, 214, 222))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel13.setText(bundle.getString("jpTiposInventario.jLabel13.text")); // NOI18N

        jLabel14.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel14.setText(bundle.getString("jpTiposInventario.jLabel14.text")); // NOI18N

        chkEstado1.setBackground(new java.awt.Color(255, 255, 255));
        chkEstado1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        chkEstado1.setText(bundle.getString("jpTiposInventario.chkEstado1.text")); // NOI18N
        chkEstado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222), 0));
        chkEstado1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel15.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel15.setText(bundle.getString("jpTiposInventario.jLabel15.text")); // NOI18N

        cboTipo1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        cboTipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTipo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222), 0));

        txtCodigo3.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtCodigo3.setText(bundle.getString("jpTiposInventario.txtCodigo3.text")); // NOI18N
        txtCodigo3.setToolTipText(bundle.getString("jpTiposInventario.txtCodigo3.toolTipText")); // NOI18N
        txtCodigo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)));

        txtCodigo6.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtCodigo6.setToolTipText(bundle.getString("jpTiposInventario.txtCodigo6.toolTipText")); // NOI18N
        txtCodigo6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo6, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cboTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkEstado1))
                    .addComponent(txtCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCodigo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(chkEstado1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(bundle.getString("jpTiposInventario.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(bundle.getString("jpTiposInventario.jPanel9.TabConstraints.tabTitle"), jPanel9); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(bundle.getString("jpTiposInventario.jPanel10.TabConstraints.tabTitle"), jPanel10); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName(bundle.getString("jpTiposInventario.jTabbedPane1.AccessibleContext.accessibleName")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1187, Short.MAX_VALUE)
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpPrincipalLayout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnGuardarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnAyuda2;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDuplicar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnIrAnterior;
    private javax.swing.JButton btnIrPrimero;
    private javax.swing.JButton btnIrSiguiente;
    private javax.swing.JButton btnIrUltimo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboTipo1;
    private javax.swing.JCheckBox chkEstado1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JTextField txtCodigo3;
    private javax.swing.JTextField txtCodigo6;
    // End of variables declaration//GEN-END:variables
}
