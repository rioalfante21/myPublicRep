/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwengProject;

/**
 *
 * @author Alfante
 */
public class user_Log {
    private String user_name, user_pass, user_login;
    public user_Log(String user_name, String user_pass, String user_login){
        this.user_name = user_name;
        this.user_pass = user_pass;
        this.user_login = user_login;
    } 
    public String getuser_name(){
        return user_name;
    }
     public String getuser_pass(){
        return user_pass;
    }
     public String getuser_login(){
        return user_login;
    } 
}
