package org.example;

import org.example.entities.Hotel;
import org.example.entities.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            viewMenu();

            int opcion = scanner.nextInt();

            switch (opcion) {

                case 0 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    private static void viewMenu() {
        System.out.println("********************************");
        System.out.println("1. Listar hoteles.");
        System.out.println("2. Consultar disponibilidad de fechas, habitaciones y precio.");
        System.out.println("3. Confirmar Habitaciones.");
        System.out.println("4. Ver Reserva.");
        System.out.println("0. Salir.");
        System.out.println("********************************");
    }


    Room singleRoom = new Room("single room", "cama individual, aire acondicionado, baño privado", 1,50.0, 5);
    Room doubleRoom = new Room("double room", "2 camas dobles, vista a la piscina, aire acondicionado, baño privado", 4,80.0,6 );
    Room quadrupleRoom = new Room("quadruple room", "4 camas, vista al jardín, aire acondicionado, baño privado, minibar", 4, 100.0, 3 );
    Room familyRoom = new Room("family room", "4 camas matrimoniales, sala de estar, aire acondicionado, baño privado", 8, 120.0, 2);
    Room suite = new Room("suite", "cama king size, sala de estar, jacuzzi, aire acondicionado, baño privado",2, 150.0, 2);

    List<Room> castilloRooms = new ArrayList<>();
        castilloRooms.add(singleRoom);
        castilloRooms.add(doubleRoom);
        castilloRooms.add(quadrupleRoom);
        castilloRooms.add(familyRoom);
        castilloRooms.add(suite);

    // Datos para los paquetes del Hotel Castillo Resort
    List<Package> castilloPackages = new ArrayList<>();
castilloPackages.add(new StayPackage("Estadía por noche", 50.0, "Habitación equipada con servicios básicos como Wi-Fi, aire acondicionado, baño privado."));
castilloPackages.add(new StayPackage("Estadía por fines de semana", 250.0, "Ofrece servicios como desayuno buffet, acceso a piscina y uso de áreas comunes."));
castilloPackages.add(new StayPackage("Día de sol", 50.0, "Acceso por un día con servicios básicos y acceso a áreas comunes."));
System.out.println(castilloResort);
    // Instanciar el objeto Hotel Castillo Resort
    Hotel castilloResort = new Hotel(
            "hotel",
            "Hotel Castillo Resort",
            "San Gil",
            "Hotel Castillo Resort se encuentra en San Gil, a 42 km de Chicamocha National Park...",
            4.5,
            50.0,
            20241215,
            20250130,
            16,
            castilloRooms,
            castilloPackages,
            new Object[100]
    );

}
