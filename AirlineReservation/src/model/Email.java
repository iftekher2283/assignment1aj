/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

/**
 *
 * @author iftekher
 */

@Embeddable
public class Email {
    private String customerId;
    private String emailId;

    public Email() {
    }

    public Email(String customerId, String emailId) {
        this.customerId = customerId;
        this.emailId = emailId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Email{" + "customerId=" + customerId + ", emailId=" + emailId + '}';
    }
}
