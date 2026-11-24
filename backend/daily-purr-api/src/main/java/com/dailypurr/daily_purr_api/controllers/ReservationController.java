package com.dailypurr.daily_purr_api.controllers;

import com.dailypurr.daily_purr_api.data.ReservationData;
import com.dailypurr.daily_purr_api.models.Reservations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @GetMapping("")
    public Collection<Reservations> getAllReservations() {
        return ReservationData.getAll();
    }
}
