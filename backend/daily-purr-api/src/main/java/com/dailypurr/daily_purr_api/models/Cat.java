package com.dailypurr.daily_purr_api.models;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Cat {

    private static int nextId = 1;

    private final int id;
    private String name;
    private int age;
    private String color;
    private String breed;
    private List<String> personality;
    private List<String> good_with;
    private String description;
    private String imageURL;
    private boolean available;
    private String gender;
    private BigDecimal adoption_fee;
    private String adoption_info;

    public Cat(String name, int age, String color, String breed, List<String> personality, List<String> good_with, String description, String imageURL, boolean available, String gender, BigDecimal adoption_fee, String adoption_info) {
        this.id = nextId;
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.personality = personality;
        this.good_with = good_with;
        this.description = description;
        this.imageURL = imageURL;
        this.available = available;
        this.gender = gender;
        this.adoption_fee = adoption_fee;
        this.adoption_info = adoption_info;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public List<String> getPersonality() {
        return personality;
    }

    public void setPersonality(List<String> personality) {
        this.personality = personality;
    }

    public List<String> getGood_with() {
        return good_with;
    }

    public void setGood_with(List<String> good_with) {
        this.good_with = good_with;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigDecimal getAdoption_fee() {
        return adoption_fee;
    }

    public void setAdoption_fee(BigDecimal adoption_fee) {
        this.adoption_fee = adoption_fee;
    }

    public String getAdoption_info() {
        return adoption_info;
    }

    public void setAdoption_info(String adoption_info) {
        this.adoption_info = adoption_info;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", personality=" + personality +
                ", good_with=" + good_with +
                ", description='" + description + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", available=" + available +
                ", gender='" + gender + '\'' +
                ", adoption_fee=" + adoption_fee +
                ", adoption_info='" + adoption_info + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
