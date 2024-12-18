package org.example.booking.entities;

import java.util.List;

public class Finca extends Accommodation{

    public Finca(
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
            List<StayPackage> packages){

            super(type, name, city, description, rating, basePrice, availableCheckInDate,
                    availableCheckOutDate, totalRooms, availableRooms, packages);
    };

    @Override
    public String viewAccommodation() {
        String fincaDetails = String.format(
                "************** Fincas disponibles **********************%n" +
                        "Nombre: %s%n" +
                        "Ciudad: %s%n" +
                        "Calificación: %.1f%n" +
                        "Precio por noche: $%.2f%n" +
                        "Precio total: $%.2f%n" +
                        "Detalles del apartamento: %d habitaciones disponibles%n" +
                        "****************** Paquetes Disponibles ***********************%n",
                this.getName(),
                this.getCity(),
                this.getRating(),
                this.getBasePrice(),
                this.getTotalPrice(),
                this.getAvailableRooms().size()
        );

        for (StayPackage paquete : this.getPackages()) {
            fincaDetails += String.format(
                    " - %s: $%.2f%n   Descripción: %s%n",
                    paquete.getName(), paquete.getPrice(), paquete.getDescription()
            );
        }

        fincaDetails += "**************************************************************";

        return fincaDetails;
    }
    public static Finca createFinca(
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
        return new Finca(
                "finca",
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