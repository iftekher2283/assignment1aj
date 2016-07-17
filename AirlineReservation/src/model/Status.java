/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author iftekher
 */
public class Status {
    private String statusId;
    private String statusName;

    public Status() {
    }

    public Status(String statusId, String statusName) {
        this.statusId = statusId;
        this.statusName = statusName;
    }

    public String getStatusId() {
        return statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    @Override
    public String toString() {
        return "Status{" + "statusId=" + statusId + ", statusName=" + statusName + '}';
    }
        
}
