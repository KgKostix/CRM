package com.company.crm.client;

import com.company.crm.client.remoteservice.AppService;
import com.company.crm.client.remoteservice.AppServiceAsync;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;


public class ClientFactoryImpl implements ClientFactory {
	private EventBus eventBus = null;
	private PlaceController placeController = null;
	private AppServiceAsync appService = null;
	
	
	@Override 
	public EventBus getEventBus() { 
		if (eventBus == null) {			
			eventBus = new SimpleEventBus();
		}
		return eventBus; 		
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public PlaceController getPlaceController() { 
		if (placeController == null) {
			placeController = new PlaceController(getEventBus());
		}
		return placeController; 
	}

	@Override
	public AppServiceAsync getAppServiceAsync() {
		if (appService == null) {
			appService = GWT.create(AppService.class);
		}
		return appService;
	}

}
