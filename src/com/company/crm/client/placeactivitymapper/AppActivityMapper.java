package com.company.crm.client.placeactivitymapper;

import com.company.crm.client.ClientFactory;
import com.company.crm.client.Message.MessageBus;
import com.company.crm.client.contact.ContactActivity;
import com.company.crm.client.contact.ContactPlace;
import com.company.crm.client.contacttype.ContactTypeActivity;
import com.company.crm.client.contacttype.ContactTypePlace;
import com.company.crm.client.contragent.ContragentActivity;
import com.company.crm.client.contragent.ContragentPlace;
import com.company.crm.client.user.UserActivity;
import com.company.crm.client.user.UserPlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;


public class AppActivityMapper implements ActivityMapper {
	private ClientFactory clientFactory;
	private MessageBus messageBus;
	
	public AppActivityMapper(ClientFactory clientFactory, MessageBus messageBus) {
		super();
		this.clientFactory = clientFactory;
		this.messageBus = messageBus;
	}
	
	@Override
	public Activity getActivity(Place place) {
		if (place instanceof ContactTypePlace) {
			return new ContactTypeActivity(clientFactory, messageBus);
		} else if (place instanceof ContactPlace) {
			return new ContactActivity(clientFactory, messageBus);
		} else if (place instanceof ContragentPlace) {
			return new ContragentActivity(clientFactory, messageBus);
		} else if (place instanceof UserPlace) {
			return new UserActivity(clientFactory, messageBus);
		}
		return null;		
	}
}
