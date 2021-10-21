
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Kelas yang digunakan untuk merepresentasikan pengguna
 * @author AKSAL
 */
public class User {
    private String userName;
    private String encryptedPassword;
    private String name;
    static List<User> userList = new ArrayList<>();
    static List<String> usernameList = new ArrayList<>();

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param encryptedPassword the encryptedPassword to set
     */
    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructor user
     * @param name nama user
     * @param username username user
     * @param Password password user
     */
public User (String name,String username, String Password){
    this.name = name;
    this.userName = username;
    this.encryptedPassword = Password;
}
 
public void setUserName (String newUserName){
    if(!this.userName.equals(newUserName)){
        if(usernameList.contains(newUserName)){
            System.out.println("false");
            System.out.println("Username Telah Digunakan");
        } else {
        System.out.println("true");
        this.userName = newUserName;
        System.out.println("Username Diganti menjadi " + this.userName);
        Activity.activityLog.add(new Activity("3 (Change Username)", this.userName));
        }
    } else {
        System.out.println("false");  
    }
}
public void logIn(String username, String encryptedPassword){
    if(usernameList.contains(username)){
        if(encryptedPassword.equals(this.encryptedPassword)){
            System.out.println(true);
            System.out.println("Berhasil Login dengan Username " + this.userName);
            Activity.activityLog.add(new Activity("1 (LogIn)", this.userName));
        }
    }
    else {
        System.out.println("false");
        System.out.println("Login gagal");
}

}
}
