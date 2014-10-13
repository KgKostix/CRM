package com.company.crm.client.contact;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class ContactPlace extends Place {
	public static final String VIEW_HISTORY_TOKEN = "contact";
	
	public ContactPlace() { }
	
	@Prefix(value = VIEW_HISTORY_TOKEN)
	public static class Tokenizer implements PlaceTokenizer<ContactPlace> {

		@Override
		public ContactPlace getPlace(String token) {
			return new ContactPlace();
		}

		@Override
		public String getToken(ContactPlace place) {
			return "";
		}
	}
}
