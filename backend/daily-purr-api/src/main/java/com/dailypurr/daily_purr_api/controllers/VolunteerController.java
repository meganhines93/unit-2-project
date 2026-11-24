package com.dailypurr.daily_purr_api.controllers;

import com.dailypurr.daily_purr_api.data.ReservationData;
import com.dailypurr.daily_purr_api.data.VolunteerData;
import com.dailypurr.daily_purr_api.models.Reservations;
import com.dailypurr.daily_purr_api.models.Volunteer;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/volunteers")
public class VolunteerController {

    @GetMapping("")
    public Collection<Volunteer> getAllVolunteers() {
        return VolunteerData.getAll();
    }

    @PostMapping("/add")
    public String addNewVolunteer(@RequestParam String first_name, String last_name, String email, String phone_number, String street_address, String city, String state, String zip_code, String days_available, String time_available, String experience, String additional_Information) {
        Volunteer newVolunteer = new Volunteer(first_name, last_name, email, phone_number, street_address, city, state, zip_code, days_available, time_available, experience,additional_Information);
        VolunteerData.addNew(newVolunteer);
        return "Volunteer Form has been submitted: " + newVolunteer;
    }
}
