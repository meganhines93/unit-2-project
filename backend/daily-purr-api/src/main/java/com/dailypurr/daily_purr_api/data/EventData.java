package com.dailypurr.daily_purr_api.data;

import com.dailypurr.daily_purr_api.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {
    private static final Map<Integer, Event> events = new HashMap<>();

    public static Collection<Event> getAll() {
        return events.values();
    }

    public static void addNew(Event event){
        events.put(event.getId(), event);
    }

    public static Event getById(int id) {
        return events.get(id);
    }
}
