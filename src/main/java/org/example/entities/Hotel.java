package org.example.entities;

import java.util.List;

public class Hotel extends Accommodation {
   protected List<Room> rooms;

    public Hotel(
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
            List<Room> availableRooms,
            List<Room> rooms) {
        super(type, name, city, description, rating, basePrice, totalPrice, availableCheckInDate, availableCheckOutDate, totalRooms, numberOfConfirmedRooms, availableRooms);
        this.rooms = rooms;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
