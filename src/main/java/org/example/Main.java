package org.example;

import org.example.booking.entities.Hotel;
import org.example.booking.entities.HotelFactory;
import org.example.booking.entities.Room;
import org.example.booking.entities.StayPackage;

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
                case 1 -> {
                    List<Hotel> hoteles = HotelFactory.getHotels();
                    hoteles.forEach(System.out::println);
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
