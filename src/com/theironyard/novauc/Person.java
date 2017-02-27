package com.theironyard.novauc;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Merlin on 2/20/17.
 */
public class Person {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String country;
    private String ip_address;


    public Person(int id, String first_name, String last_name, String email, String country, String ip_address) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.country = country;
        this.ip_address = ip_address;
    }
    @Override
    public String toString (){
//        return "ID = " + this.id + ", First Name = " + this.first_name + " Last Name = " + this.last_name + ", Email = " + this.email + ", Country = " + this.country + ", IP Address = " + this.ip_address;
        return String.format("%s %s from the country %s is able to be contacted at the email address %s\n", this.first_name, this.last_name, this.country, this.email);

    }
    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    public String getFirst_name(){return first_name;}
    public void setFirst_name(String first_name){this.first_name = first_name;}
    public String getLast_name(){return last_name;}
    public void setLast_name(String last_name){this.last_name = last_name;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}
    public String getCountry(){return country;}
    public void setCountry(String country){this.country = country;}
    public String getIp_address(){return ip_address;}
    public void setIp_address(String ip_address){this.ip_address = ip_address;}


}
