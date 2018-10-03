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
public class clsBtnTabs extends JButton implements MouseListener {
    //Argumentos de la clase 
    JTabbedPane panel;
    clsTabMain tab;
    JPanel btc;
    //Constructores de la clase 
    public clsBtnTabs(JTabbedPane pane,JPanel btc) {
        panel=pane;
        this.btc=btc;
        int size = 15;
        setPreferredSize(new Dimension(size, size));
        setToolTipText("Cerrar Pestaña");
        setUI(new BasicButtonUI());
        setContentAreaFilled(false);
        setFocusable(false);
        setBorder(BorderFactory.createEtchedBorder());
        setBorderPainted(false);
        addMouseListener(this);
        setRolloverEnabled(true);
        addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = panel.indexOfTabComponent(clsBtnTabs.this.btc);
                if (i != -1) {
                    panel.remove(i);
                }
            }
        });
    }
    
    //Metodos de la clase
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        
        ImageIcon img=new ImageIcon(this.getClass().getResource("../resources/Delete_16px.png"));
        g2.drawImage(img.getImage(), 1, 0,18,18, this);

        g2.dispose();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
     // TODO Auto-generated method stub
    }
    @Override
    public void mouseEntered(MouseEvent e) {
     Component component = e.getComponent();
           if (component instanceof AbstractButton) {
               AbstractButton button = (AbstractButton) component;
               button.setBorderPainted(true);
           }
    }
    @Override
    public void mouseExited(MouseEvent e) {
     Component component = e.getComponent();
           if (component instanceof AbstractButton) {
               AbstractButton button = (AbstractButton) component;
               button.setBorderPainted(false);
           }
    }
    @Override
    public void mousePressed(MouseEvent e) {
     // TODO Auto-generated method stub

    }
    @Override
    public void mouseReleased(MouseEvent e) {
     // TODO Auto-generated method stub

    }
}
