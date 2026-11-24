package com.dailypurr.daily_purr_api.controllers;

import com.dailypurr.daily_purr_api.data.MenuItemData;
import com.dailypurr.daily_purr_api.models.MenuItems;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.math.BigDecimal;
import java.util.Collection;

@RestController
@RequestMapping("/api/menuitems")
public class MenuItemController {

    @GetMapping("")
    public Collection<MenuItems> getAllMenuItems(){
        return MenuItemData.getAll();
    }

    @PostMapping("/add")
    public String addNewMenuItem(@RequestParam String name, String category, String description, BigDecimal price, String imageURL, String available){
        MenuItems newMenuItem = new MenuItems(name, category, description, price, imageURL, available);
        MenuItemData.addNew(newMenuItem);
        return "Menu item has been added: " + newMenuItem;
    }
}
