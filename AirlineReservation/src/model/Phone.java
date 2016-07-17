/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Embeddable;

/**
 *
 * @author iftekher
 */
@Embeddable
public class Phone {
    private String customerId;
    private String phoneCountryCode;
    private String phoneAreaCode;
    private String phoneNumber;

    public Phone() {
    }

    public Phone(String customerId, String phoneCountryCode, String phoneAreaCode, String phoneNumber) {
        this.customerId = customerId;
        this.phoneCountryCode = phoneCountryCode;
        this.phoneAreaCode = phoneAreaCode;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public String getPhoneAreaCode() {
        return phoneAreaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public void setPhoneAreaCode(String phoneAreaCode) {
        this.phoneAreaCode = phoneAreaCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" + "customerId=" + customerId + ", phoneCountryCode=" + phoneCountryCode + ", phoneAreaCode=" + phoneAreaCode + ", phoneNumber=" + phoneNumber + '}';
    }
    
}
