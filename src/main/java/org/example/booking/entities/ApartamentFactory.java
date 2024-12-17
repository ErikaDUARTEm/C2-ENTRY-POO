package org.example.booking.entities;

import java.util.ArrayList;
import java.util.List;

public class ApartamentFactory {
    private List<Apartament> apartaments = new ArrayList<>();

    public ApartamentFactory() {
        createParkView();
        createVillaBridge();
        createSanGilNatural();
    }

    public void addApartament(Apartament apartament) {
        apartaments.add(apartament);
    }

    public Apartament createApartament(
            String name, String city, String description, double rating,
            double basePrice, int availableCheckInDate, int availableCheckOutDate,
            int totalRooms, List<Room> availableRooms, List<StayPackage> packages) {
        Apartament apartament = Apartament.createApartament(
                name, city, description, rating, basePrice, availableCheckInDate, availableCheckOutDate,
                totalRooms, availableRooms, packages);
        addApartament(apartament);
        return apartament;
    }

    public Apartament createParkView() {
        return createApartament(

                "Vista al Parque",
                "San Gil",
                "Apartamento moderno con vistas al Parque Principal de San Gil, " +
                        "totalmente amueblado con cocina equipada, Wi-Fi, aire acondicionado, " +
                        "y terraza con vista al parque.ideal para grupos y familias.",
                4.8,
                250.0,
                20250101,
                20250120,
                6,
                createParkViewRooms(),
                createParkViewRoomsPackages()
        );
    }

    private List<Room> createParkViewRooms() {
        return List.of(
                new Room("Habitación principal", "cama doble, aire acondicionado, baño privado", 2, 100.0, 1),
                new Room("Habitaciones secundarias", "camas individuales, aire acondicionado, baño compartido", 4, 80.0, 2),
                new Room("Sala de estar", "sofa amplio, TV, acceso directo a la cocina", 0, 50.0, 1),
                new Room("Cocina equipada", "utensilios básicos, horno, nevera", 0, 60.0, 1),
                new Room("Area exterior", "terraza con vista al parque, zona de descanso al aire libre", 0, 40.0, 1)
        );
    }

    private List<StayPackage> createParkViewRoomsPackages() {
        return List.of(
                new StayPackage("Estadía por noche", 300.0, "Apartamento completo con todas las comodidades básicas."),
                new StayPackage("Estadía por fines de semana", 550.0, "Incluye desayuno y limpieza diaria."),
                new StayPackage("Semana completa", 2000.0, "Estadía de 7 noches con servicios premium.")
        );
    }

    private Apartament createVillaBridge() {
        return createApartament(
                        "Puente de la Villa",
                        "San Gil",
                        "Puente de la Villa ofrece apartamentos modernos con vistas al puente y la ciudad desde sus balcones.",
                        4.6,
                        250.0,
                        20250101,
                        20250131,
                        5,
                        createVillaBridgeRooms(),
                        createVillaBridgePackages()
        );
    }

    private List<Room> createVillaBridgeRooms() {
        return List.of(
                new Room("Habitación principal", "cama matrimonial, aire acondicionado, baño privado", 2, 90.0, 1),
                new Room("Habitaciones secundarias", "camas individuales, aire acondicionado, baño compartido", 4, 70.0, 2),
                new Room("Sala de estar", "sofá amplio, TV, acceso a cocina equipada", 0, 50.0, 1),
                new Room("Cocina equipada", "utensilios básicos, horno, nevera", 0, 60.0, 1),
                new Room("Terraza", "vista al puente, zona de descanso al aire libre", 0, 40.0, 1)
        );
    }

    private List<StayPackage> createVillaBridgePackages() {
        return List.of(
                new StayPackage("Estadia por noche", 250.0, "Apartamento completo con acceso a todas las áreas."),
                new StayPackage("Estadia por fines de semana", 450.0, "Incluye desayuno y limpieza diaria."),
                new StayPackage("Semana completa", 1800.0, "Disfruta del apartamento durante 7 noches con servicios incluidos.")
        );
    }

    private Apartament createSanGilNatural() {
       return createApartament(
                        "San Gil Natural",
                        "San Gil",
                        "San Gil Natural ofrece un entorno tranquilo con amplias vistas al río y zonas verdes exclusivas.",
                        4.8,
                        280.0,
                        20250101,
                        20250131,
                        6,
                        createSanGilNaturalRooms(),
                        createSanGilNaturalPackages()
        );

    }

    private List<Room> createSanGilNaturalRooms() {
        return List.of(
                new Room("Habitación principal", "cama king size, aire acondicionado, baño privado", 2, 120.0, 1),
                new Room("Habitaciones secundarias", "camas dobles, aire acondicionado, baño compartido", 4, 100.0, 2),
                new Room("Sala de estar", "espaciosa con sofá, TV, acceso directo a la cocina", 0, 60.0, 1),
                new Room("Cocina equipada", "utensilios completos, horno, nevera", 0, 70.0, 1),
                new Room("Area exterior", "vista al río, zona de descanso al aire libre", 0, 50.0, 1)
        );
    }

    private List<StayPackage> createSanGilNaturalPackages() {
        return List.of(
                new StayPackage("Estadia por noche", 280.0, "Apartamento completo con Wi-Fi y limpieza diaria."),
                new StayPackage("Estadia por fines de semana", 500.0, "Incluye desayuno y acceso a áreas verdes."),
                new StayPackage("Semana completa", 2100.0, "Estadía de 7 noches con servicios premium.")
        );
    }


    public List<Apartament> getApartaments() {
        return apartaments;
    }
}
