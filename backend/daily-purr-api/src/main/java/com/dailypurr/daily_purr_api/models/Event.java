package com.dailypurr.daily_purr_api.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Event {

    private static int nextId = 1;

    private final int id;
    private String title;
    private LocalDate date;
    private LocalTime time;
    private String description;
    private String price;
    private int capacity;
    private String category;
    private String imageURL;

    public Event(String title, LocalDate date, LocalTime time, String description, String price, int capacity, String category, String imageURL) {
        this.id = nextId;
        this.title = title;
        this.date = date;
        this.time = time;
        this.description = description;
        this.price = price;
        this.capacity = capacity;
        this.category = category;
        this.imageURL = imageURL;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", capacity=" + capacity +
                ", category='" + category + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
