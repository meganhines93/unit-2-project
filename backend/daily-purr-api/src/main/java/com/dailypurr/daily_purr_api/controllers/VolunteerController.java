package com.dailypurr.daily_purr_api.controllers;

import com.dailypurr.daily_purr_api.data.VolunteerData;
import com.dailypurr.daily_purr_api.models.Volunteer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/volunteers")
public class VolunteerController {

    @GetMapping("")
    public Collection<Volunteer> getAllVolunteers() {
        return VolunteerData.getAll();
    }
}
