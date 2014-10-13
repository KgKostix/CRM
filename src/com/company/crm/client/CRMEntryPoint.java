package com.company.crm.client;

import com.company.crm.client.contacttype.ContactTypePlace;
import com.company.crm.client.layout.AppLayout;
import com.company.crm.client.placeactivitymapper.AppActivityMapper;
import com.company.crm.client.placeactivitymapper.AppPlaceHistoryMapper;
import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.company.crm.client.Message.MessageBus;;

public class CRMEntryPoint implements EntryPoint {
	private SimplePanel containerWidget;
	private Place defaultPlace = new ContactTypePlace();
	
	@SuppressWarnings("deprecation")
	@Override
	public void onModuleLoad() {	
		final AppLayout mainLayout = new AppLayout();
		containerWidget = mainLayout.getAppContentHolder();
		
		final ClientFactory clientFactory = GWT.create(ClientFactory.class);
		EventBus eventBus = clientFactory.getEventBus();
		PlaceController placeController = clientFactory.getPlaceController();
		
		final MessageBus messageBus = GWT.create(MessageBus.class);
		
		// activate activity manager and init display
		ActivityMapper activityMapper = new AppActivityMapper(clientFactory, messageBus);
		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(containerWidget);
		
		// display default view with activated history processing
		AppPlaceHistoryMapper historyMapper = GWT.create(AppPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
		historyHandler.register(placeController, eventBus, defaultPlace);
		
		RootLayoutPanel.get().add(mainLayout);
		
		//History.newItem(defaultPlace.);;
	}
}
