package com.company.crm.client;

import com.company.crm.client.remoteservice.AppServiceAsync;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;


public interface ClientFactory {
	public EventBus getEventBus();
	public PlaceController getPlaceController();
	public AppServiceAsync getAppServiceAsync();
}
