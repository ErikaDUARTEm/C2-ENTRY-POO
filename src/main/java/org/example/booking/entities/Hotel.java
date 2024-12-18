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
    public String viewAccommodation() {
        String hotelDetails = String.format(
                "************** Detalles del Hotel **********************%n" +
                        "Nombre: %s, Ciudad: %s%n" +
                        "Descripción: %s%n" +
                        "Calificación: %.1f, Precio por noche: $%.2f%n" +
                        "Disponible desde: %d hasta %d%n" +
                        "Habitaciones disponibles: %d%n" +
                        "Habitaciones: %d%n" +
                        "Paquetes:%n",
                this.getName(), this.getCity(), this.getDescription(),
                this.getRating(), this.getBasePrice(),
                this.getAvailableCheckInDate(), this.getAvailableCheckOutDate(),
                this.getTotalRooms(), this.getAvailableRooms().size()
        );

        for (StayPackage paquete : this.getPackages()) {
            hotelDetails += String.format(
                    " - %s: $%.2f, Descripción: %s%n",
                    paquete.getName(), paquete.getPrice(), paquete.getDescription()
            );
        }

        hotelDetails += "****************************************************";

        return hotelDetails;
    }

    @Override
    public List<Accommodation> searchAvailableAccommodations() {
        return List.of();
    }

    /** public List<Accommodation> searchAvailableAccommodations(
            String city,
            String type,
            int availableCheckInDate,
            int availableCheckOutDate,
            int numberOfAdults,
            int numberOfChildren,
            int numberOfRooms){

         availableRooms.stream()
                .filter(room -> room.getAdultsCapacity() >= numberOfAdults && room.getChildrenCapacity() >= numberOfChildren)
                .collect(Collectors.toList());

    };
**/
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
