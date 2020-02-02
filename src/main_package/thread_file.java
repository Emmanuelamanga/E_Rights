/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 * This file is used bu splash.java to automate the splash
 */
package main_package;

import javax.swing.JOptionPane;

/**
 *
 * @author Doreen Midecha
 */
public class thread_file implements Runnable {
//  variable declaration
    private Thread t;
    
    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
//        object of class splash
        splash sp = new splash();
        try {
//            display the splash
            sp.setVisible(true);
            for (int i = 0; i <= 100; i++) {
//                update the percentage
                sp.persentagetxt.setText(Integer.toString(i) + "%");
//                set delay in thread
                Thread.sleep(40);
            }
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, "!!!\n" + e, "WARNING", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "All Is Set !", "INFO", JOptionPane.INFORMATION_MESSAGE);
//        close splash
        sp.dispose();
//        start the rights form
        new control().setVisible(true);
    }
    /**
     *start thread
     */
    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }

}
