package com.dailypurr.daily_purr_api.controllers;


import com.dailypurr.daily_purr_api.data.EventData;
import com.dailypurr.daily_purr_api.models.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @GetMapping("")
    public Collection<Event> getAllEvents() {
        return EventData.getAll();
    }
}
