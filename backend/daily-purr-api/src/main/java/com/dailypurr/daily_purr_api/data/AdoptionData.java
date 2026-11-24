package com.dailypurr.daily_purr_api.data;

import com.dailypurr.daily_purr_api.models.Adoption;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AdoptionData {
    private static final Map<Integer, Adoption> adoptions = new HashMap<>();

    public static Collection<Adoption> getAll() {
        return adoptions.values();
    }

    public static void addNew(Adoption adoption){
        adoptions.put(adoption.getId(), adoption);
    }

    public static Adoption getById(int id) {
        return adoptions.get(id);
    }
}