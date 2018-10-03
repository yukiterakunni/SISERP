/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
/**
 *
 * @author yukit
 */
public class clsPanelTab extends JPanel {
    private JTabbedPane jtpTabsApp;
    private int tipo;
    public clsPanelTab(JTabbedPane pvJTPpanel,int pvIntIdentificador) {
        if (pvJTPpanel != null) {
            this.jtpTabsApp = pvJTPpanel;
            tipo = pvIntIdentificador;
            //setOpaque(false);
            JLabel titulo = new JLabel() /*{
                public String getText() {
                    int i = jtpTabsApp.indexOfTabComponent(clsPanelTab.this);
                    if (i != -1) {
                        return jtpTabsApp.getTitleAt(i);
                    }
                    return null;
                }
            }*/;
            titulo.setText("Hola");
            titulo.setSize(0, 0);
            add(titulo);
            //titulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
            JButton button = new clsBtnTabs(jtpTabsApp,this);
            button.setBorderPainted(false);
            add(button);
        }
    }
}
