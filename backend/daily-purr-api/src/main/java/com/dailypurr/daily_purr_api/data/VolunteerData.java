package com.dailypurr.daily_purr_api.data;

import com.dailypurr.daily_purr_api.models.Volunteer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VolunteerData {
    private static final Map<Integer, Volunteer> volunteers = new HashMap<>();

    public static Collection<Volunteer> getAll() {
        return volunteers.values();
    }

    public static void addNew(Volunteer volunteer){
        volunteers.put(volunteer.getId(), volunteer);
    }

    public static Volunteer getById(int id) {
        return volunteers.get(id);
    }
}