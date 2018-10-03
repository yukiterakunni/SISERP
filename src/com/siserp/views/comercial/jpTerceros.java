/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.views.comercial;

import com.siserpjava.views.*;
import com.siserp.usuarios.clsUsuarios;

/**
 *
 * @author yukit
 */
public class jpTerceros extends javax.swing.JPanel {

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
    
    
    public jpTerceros() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpPrincipal = new javax.swing.JPanel();
        jpContenedor = new javax.swing.JPanel();
        jpTitleBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnAyuda2 = new javax.swing.JButton();
        jpWorkAreaContainer = new javax.swing.JPanel();
        jpBorderColorArea = new javax.swing.JPanel();
        jpTopBarColor = new javax.swing.JPanel();
        jpInfoGeneral = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        rbtPersonaJuridica = new javax.swing.JRadioButton();
        rbtPersonaNatural = new javax.swing.JRadioButton();
        rbtSinIdentificar = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtNombre2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNombreEstablecimiento = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        chkEstado = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpProveedor = new javax.swing.JPanel();
        jpUnidadMedida = new javax.swing.JPanel();
        jpNotas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaNotas = new javax.swing.JTextArea();

        jpContenedor.setBackground(new java.awt.Color(236, 240, 245));

        jpTitleBar.setBackground(new java.awt.Color(54, 127, 169));
        jpTitleBar.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/siserp/views/comercial/Bundle"); // NOI18N
        jLabel1.setText(bundle.getString("jpTerceros.jLabel1.text")); // NOI18N

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnAyuda2.setBackground(new java.awt.Color(50, 50, 50));
        btnAyuda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/siserp/resources/Cancel_20px.png"))); // NOI18N
        btnAyuda2.setBorder(null);
        btnAyuda2.setFocusable(false);
        btnAyuda2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAyuda2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAyuda2);

        javax.swing.GroupLayout jpTitleBarLayout = new javax.swing.GroupLayout(jpTitleBar);
        jpTitleBar.setLayout(jpTitleBarLayout);
        jpTitleBarLayout.setHorizontalGroup(
            jpTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 970, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpTitleBarLayout.setVerticalGroup(
            jpTitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpWorkAreaContainer.setBackground(new java.awt.Color(236, 240, 245));

        jpBorderColorArea.setBackground(new java.awt.Color(255, 255, 255));
        jpBorderColorArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 192, 239)));

        jpTopBarColor.setBackground(new java.awt.Color(0, 192, 239));
        jpTopBarColor.setMaximumSize(new java.awt.Dimension(32767, 4));

        javax.swing.GroupLayout jpTopBarColorLayout = new javax.swing.GroupLayout(jpTopBarColor);
        jpTopBarColor.setLayout(jpTopBarColorLayout);
        jpTopBarColorLayout.setHorizontalGroup(
            jpTopBarColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpTopBarColorLayout.setVerticalGroup(
            jpTopBarColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jpInfoGeneral.setBackground(new java.awt.Color(255, 255, 255));
        jpInfoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)), bundle.getString("jpTerceros.jpInfoGeneral.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 12), new java.awt.Color(210, 214, 222))); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("jpTerceros.jPanel8.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 12), new java.awt.Color(210, 214, 222))); // NOI18N

        rbtPersonaJuridica.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtPersonaJuridica);
        rbtPersonaJuridica.setForeground(new java.awt.Color(102, 102, 102));
        rbtPersonaJuridica.setText(bundle.getString("jpTerceros.rbtPersonaJuridica.text")); // NOI18N

        rbtPersonaNatural.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtPersonaNatural);
        rbtPersonaNatural.setForeground(new java.awt.Color(102, 102, 102));
        rbtPersonaNatural.setText(bundle.getString("jpTerceros.rbtPersonaNatural.text")); // NOI18N

        rbtSinIdentificar.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtSinIdentificar);
        rbtSinIdentificar.setForeground(new java.awt.Color(102, 102, 102));
        rbtSinIdentificar.setText(bundle.getString("jpTerceros.rbtSinIdentificar.text")); // NOI18N

        jLabel17.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText(bundle.getString("jpTerceros.jLabel17.text")); // NOI18N

        jLabel18.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText(bundle.getString("jpTerceros.jLabel18.text")); // NOI18N

        jLabel19.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText(bundle.getString("jpTerceros.jLabel19.text")); // NOI18N

        txtApellido1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtApellido1.setToolTipText(bundle.getString("jpTerceros.txtApellido1.toolTipText")); // NOI18N
        txtApellido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)));

        txtNombre1.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtNombre1.setToolTipText(bundle.getString("jpTerceros.txtNombre1.toolTipText")); // NOI18N
        txtNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)));

        txtApellido2.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtApellido2.setToolTipText(bundle.getString("jpTerceros.txtApellido2.toolTipText")); // NOI18N
        txtApellido2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)));

        txtNombre2.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtNombre2.setToolTipText(bundle.getString("jpTerceros.txtNombre2.toolTipText")); // NOI18N
        txtNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)));

        jLabel20.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText(bundle.getString("jpTerceros.jLabel20.text")); // NOI18N

        txtNombreEstablecimiento.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtNombreEstablecimiento.setToolTipText(bundle.getString("jpTerceros.txtNombreEstablecimiento.toolTipText")); // NOI18N
        txtNombreEstablecimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)));

        txtRazonSocial.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtRazonSocial.setToolTipText(bundle.getString("jpTerceros.txtRazonSocial.toolTipText")); // NOI18N
        txtRazonSocial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtSinIdentificar)
                            .addComponent(rbtPersonaJuridica)
                            .addComponent(rbtPersonaNatural))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtNombreEstablecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtPersonaJuridica)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtPersonaNatural)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtSinIdentificar)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreEstablecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("jpTerceros.jPanel11.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 12), new java.awt.Color(210, 214, 222))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText(bundle.getString("jpTerceros.jLabel13.text")); // NOI18N

        txtCodigo.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtCodigo.setText(bundle.getString("jpTerceros.txtCodigo.text")); // NOI18N
        txtCodigo.setToolTipText(bundle.getString("jpTerceros.txtCodigo.toolTipText")); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)));

        chkEstado.setBackground(new java.awt.Color(255, 255, 255));
        chkEstado.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        chkEstado.setText(bundle.getString("jpTerceros.chkEstado.text")); // NOI18N
        chkEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222), 0));
        chkEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel16.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText(bundle.getString("jpTerceros.jLabel16.text")); // NOI18N

        cboTipo.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222), 0));

        jLabel14.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText(bundle.getString("jpTerceros.jLabel14.text")); // NOI18N

        txtNumero.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        txtNumero.setToolTipText(bundle.getString("jpTerceros.txtNumero.toolTipText")); // NOI18N
        txtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(210, 214, 222)));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkEstado))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNumero))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpInfoGeneralLayout = new javax.swing.GroupLayout(jpInfoGeneral);
        jpInfoGeneral.setLayout(jpInfoGeneralLayout);
        jpInfoGeneralLayout.setHorizontalGroup(
            jpInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInfoGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpInfoGeneralLayout.setVerticalGroup(
            jpInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInfoGeneralLayout.createSequentialGroup()
                .addGroup(jpInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.setToolTipText(bundle.getString("jpTerceros.jTabbedPane1.toolTipText")); // NOI18N

        javax.swing.GroupLayout jpProveedorLayout = new javax.swing.GroupLayout(jpProveedor);
        jpProveedor.setLayout(jpProveedorLayout);
        jpProveedorLayout.setHorizontalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1187, Short.MAX_VALUE)
        );
        jpProveedorLayout.setVerticalGroup(
            jpProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(bundle.getString("jpTerceros.jpProveedor.TabConstraints.tabTitle"), jpProveedor); // NOI18N

        javax.swing.GroupLayout jpUnidadMedidaLayout = new javax.swing.GroupLayout(jpUnidadMedida);
        jpUnidadMedida.setLayout(jpUnidadMedidaLayout);
        jpUnidadMedidaLayout.setHorizontalGroup(
            jpUnidadMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1187, Short.MAX_VALUE)
        );
        jpUnidadMedidaLayout.setVerticalGroup(
            jpUnidadMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(bundle.getString("jpTerceros.jpUnidadMedida.TabConstraints.tabTitle"), jpUnidadMedida); // NOI18N

        txtAreaNotas.setColumns(20);
        txtAreaNotas.setRows(5);
        jScrollPane1.setViewportView(txtAreaNotas);

        javax.swing.GroupLayout jpNotasLayout = new javax.swing.GroupLayout(jpNotas);
        jpNotas.setLayout(jpNotasLayout);
        jpNotasLayout.setHorizontalGroup(
            jpNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1167, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpNotasLayout.setVerticalGroup(
            jpNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(bundle.getString("jpTerceros.jpNotas.TabConstraints.tabTitle"), jpNotas); // NOI18N

        javax.swing.GroupLayout jpBorderColorAreaLayout = new javax.swing.GroupLayout(jpBorderColorArea);
        jpBorderColorArea.setLayout(jpBorderColorAreaLayout);
        jpBorderColorAreaLayout.setHorizontalGroup(
            jpBorderColorAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTopBarColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpBorderColorAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBorderColorAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpInfoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpBorderColorAreaLayout.setVerticalGroup(
            jpBorderColorAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBorderColorAreaLayout.createSequentialGroup()
                .addComponent(jpTopBarColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpInfoGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName(bundle.getString("jpTerceros.jTabbedPane1.AccessibleContext.accessibleName")); // NOI18N

        javax.swing.GroupLayout jpWorkAreaContainerLayout = new javax.swing.GroupLayout(jpWorkAreaContainer);
        jpWorkAreaContainer.setLayout(jpWorkAreaContainerLayout);
        jpWorkAreaContainerLayout.setHorizontalGroup(
            jpWorkAreaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpWorkAreaContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBorderColorArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpWorkAreaContainerLayout.setVerticalGroup(
            jpWorkAreaContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpWorkAreaContainerLayout.createSequentialGroup()
                .addComponent(jpBorderColorArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpContenedorLayout = new javax.swing.GroupLayout(jpContenedor);
        jpContenedor.setLayout(jpContenedorLayout);
        jpContenedorLayout.setHorizontalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTitleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpWorkAreaContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpContenedorLayout.setVerticalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContenedorLayout.createSequentialGroup()
                .addComponent(jpTitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jpWorkAreaContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1234, Short.MAX_VALUE)
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpPrincipalLayout.createSequentialGroup()
                    .addComponent(jpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda2;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cboTipo;
    public javax.swing.JCheckBox chkEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel jpBorderColorArea;
    private javax.swing.JPanel jpContenedor;
    private javax.swing.JPanel jpInfoGeneral;
    private javax.swing.JPanel jpNotas;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpProveedor;
    private javax.swing.JPanel jpTitleBar;
    private javax.swing.JPanel jpTopBarColor;
    private javax.swing.JPanel jpUnidadMedida;
    private javax.swing.JPanel jpWorkAreaContainer;
    public javax.swing.JRadioButton rbtPersonaJuridica;
    public javax.swing.JRadioButton rbtPersonaNatural;
    public javax.swing.JRadioButton rbtSinIdentificar;
    public javax.swing.JTextField txtApellido1;
    public javax.swing.JTextField txtApellido2;
    public javax.swing.JTextArea txtAreaNotas;
    public javax.swing.JTextField txtCodigo;
    public javax.swing.JTextField txtNombre1;
    public javax.swing.JTextField txtNombre2;
    public javax.swing.JTextField txtNombreEstablecimiento;
    public javax.swing.JTextField txtNumero;
    public javax.swing.JTextField txtRazonSocial;
    // End of variables declaration//GEN-END:variables
}
