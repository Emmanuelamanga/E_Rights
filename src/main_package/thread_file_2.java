/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main_package;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Emmanuel Amanga
 */
public class thread_file_2 implements Runnable {
//    variable declarations
    public JFrame frm, nxtjf;
    public String[] jlb;
    private Thread thread;
    private long sleep_time;
    
//    constructors
    public thread_file_2(JFrame jf,long st,JFrame njf){
        this.frm = jf;
        this.sleep_time = st;
        this.jlb = null;
        this.nxtjf = njf;
    }
    
    

    @Override
    public void run() {
        try {
//         display the splash
            frm.setVisible(true);
             for (int i = 0; i <= 100; i++) {
               //            delay for sleep_time amount of time
                Thread.sleep(sleep_time);  
             }

//            dispose the splash frame
            frm.dispose();
//            display success message
             JOptionPane.showMessageDialog(null, "Loading Complete", "File", JOptionPane.INFORMATION_MESSAGE);
//           prompt next JFrame
                nxtjf.setVisible(true);
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, "!!!\n" + e, "WARNING", JOptionPane.ERROR_MESSAGE);
        }
    }
    
      /**
     * start thread
     */
    public void start() {
         if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }
    public void stop(){
        thread.stop();
    }

}
