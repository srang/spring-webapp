package com.yummynoodlebar.core.services;

import com.yummynoodlebar.events.menu.*;

public interface MenuService {
  public AllMenuItemsEvent requestAllMenuItems(RequestAllMenuItemsEvent requestAllMenuItemsEvent);
  public MenuItemDetailsEvent requestMenuItemDetails(RequestMenuItemDetailsEvent requestMenuItemDetailsEvent);
  public MenuItemDetailsEvent createMenuItem(CreateMenuItemEvent createMenuItemEvent);
}
