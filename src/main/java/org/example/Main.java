package org.example;

import org.example.booking.hotels.entities.Hotel;
import org.example.booking.hotels.entities.HotelFactory;
import org.example.booking.hotels.entities.Room;
import org.example.booking.hotels.entities.StayPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Hotel> allHotels = Hotel.getAllHotels();
        for (Hotel hotel : allHotels) {
            hotel.details();
        }
        while (true) {
            viewMenu();

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                  System.out.println(allHotels);
                }
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

}
