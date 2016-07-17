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
public class Fax {
    private String customerId;
    private String faxCountryCode;
    private String faxAreaCode;
    private String faxNumber;

    public Fax() {
    }

    public Fax(String customerId, String faxCountryCode, String faxAreaCode, String faxNumber) {
        this.customerId = customerId;
        this.faxCountryCode = faxCountryCode;
        this.faxAreaCode = faxAreaCode;
        this.faxNumber = faxNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFaxCountryCode() {
        return faxCountryCode;
    }

    public String getFaxAreaCode() {
        return faxAreaCode;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setFaxCountryCode(String faxCountryCode) {
        this.faxCountryCode = faxCountryCode;
    }

    public void setFaxAreaCode(String faxAreaCode) {
        this.faxAreaCode = faxAreaCode;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    @Override
    public String toString() {
        return "Fax{" + "customerId=" + customerId + ", faxCountryCode=" + faxCountryCode + ", faxAreaCode=" + faxAreaCode + ", faxNumber=" + faxNumber + '}';
    }
    
}
