package com.company.crm.client.contacttype;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class ContactTypePlace extends Place {
	public static final String VIEW_HISTORY_TOKEN = "contact_type";
	
	public ContactTypePlace() { }
	
	@Prefix(value = VIEW_HISTORY_TOKEN)
	public static class Tokenizer implements PlaceTokenizer<ContactTypePlace> {

		@Override
		public ContactTypePlace getPlace(String token) {
			return new ContactTypePlace();
		}

		@Override
		public String getToken(ContactTypePlace place) {
			return "";
		}
	}
}
