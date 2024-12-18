package org.example.booking.entities;

import java.util.ArrayList;
import java.util.List;

public class FincaFactory {
    private List<Finca> fincas = new ArrayList<>();

    public FincaFactory(){
        paradiseFarm();
    }
    public void addFinca(Finca finca) {
        fincas.add(finca);
    }

    public Finca createFinca(
            String name, String city, String description, double rating,
            double basePrice, int availableCheckInDate, int availableCheckOutDate,
            int totalRooms, List<Room> availableRooms, List<StayPackage> packages) {
       Finca finca= Finca.createFinca(
                name, city, description, rating, basePrice, availableCheckInDate, availableCheckOutDate,
                totalRooms, availableRooms, packages);
        addFinca(finca);
        return finca;
    }
    public Finca paradiseFarm() {
        return createFinca(
                "Finca El Paraíso",
                "San Gil",
                "Finca El Paraíso en San Gil, Santander, es ideal para quienes buscan tranquilidad y contacto con la naturaleza. Ofrece piscina, áreas verdes y conexión Wi-Fi.",
                4.6,
                45.0,
                20250501,
                20250520,
                6,
                paradiseFarmRooms(),
                paradiseFarmPackages()
        );
    }
    private List<Room> paradiseFarmRooms() {
        return List.of(
                new Room("single room", "cama individual, baño privado, aire acondicionado",1, 45.0, 1),
                new Room("double room", "2 camas dobles, aire acondicionado, baño privado, vista al jardín", 4, 75.0, 1 ),
                new Room("quadruple room", "4 camas, baño privado, aire acondicionado, vista al campo", 4, 110.0, 2),
                new Room("family room","4 camas matrimoniales, sala de estar, aire acondicionado, baño privado",  8, 130.0, 1),
                new Room("matrimonial","cama matrimonial, baño privado, aire acondicionado",  2, 150.0, 1 )
        );
    };

    private List<StayPackage> paradiseFarmPackages() {
        return List.of(
                new StayPackage("Estadia por noche", 150.0, "Incluye barbacoa, Wifi, piscina y desayuno continental."),
                new StayPackage("Estadia por fines de semana", 360.0, "Acceso completo a todas las instalaciones, desayuno buffet y zona de barbacoa."),
                new StayPackage("Pasadía", 70.0, "Uso de piscina, barbacoa y zona de picnic.")
        );
        };

    public List<Finca> getFincas() {
        return fincas;
    }

}
