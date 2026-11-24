package com.dailypurr.daily_purr_api.controllers;


import com.dailypurr.daily_purr_api.data.AdoptionData;
import com.dailypurr.daily_purr_api.models.Adoption;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/api/adoptions")
public class AdoptionController {

    @GetMapping("")
    public Collection<Adoption> getAllAdoptions() {
        return AdoptionData.getAll();
    }

    @PostMapping("/add")
    public String addNewAdoption(@RequestParam String first_name, String last_name, String email, String phone_number, String street_address, String city, String state, String zip_code, String about_your_home, String type_of_home, int cat_id, String why_adopt, String describe_your_lifestyle, String new_cat_life, boolean commitment_entire_life, boolean keep_indoors, String additional_comments) {
        Adoption newAdoption = new Adoption(first_name, last_name, email, phone_number, street_address, city, state, zip_code, about_your_home, type_of_home, cat_id, why_adopt, describe_your_lifestyle, new_cat_life, commitment_entire_life, keep_indoors, additional_comments);
        AdoptionData.addNew(newAdoption);
        return "Adoption form added: " + newAdoption;
    }
}
