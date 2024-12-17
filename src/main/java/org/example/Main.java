package org.example;

import org.example.booking.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelFactory hotelFactory = new HotelFactory();
        ApartamentFactory apartamentFactory = new ApartamentFactory();

        while (true) {
            viewMenu();

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    List<Hotel> hoteles = hotelFactory.getHotels();
                    if (hoteles.isEmpty()) {
                        System.out.println("No hay hoteles disponibles.");
                    } else {
                        hoteles.forEach(hotel -> System.out.println(hotel.viewAccommodation()));
                    }
                }
                case 2->{
                    List<Apartament> apartaments = apartamentFactory.getApartaments();
                    if (apartaments.isEmpty()) {
                        System.out.println("No hay apartamentos disponibles.");
                    } else {
                        apartaments.forEach(apartament -> System.out.println(apartament.viewAccommodation()));
                    }
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
        System.out.println("2. Listar apartamentos");
        System.out.println("3. Consultar disponibilidad de fechas, habitaciones y precio.");
        System.out.println("4. Confirmar Habitaciones.");
        System.out.println("5. Ver Reserva.");
        System.out.println("0. Salir.");
        System.out.println("********************************");
    }

}
