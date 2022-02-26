package com.example.databasecon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer customerID;

    private String username;
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;

    public void setCustomerID(Integer id) {
        this.customerID = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
