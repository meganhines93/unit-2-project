package com.dailypurr.daily_purr_api.controllers;

import com.dailypurr.daily_purr_api.data.CatData;
import com.dailypurr.daily_purr_api.models.Cat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/cats")
public class CatController {

    @GetMapping("")
    public Collection<Cat> getAllCats() {
        return CatData.getAll();
    }

}
