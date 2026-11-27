package com.dailypurr.daily_purr_api.controllers;

import com.dailypurr.daily_purr_api.data.CatData;
import com.dailypurr.daily_purr_api.data.ReservationData;
import com.dailypurr.daily_purr_api.models.Cat;
import com.dailypurr.daily_purr_api.models.Reservations;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @GetMapping("")
    public Collection<Reservations> getAllReservations() {
        return ReservationData.getAll();
    }

    @GetMapping("/details/{reservationId}")
    public Reservations getReservationById(@PathVariable int reservationId) {
        return ReservationData.getById(reservationId);
    }

    @PostMapping("/add")
    public String addNewReservation(@RequestParam String first_name, String last_name, String email, String phone_number, int number_of_guests, int event_id) {
        Reservations newReservation = new Reservations(first_name, last_name, email, phone_number, number_of_guests, event_id);
        ReservationData.addNew(newReservation);
        return "Reservation has been submitted: " + newReservation;
    }
}
