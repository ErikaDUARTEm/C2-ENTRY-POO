package org.example;

import org.example.booking.hotels.entities.Hotel;
import org.example.booking.hotels.entities.Room;
import org.example.booking.hotels.entities.StayPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear hotel con habitaciones y paquetes
        Hotel castilloResort = createHotelCastilloResort();

        while (true) {
            viewMenu();

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.println(castilloResort); // Listar hoteles
                case 0 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    // Método auxiliar para mostrar el menú
    private static void viewMenu() {
        System.out.println("********************************");
        System.out.println("1. Listar hoteles.");
        System.out.println("2. Consultar disponibilidad de fechas, habitaciones y precio.");
        System.out.println("3. Confirmar Habitaciones.");
        System.out.println("4. Ver Reserva.");
        System.out.println("0. Salir.");
        System.out.println("********************************");
    }

    // Método que crea el Hotel Castillo Resort
    private static Hotel createHotelCastilloResort() {
        List<Room> castilloRooms = createCastilloRooms();
        List<StayPackage> castilloPackages = createCastilloPackages();

        return new Hotel(
                "hotel",
                "Hotel Castillo Resort",
                "San Gil",
                "Hotel Castillo Resort se encuentra en San Gil, a 42 km de Chicamocha National Park...",
                4.5,
                50.0,
                0,
                0,
                20241215,
                20250130,
                16,
                0,
                castilloRooms,
                castilloPackages,
                null
        );
    }

    // Método para inicializar las habitaciones del Castillo Resort
    private static List<Room> createCastilloRooms() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("single room", "cama individual, aire acondicionado, baño privado", 1, 50.0, 5));
        rooms.add(new Room("double room", "2 camas dobles, vista a la piscina, aire acondicionado, baño privado", 4, 80.0, 6));
        rooms.add(new Room("quadruple room", "4 camas, vista al jardín, aire acondicionado, baño privado, minibar", 4, 100.0, 3));
        rooms.add(new Room("family room", "4 camas matrimoniales, sala de estar, aire acondicionado, baño privado", 8, 120.0, 2));
        rooms.add(new Room("suite", "cama king size, sala de estar, jacuzzi, aire acondicionado, baño privado", 2, 150.0, 2));
        return rooms;
    }

    // Método para inicializar los paquetes del Castillo Resort
    private static List<StayPackage> createCastilloPackages() {
        List<StayPackage> packages = new ArrayList<>();
        packages.add(new StayPackage("Estadía por noche", 50.0, "Habitación equipada con servicios básicos como Wi-Fi, aire acondicionado, baño privado."));
        packages.add(new StayPackage("Estadía por fines de semana", 250.0, "Ofrece servicios como desayuno buffet, acceso a piscina y uso de áreas comunes."));
        packages.add(new StayPackage("Día de sol", 50.0, "Acceso por un día con servicios básicos y acceso a áreas comunes."));
        return packages;
    }
}
