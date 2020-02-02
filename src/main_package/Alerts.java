/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_package;

import javax.swing.JOptionPane;

/**
 *
 * @author Doreen Midecha
 */
public class Alerts {
//variable declaration

    private final String alert_type;
    private final String alert_sms;

    Alerts(String alert_type, String alert_sms) {
        this.alert_type = alert_type;
        this.alert_sms = alert_sms;
    }

//   alert getter 
    public void get_alert(){
        JOptionPane.showInternalMessageDialog(null, this, alert_type, 0);
    }
}
