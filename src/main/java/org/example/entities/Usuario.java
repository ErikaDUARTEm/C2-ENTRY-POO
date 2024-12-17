package org.example.entities;

public class Usuario {
    protected String name;
    protected String lastName;
    protected String email;
    protected String nationality;
    protected String phone;
    protected String arrivalTime;

    public Usuario(String name, String lastName, String email, String nationality, String phone, String arrivalTime) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.nationality = nationality;
        this.phone = phone;
        this.arrivalTime = arrivalTime;
    }

    private Usuario() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
