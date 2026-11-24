package com.dailypurr.daily_purr_api.controllers;

import com.dailypurr.daily_purr_api.data.MenuItemData;
import com.dailypurr.daily_purr_api.models.MenuItems;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/api/menuitems")
public class MenuItemController {

    @GetMapping("")
    public Collection<MenuItems> getAllMenuItems(){
        return MenuItemData.getAll();
    }
}
