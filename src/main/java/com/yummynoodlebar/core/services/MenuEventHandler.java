package com.yummynoodlebar.core.services;

import com.yummynoodlebar.events.menu.*;
import com.yummynoodlebar.persistence.services.MenuPersistenceService;

public class MenuEventHandler implements MenuService {
	private MenuPersistenceService menuPersistenceService;
	
	public MenuEventHandler(MenuPersistenceService menuPersistenceService) {
	  this.menuPersistenceService = menuPersistenceService;
  	}
	
	public AllMenuItemsEvent requestAllMenuItems(RequestAllMenuItemsEvent requestAllMenuItemsEvent) {
	    return menuPersistenceService.requestAllMenuItems(requestAllMenuItemsEvent);
	}

	public MenuItemDetailsEvent requestMenuItemDetails(RequestMenuItemDetailsEvent requestMenuItemDetailsEvent) {
	    return menuPersistenceService.requestMenuItemDetails(requestMenuItemDetailsEvent);
	}

	public MenuItemDetailsEvent createMenuItem(CreateMenuItemEvent createMenuItemEvent) {
	    return menuPersistenceService.createMenuItem(createMenuItemEvent);
	}
}
