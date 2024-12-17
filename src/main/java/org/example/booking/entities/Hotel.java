package org.example.booking.entities;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Accommodation {


    public Hotel(
            String type,
            String name,
            String city,
            String description,
            double rating,
            double basePrice,
            int availableCheckInDate,
            int availableCheckOutDate,
            int totalRooms,
            List<Room> availableRooms,
            List<StayPackage> packages) {
        super(type, name, city, description, rating, basePrice, availableCheckInDate,
                availableCheckOutDate, totalRooms, availableRooms, packages);
    }

    @Override
    public String viewHotel() {
        return "Hotel{" +
                "type='" + getType() + '\'' +
                ", city='" + getCity() + '\'' +
                ", name='" + getName() + '\'' +
                ", description='" + getName() + '\'' +
                ", rating=" + getRating() +
                ", basePrice=" + getBasePrice() +
                ", totalPrice=" + getTotalPrice() +
                ", adjustmentPrice=" + getAdjustmentPrice() +
                ", availableCheckInDate=" + getAvailableCheckInDate() +
                ", availableCheckOutDate=" + getAvailableCheckOutDate() +
                ", totalRooms=" + getTotalRooms() +
                ", availableRooms=" + getAvailableRooms() +
                ", packages=" + getPackages() +
                '}';
    }

    public static Hotel createHotel(
            String name,
            String city,
            String description,
            double rating,
            double basePrice,
            int availableCheckInDate,
            int availableCheckOutDate,
            int totalRooms,
            List<Room> rooms,
            List<StayPackage> packages
    ) {
        return new Hotel(
                "hotel",
                name,
                city,
                description,
                rating,
                basePrice,
                availableCheckInDate,
                availableCheckOutDate,
                totalRooms,
                rooms,
                packages
        );
    }

}
