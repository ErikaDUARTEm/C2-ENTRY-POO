package org.example.entities;

public class Room {
   private String name;
   private String description;
   private int maximumCapacity;
   private double price;
   private int quantity;

    public Room(String name, String description, int maximumCapacity, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.maximumCapacity = maximumCapacity;
        this.price = price;
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", maximumCapacity=" + maximumCapacity +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
