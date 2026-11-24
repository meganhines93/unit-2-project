package com.dailypurr.daily_purr_api.controllers;


import com.dailypurr.daily_purr_api.data.EventData;
import com.dailypurr.daily_purr_api.models.Event;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @GetMapping("")
    public Collection<Event> getAllEvents() {
        return EventData.getAll();
    }

    @PostMapping("/add")
    public String addNewEvent(@RequestParam String title, LocalDate date, LocalTime time, String description, String price, int capacity, String category, String imageURL) {
        Event newEvent = new Event(title, date, time, description, price, capacity, category, imageURL);
        EventData.addNew(newEvent);
        return "Event has been added: " + newEvent;
    }
}
