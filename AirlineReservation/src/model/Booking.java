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
public class Booking {
    private int bookingNo;
    private int customerId;
    private String flightNo;
    private int statusId;
    private int classId;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int bookingCity;
    private int paidBy;
    private double flightPrice;
    private double totalPrice;
    private double paidAmount;
    private double balance;
    private String bookingDate;

    public Booking() {
    }

    public Booking(int bookingNo, int customerId, String flightNo, int statusId, int classId, String origin, String destination, String departureTime, String arrivalTime, int bookingCity, int paidBy, double flightPrice, double totalPrice, double paidAmount, double balance, String bookingDate) {
        this.bookingNo = bookingNo;
        this.customerId = customerId;
        this.flightNo = flightNo;
        this.statusId = statusId;
        this.classId = classId;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.bookingCity = bookingCity;
        this.paidBy = paidBy;
        this.flightPrice = flightPrice;
        this.totalPrice = totalPrice;
        this.paidAmount = paidAmount;
        this.balance = balance;
        this.bookingDate = bookingDate;
    }

    public int getBookingNo() {
        return bookingNo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public int getStatusId() {
        return statusId;
    }

    public int getClassId() {
        return classId;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public int getBookingCity() {
        return bookingCity;
    }

    public int getPaidBy() {
        return paidBy;
    }

    public double getFlightPrice() {
        return flightPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public double getBalance() {
        return balance;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingNo(int bookingNo) {
        this.bookingNo = bookingNo;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setBookingCity(int bookingCity) {
        this.bookingCity = bookingCity;
    }

    public void setPaidBy(int paidBy) {
        this.paidBy = paidBy;
    }

    public void setFlightPrice(double flightPrice) {
        this.flightPrice = flightPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Booking{" + "bookingNo=" + bookingNo + ", customerId=" + customerId + ", flightNo=" + flightNo + ", statusId=" + statusId + ", classId=" + classId + ", origin=" + origin + ", destination=" + destination + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", bookingCity=" + bookingCity + ", paidBy=" + paidBy + ", flightPrice=" + flightPrice + ", totalPrice=" + totalPrice + ", paidAmount=" + paidAmount + ", balance=" + balance + ", bookingDate=" + bookingDate + '}';
    }
    
}
