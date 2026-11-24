package com.dailypurr.daily_purr_api.data;

import com.dailypurr.daily_purr_api.models.MenuItems;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MenuItemData {

    private static final Map<Integer, MenuItems> menuItems = new HashMap<>();

    public static Collection<MenuItems> getAll() {
        return menuItems.values();
    }

    public static void addNew(MenuItems menuItem) {
        menuItems.put(menuItem.getId(), menuItem);
    }

    public static MenuItems getById(int id) {
        return menuItems.get(id);
    }
}