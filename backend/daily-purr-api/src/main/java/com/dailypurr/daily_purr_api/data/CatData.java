package com.dailypurr.daily_purr_api.data;

import com.dailypurr.daily_purr_api.models.Cat;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CatData {

    private static final Map<Integer, Cat> cats = new HashMap<>();

    public static Collection<Cat> getAll() {
        return cats.values();
    }

    public static void addNew(Cat cat){
        cats.put(cat.getId(), cat);
    }

    public static Cat getById(int id) {
        return cats.get(id);
    }
}
