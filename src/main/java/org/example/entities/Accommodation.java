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
    protected double totalPrice;
    protected int availableCheckInDate;
    protected int availableCheckOutDate;
    protected int totalRooms;
    protected int numberOfConfirmedRooms;
    protected List<Room> availableRooms;

    public Accommodation(
            String type,
            String name,
            String city,
            String description,
            double rating,
            double basePrice,
            double totalPrice,
            int availableCheckInDate,
            int availableCheckOutDate,
            int totalRooms,
            int numberOfConfirmedRooms,
            List<Room> availableRooms)
    {
        this.type = type;
        this.name = name;
        this.city = city;
        this.description = description;
        this.rating = rating;
        this.basePrice = basePrice;
        this.totalPrice = totalPrice;
        this.availableCheckInDate = availableCheckInDate;
        this.availableCheckOutDate = availableCheckOutDate;
        this.totalRooms = totalRooms;
        this.numberOfConfirmedRooms = numberOfConfirmedRooms;
        this.availableRooms = availableRooms;
    }

    public Accommodation() {
    }
    public static double calculateTotalPrice(double basePrice, double totalDays, int numberOfConfirmedRooms){
        return basePrice * totalDays * numberOfConfirmedRooms;
    }
    public static double calculatePriceAdjustment(int availableCheckInDate, int availableCheckOutDate, double totalPrice){
        // últimos dos dígitos para el día de inicio
        int start = availableCheckInDate % 100;
        //  últimos dos dígitos para el día de fin
        int end = availableCheckOutDate % 100;

        double adjustment;
        if (start >= 26) {
            // Sube el precio 15%
            adjustment = totalPrice * 1.15;
        } else if (start >= 10 && end <= 15) {
            // Sube el precio 10%
            adjustment = totalPrice * 1.10;
        } else if (start >= 5 && end <= 10) {
            // Baja el precio 8%
            adjustment = totalPrice * 0.92;
        } else {
            // Sin cambios si no aplica ninguna regla
            adjustment = totalPrice;
        }

        return adjustment;
    };

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

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getAvailableCheckInDate() {
        return availableCheckInDate;
    }

    public void setAvailableCheckInDate(int availableCheckInDate) {
        this.availableCheckInDate = availableCheckInDate;
    }

    public int getAvailableCheckOutDate() {
        return availableCheckOutDate;
    }

    public void setAvailableCheckOutDate(int availableCheckOutDate) {
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





