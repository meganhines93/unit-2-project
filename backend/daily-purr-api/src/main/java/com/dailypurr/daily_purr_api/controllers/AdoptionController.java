package com.dailypurr.daily_purr_api.controllers;


import com.dailypurr.daily_purr_api.data.AdoptionData;
import com.dailypurr.daily_purr_api.models.Adoption;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/api/adoptions")
public class AdoptionController {

    @GetMapping("")
    public Collection<Adoption> getAllAdoptions() {
        return AdoptionData.getAll();
    }

}
