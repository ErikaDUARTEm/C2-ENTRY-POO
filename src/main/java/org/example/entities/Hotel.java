package org.example.entities;

import java.util.List;

public class Hotel extends Accommodation {
   protected List<Room> rooms;
   protected List<StayPackage> packages;
   protected List<Reservation> reservations;

    public Hotel(String type, String name, String city, String description, double rating, double basePrice, double totalPrice, double adjustmentPrice, int availableCheckInDate, int availableCheckOutDate, int totalRooms, int numberOfConfirmedRooms, List<Room> availableRooms, List<StayPackage> packages, List<Reservation> reservations, List<Room> rooms, List<StayPackage> packages, List<Reservation> reservations) {
        super(type, name, city, description, rating, basePrice, totalPrice, adjustmentPrice, availableCheckInDate, availableCheckOutDate, totalRooms, numberOfConfirmedRooms, availableRooms, packages, reservations);
        this.rooms = rooms;
        this.packages = packages;
        this.reservations = reservations;
    }


    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public List<StayPackage> getPackages() {
        return packages;
    }

    @Override
    public void setPackages(List<StayPackage> packages) {
        this.packages = packages;
    }

    @Override
    public List<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
