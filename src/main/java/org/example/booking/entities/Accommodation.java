package org.example.booking.entities;


import java.util.List;

public abstract class Accommodation {
    private String type;
    private String name;
    private String city;
    private String description;
    private double rating;
    private double basePrice;
    private double totalPrice;
    private double adjustmentPrice;
    private int availableCheckInDate;
    private int availableCheckOutDate;
    private int totalRooms;
    private int numberOfConfirmedRooms;
    private List<Room> availableRooms;
    private List<StayPackage> packages;
    private List<Reservation> reservations;


    public Accommodation(
            String type,
            String name,
            String city,
            String description,
            double rating,
            double basePrice,
            double totalPrice,
            double adjustmentPrice,
            int availableCheckInDate,
            int availableCheckOutDate,
            int totalRooms,
            int numberOfConfirmedRooms,
            List<Room> availableRooms,
            List<StayPackage> packages,
            List<Reservation> reservations)

    {
        this.type = type;
        this.name = name;
        this.city = city;
        this.description = description;
        this.rating = rating;
        this.basePrice = basePrice;
        this.totalPrice = totalPrice;
        this.adjustmentPrice = adjustmentPrice;
        this.availableCheckInDate = availableCheckInDate;
        this.availableCheckOutDate = availableCheckOutDate;
        this.totalRooms = totalRooms;
        this.numberOfConfirmedRooms = numberOfConfirmedRooms;
        this.availableRooms = availableRooms;
        this.packages = packages;
        this.reservations = reservations;

    }

    protected Accommodation() {
    }

    public Accommodation(String type, String name, String city, String description, double rating, double basePrice, int availableCheckInDate, int availableCheckOutDate, int totalRooms, List<Room> availableRooms, List<StayPackage> packages, List<Reservation> reservations) {
    }

    public void calculateTotalPrice(double basePrice, double totalDays, int numberOfConfirmedRooms) {
        this.totalPrice = PriceCalculation.calculateTotalPrice(basePrice, totalDays, numberOfConfirmedRooms);
    }

    public void adjustTotalPrice(int availableCheckInDate, int availableCheckOutDate, double totalPrice) {
        this.adjustmentPrice = PriceCalculation.calculatePriceAdjustment(availableCheckInDate, availableCheckOutDate, totalPrice);
    }
    public abstract String viewHotel();
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
    public double getAdjustmentPrice() {
        return adjustmentPrice;
    }

    public void setAdjustmentPrice(double adjustmentPrice) {
        this.adjustmentPrice = adjustmentPrice;
    }

    public List<StayPackage> getPackages() {
        return packages;
    }

    public void setPackages(List<StayPackage> packages) {
        this.packages = packages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}





