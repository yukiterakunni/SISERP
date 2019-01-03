/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siserp.central;

import com.siserp.views.central.jpHomeBlackboard;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author yukit
 */
public class clsTabMain extends JApplet{
    private JTabbedPane prvJTMain;
    
    //Constructor de la clase 
    public clsTabMain(JTabbedPane Tab){
        this.prvJTMain = Tab;
        initializeTabHome();
    }
    //****************Metodos de la clase********************* 
    /*
    * Metodo:     initializeTabHome
    * Objetivo:   Crear el tab Home de la app
    * Author:     Yuki
    */
    public void initializeTabHome(){
        prvJTMain = new JTabbedPane();
        setPredeterminedTabs();
        JPanel pboton = new JPanel();
        add(prvJTMain);
    }
    /*
    * Metodo:     setPredeterminedTabs
    * Objetivo:   Crear el tab principal para el dashboard
    * Author:     Yuki
    */
    public void setPredeterminedTabs() {
        jpHomeBlackboard vJPInicial = new jpHomeBlackboard();
        //clsPanelTab btc = new clsPanelTab(prvJTMain,1);
        prvJTMain.addTab("Home", vJPInicial);
        //prvJTMain.setTabComponentAt(0, btc);
    }
    /*
    Metodo:     initializeNewTab
    Objetivo:   Crear los tabs solicitados
    Author:     Yuki
    */
    public void initializeNewTab(JPanel pvPane, String title){
        if(pvPane != null){
            prvJTMain.addTab(title, pvPane);
            //clsPanelTab btc = new clsPanelTab(prvJTMain,1);
            //JButton button = new clsBtnTabs(prvJTMain,pvPane);
            //add(button);
            //prvJTMain.addTab(title, pvPane);
            //prvJTMain.setTabComponentAt(0, btc);
        }
    }
    
    
    
    //********************Getters y Setters de la clase******************* 
    public JTabbedPane getPrvJTMain() {
        return prvJTMain;
    }

    public void setPrvJTMain(JTabbedPane prvJTMain) {
        this.prvJTMain = prvJTMain;
    }
    
    
    
}
