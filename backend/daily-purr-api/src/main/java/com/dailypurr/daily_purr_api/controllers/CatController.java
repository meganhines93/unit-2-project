package com.dailypurr.daily_purr_api.controllers;

import com.dailypurr.daily_purr_api.data.CatData;
import com.dailypurr.daily_purr_api.models.Cat;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/cats")
public class CatController {

    @GetMapping("")
    public Collection<Cat> getAllCats() {
        return CatData.getAll();
    }

    @GetMapping("/details/{catId}")
    public Cat getCatById(@PathVariable int catId) {
        return CatData.getById(catId);
    }

    @PostMapping("/add")
    public String addNewCat(@RequestParam String name, int age, String color, String breed, List<String> personality, List<String> good_with, String description, String imageURL, boolean available, String gender, BigDecimal adoption_fee, String adoption_info) {
        Cat newCat = new Cat(name, age, color, breed, personality, good_with, description, imageURL, available, gender, adoption_fee, adoption_info);
        CatData.addNew(newCat);
        return "New Cat has been added " + newCat;
    }
}
