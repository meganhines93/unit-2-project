package com.dailypurr.daily_purr_api.models;

import java.util.Objects;

public class Adoption {

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
    private String about_your_home;
    private String type_of_home;
    private int cat_id;
    private String why_adopt;
    private String describe_your_lifestyle;
    private String new_cat_life;
    private boolean commitment_entire_life;
    private boolean keep_indoors;
    private String additional_comments;

    public Adoption(String first_name, String last_name, String email, String phone_number, String street_address, String city, String state, String zip_code, String about_your_home, String type_of_home, int cat_id, String why_adopt, String describe_your_lifestyle, String new_cat_life, boolean commitment_entire_life, boolean keep_indoors, String additional_comments) {
        this.id = nextId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.street_address = street_address;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.about_your_home = about_your_home;
        this.type_of_home = type_of_home;
        this.cat_id = cat_id;
        this.why_adopt = why_adopt;
        this.describe_your_lifestyle = describe_your_lifestyle;
        this.new_cat_life = new_cat_life;
        this.commitment_entire_life = commitment_entire_life;
        this.keep_indoors = keep_indoors;
        this.additional_comments = additional_comments;
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

    public String getAbout_your_home() {
        return about_your_home;
    }

    public void setAbout_your_home(String about_your_home) {
        this.about_your_home = about_your_home;
    }

    public String getType_of_home() {
        return type_of_home;
    }

    public void setType_of_home(String type_of_home) {
        this.type_of_home = type_of_home;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getWhy_adopt() {
        return why_adopt;
    }

    public void setWhy_adopt(String why_adopt) {
        this.why_adopt = why_adopt;
    }

    public String getDescribe_your_lifestyle() {
        return describe_your_lifestyle;
    }

    public void setDescribe_your_lifestyle(String describe_your_lifestyle) {
        this.describe_your_lifestyle = describe_your_lifestyle;
    }

    public String getNew_cat_life() {
        return new_cat_life;
    }

    public void setNew_cat_life(String new_cat_life) {
        this.new_cat_life = new_cat_life;
    }

    public boolean isCommitment_entire_life() {
        return commitment_entire_life;
    }

    public void setCommitment_entire_life(boolean commitment_entire_life) {
        this.commitment_entire_life = commitment_entire_life;
    }

    public boolean isKeep_indoors() {
        return keep_indoors;
    }

    public void setKeep_indoors(boolean keep_indoors) {
        this.keep_indoors = keep_indoors;
    }

    public String getAdditional_comments() {
        return additional_comments;
    }

    public void setAdditional_comments(String additional_comments) {
        this.additional_comments = additional_comments;
    }

    @Override
    public String toString() {
        return "Adoption{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", street_address='" + street_address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", about_your_home='" + about_your_home + '\'' +
                ", type_of_home='" + type_of_home + '\'' +
                ", cat_id=" + cat_id +
                ", why_adopt='" + why_adopt + '\'' +
                ", describe_your_lifestyle='" + describe_your_lifestyle + '\'' +
                ", new_cat_life='" + new_cat_life + '\'' +
                ", commitment_entire_life=" + commitment_entire_life +
                ", keep_indoors=" + keep_indoors +
                ", additional_comments='" + additional_comments + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Adoption adoption = (Adoption) o;
        return id == adoption.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}


