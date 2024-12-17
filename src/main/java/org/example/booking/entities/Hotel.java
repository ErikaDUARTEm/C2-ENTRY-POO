package org.example.booking.entities;

import java.util.List;

public class Hotel extends Accommodation {

    public Hotel(
            String type, String name, String city, String description,
            double rating, double basePrice, double totalPrice, double adjustmentPrice, int availableCheckInDate,
            int availableCheckOutDate, int totalRooms, int numberOfConfirmedRooms, List<Room> availableRooms, List<StayPackage> packages, List<Reservation> reservations) {
        super(type, name, city, description, rating, basePrice, 0, 0, availableCheckInDate,
                availableCheckOutDate, totalRooms, 0, availableRooms, packages, null);
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

    @Override
    public String viewHotel() {
        return "Hotel{" +
                "type='" + type + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", basePrice=" + basePrice +
                ", totalPrice=" + totalPrice +
                ", adjustmentPrice=" + adjustmentPrice +
                ", availableCheckInDate=" + availableCheckInDate +
                ", availableCheckOutDate=" + availableCheckOutDate +
                ", totalRooms=" + totalRooms +
                ", numberOfConfirmedRooms=" + numberOfConfirmedRooms +
                ", availableRooms=" + availableRooms +
                ", reservations=" + reservations +
                ", packages=" + packages +
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
                0,
                0,
                availableCheckInDate,
                availableCheckOutDate,
                totalRooms,
                0,
                rooms,
                packages,
                null
        );
    }
}
