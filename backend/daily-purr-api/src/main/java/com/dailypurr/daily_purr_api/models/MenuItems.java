package com.dailypurr.daily_purr_api.models;

import java.math.BigDecimal;
import java.util.Objects;

public class MenuItems {

    private static int nextId;

    private final int id;
    private String name;
    private String category;
    private String description;
    private BigDecimal price;
    private String imageURL;
    private String available;

    public MenuItems(String name, String category, String description, BigDecimal price, String imageURL, String available) {
        this.id = nextId;
        this.name = name;
        this.category = category;
        this.description = description;
        this.price = price;
        this.imageURL = imageURL;
        this.available = available;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "MenuItems{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imageURL='" + imageURL + '\'' +
                ", available='" + available + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MenuItems menuItems = (MenuItems) o;
        return id == menuItems.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
