/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_package;

/**
 *
 * @author Doreen Midecha
 */
public class settings {
//    variable declarations 
    public String logon_user;
    settings(String user){
        this.logon_user = user;
    }
    

//    set logged on user
    /**
     *
     * @return returns the currently logged on user
     */
//    public void set_usr(String user){
//        this.logon_user = user;
//    }
//    get logged in user
    public String get_usr(){
        return this.logon_user;
    }

}
