package com.company.crm.client.user;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class UserPlace extends Place {
	public static final String VIEW_HISTORY_TOKEN = "user";
	
	public UserPlace() { }
	
	@Prefix(value = VIEW_HISTORY_TOKEN)
	public static class Tokenizer implements PlaceTokenizer<UserPlace> {

		@Override
		public UserPlace getPlace(String token) {
			return new UserPlace();
		}

		@Override
		public String getToken(UserPlace place) {
			return "";
		}
	}
}
