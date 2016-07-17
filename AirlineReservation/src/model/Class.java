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
public class Class {
    private String classId;
    private String className;

    public Class() {
    }

    public Class(String classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public String getClassId() {
        return classId;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "Class{" + "classId=" + classId + ", className=" + className + '}';
    }
    
}
