package org.example.entities;

import java.time.LocalDate;
import java.util.List;

public abstract class Accommodation {
    protected String type;
    protected String name;
    protected String city;
    protected String description;
    protected double rating;
    protected double basePrice;
    protected LocalDate availableCheckInDate;
    protected LocalDate availableCheckOutDate;
    protected int totalRooms;
    protected List<Room> availableRooms;

    public Accommodation(String type, String name, String city, String description, double rating, double basePrice, LocalDate availableCheckInDate, LocalDate availableCheckOutDate, int totalRooms, List<Room> availableRooms) {
        this.type = type;
        this.name = name;
        this.city = city;
        this.description = description;
        this.rating = rating;
        this.basePrice = basePrice;
        this.availableCheckInDate = availableCheckInDate;
        this.availableCheckOutDate = availableCheckOutDate;
        this.totalRooms = totalRooms;
        this.availableRooms = availableRooms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public LocalDate getAvailableCheckInDate() {
        return availableCheckInDate;
    }

    public void setAvailableCheckInDate(LocalDate availableCheckInDate) {
        this.availableCheckInDate = availableCheckInDate;
    }

    public LocalDate getAvailableCheckOutDate() {
        return availableCheckOutDate;
    }

    public void setAvailableCheckOutDate(LocalDate availableCheckOutDate) {
        this.availableCheckOutDate = availableCheckOutDate;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public List<Room> getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(List<Room> availableRooms) {
        this.availableRooms = availableRooms;
    }
}





