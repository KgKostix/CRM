package com.company.crm.client.placeactivitymapper;

import com.company.crm.client.contact.ContactPlace;
import com.company.crm.client.contacttype.ContactTypePlace;
import com.company.crm.client.contragent.ContragentPlace;
import com.company.crm.client.user.UserPlace;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;


@WithTokenizers({ContragentPlace.Tokenizer.class, ContactPlace.Tokenizer.class,
	ContactTypePlace.Tokenizer.class, UserPlace.Tokenizer.class})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
}
