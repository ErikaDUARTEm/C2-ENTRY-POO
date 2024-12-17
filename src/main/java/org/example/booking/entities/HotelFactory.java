package org.example.booking.entities;

import java.util.ArrayList;
import java.util.List;

public class HotelFactory {
    private List<Hotel> hotels = new ArrayList<>();

    public HotelFactory() {
        createCastilloResort();
        createMesonCuchicute();
    }

    public Hotel createHotel(String name, String city, String description, double rating,
                                    double basePrice, int availableCheckInDate, int availableCheckOutDate,
                                    int totalRooms, List<Room> availableRooms,
                                    List<StayPackage> packages) {
        Hotel hotel = Hotel.createHotel(
                name, city, description, rating, basePrice, availableCheckInDate, availableCheckOutDate,
                totalRooms, availableRooms, packages);
        addHotel(hotel);
        return hotel;
    }

    public Hotel createCastilloResort() {
        return createHotel(
                "Hotel Castillo Resort", "San Gil",
                "Hotel Castillo Resort se encuentra en San Gil, a 42 km de Chicamocha National Park...",
                4.5, 50.0, 20241215, 20250130,
                16, createCastilloRooms(), createCastilloPackages()
        );
    }

    public Hotel createMesonCuchicute() {
        return createHotel(
                "Mesón del Cuchicute", "San Gil, Santander",
                "60 confortables habitaciones, 13 confortables cabañas, 2 cabañas dúplex, zona de camping...",
                4.3, 60.0, 20250115, 20250130,
                13, createMesonRooms(), createMesonPackages()
        );
    }

    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }
    private static List<Room> createCastilloRooms() {
        return List.of(
                new Room("single room", "cama individual, aire acondicionado, baño privado", 1, 50.0, 5),
                new Room("double room", "2 camas dobles, vista a la piscina, aire acondicionado, baño privado", 4, 80.0, 6),
                new Room("quadruple room", "4 camas, vista al jardín, aire acondicionado, baño privado, minibar", 4, 100.0, 3),
                new Room("family room", "4 camas matrimoniales, sala de estar, aire acondicionado, baño privado", 8, 120.0, 2),
                new Room("suite", "cama king size, sala de estar, jacuzzi, aire acondicionado, baño privado", 2, 150.0, 2)
        );
    }

    private static List<StayPackage> createCastilloPackages() {
        return List.of(
                new StayPackage("Estadía por noche", 50.0, "Habitación equipada con servicios básicos como Wi-Fi, aire acondicionado, baño privado."),
                new StayPackage("Estadía por fines de semana", 250.0, "Ofrece servicios como desayuno buffet, acceso a piscina y uso de áreas comunes."),
                new StayPackage("Día de sol", 50.0, "Acceso por un día con servicios básicos y acceso a áreas comunes.")
        );
    }

    private static List<Room> createMesonRooms() {
        return List.of(
                new Room("single room", "cama individual, baño privado, aire acondicionado", 1, 60.0, 5),
                new Room("double room", "2 camas dobles, vista al jardín, aire acondicionado, baño privado", 4, 100.0, 6),
                new Room("quadruple room", "4 camas, aire acondicionado, baño privado, minibar", 4, 150.0, 3),
                new Room("family room", "4 camas matrimoniales, sala de estar, aire acondicionado, baño privado", 8, 180.0, 2),
                new Room("suite", "cama king size, sala de estar, jacuzzi, aire acondicionado, baño privado", 2, 200.0, 2)
        );
    }

    private static List<StayPackage> createMesonPackages() {
        return List.of(
                new StayPackage("Estadía por noche", 140.0, "Acceso a habitaciones con minibar, room service, piscina y Wifi gratuito."),
                new StayPackage("Estadía por fines de semana", 320.0, "Incluye desayuno, servicio de bar y acceso a todas las instalaciones."),
                new StayPackage("Día de sol", 60.0, "Uso de piscina, zona de camping y áreas comunes durante el día.")
        );
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

}
