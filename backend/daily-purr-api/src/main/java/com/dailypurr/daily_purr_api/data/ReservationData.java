package com.dailypurr.daily_purr_api.data;

import com.dailypurr.daily_purr_api.models.Reservations;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ReservationData {
    private static final Map<Integer, Reservations> reservations = new HashMap<>();

    public static Collection<Reservations> getAll() { return reservations.values();
    }

    public static void addNew(Reservations reservation){reservations.put(reservation.getId(), reservation);
    }

    public static Reservations getById(int id) {
        return reservations.get(id);
    }
}