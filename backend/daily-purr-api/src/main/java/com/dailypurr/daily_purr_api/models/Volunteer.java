package com.dailypurr.daily_purr_api.models;

import java.util.Objects;

public class Volunteer {

    private static int nextId = 1;

    private final int id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;
    private String street_address;
    private String city;
    private String state;
    private String zip_code;
    private String days_available;
    private String time_available;
    private String experience;
    private String additional_Information;

    public Volunteer(String first_name, String last_name, String email, String phone_number, String street_address, String city, String state, String zip_code, String days_available, String time_available, String experience, String additional_Information) {
        this.id = nextId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.street_address = street_address;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.days_available = days_available;
        this.time_available = time_available;
        this.experience = experience;
        this.additional_Information = additional_Information;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getDays_available() {
        return days_available;
    }

    public void setDays_available(String days_available) {
        this.days_available = days_available;
    }

    public String getTime_available() {
        return time_available;
    }

    public void setTime_available(String time_available) {
        this.time_available = time_available;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getAdditional_Information() {
        return additional_Information;
    }

    public void setAdditional_Information(String additional_Information) {
        this.additional_Information = additional_Information;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", street_address='" + street_address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", days_available='" + days_available + '\'' +
                ", time_available='" + time_available + '\'' +
                ", experience='" + experience + '\'' +
                ", additional_Information='" + additional_Information + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volunteer volunteer = (Volunteer) o;
        return id == volunteer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
