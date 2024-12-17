package org.example.entities;

import java.time.LocalTime;

public class Reservation {

    private Usuario usuario;
    private LocalTime estimatedArrivalTime;
    private Room reservedRoom;
    private Hotel hotel;

    public Reservation(Usuario usuario, LocalTime estimatedArrivalTime, Room reservedRoom, Hotel hotel) {
        this.usuario = usuario;
        this.estimatedArrivalTime = estimatedArrivalTime;
        this.reservedRoom = reservedRoom;
        this.hotel = hotel;
    }

    private Reservation() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalTime getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }

    public void setEstimatedArrivalTime(LocalTime estimatedArrivalTime) {
        this.estimatedArrivalTime = estimatedArrivalTime;
    }

    public Room getReservedRoom() {
        return reservedRoom;
    }

    public void setReservedRoom(Room reservedRoom) {
        this.reservedRoom = reservedRoom;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
