/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieknight;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Profile implements Serializable {

    private String name, userID, password;
    private int age;
    private String gender;
    private double credit;
    ArrayList<Ticket> ticketsBought = new ArrayList();

    public Profile() {
    }

    public Profile(String name, String userID, String password, int age, String gender) {
        this.name = name;
        this.userID = userID;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }

    void setName(String name) {

        this.name = name;
    }

    void setAge(int age) {
        //this.name= name;
        this.age = age;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    void setUserID(String userID) {
        this.userID = userID;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getName() {

        return this.name;
    }

    int getAge() {
        //this.name= name;
        return this.age;
    }

    String getGender() {
        return this.gender;
    }

    String getUserID() {
        return this.userID;
    }

    String getPassword() {
        return this.password;
    }

    void purchaseInfo(Movie watchedMovie, Ticket purchased) {

    }
    
    public double getCredit(){
        return this.credit;
    }

}
