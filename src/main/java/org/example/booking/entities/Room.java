package org.example.booking.entities;

public class Room {
   private String name;
   private String description;
   private int maximumCapacity;
   private int adultsCapacity;
   private int childrenCapacity;
   private double price;
   private int quantity;

    public Room(String name, String description, int maximumCapacity, int adultsCapacity, int childrenCapacity, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.maximumCapacity = maximumCapacity;
        this.adultsCapacity = adultsCapacity;
        this.childrenCapacity = childrenCapacity;
        this.price = price;
        this.quantity = quantity;
    }

    protected Room() {
    }
    @Override
    public String toString() {
        return "Room{" +
                "Nombre: '" + name + '\'' +
                ", Description:'" + description + '\'' +
                ", Capacidad máxima:" + maximumCapacity +
                ", Capacidad de adultos =" + adultsCapacity +
                ", Capacidad de niños:" + childrenCapacity +
                ", Precio: " + price +
                ", Cantidad" + quantity +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAdultsCapacity() {
        return adultsCapacity;
    }

    public void setAdultsCapacity(int adultsCapacity) {
        this.adultsCapacity = adultsCapacity;
    }

    public int getChildrenCapacity() {
        return childrenCapacity;
    }

    public void setChildrenCapacity(int childrenCapacity) {
        this.childrenCapacity = childrenCapacity;
    }
}
