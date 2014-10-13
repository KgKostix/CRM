package com.company.crm.client.contragent;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class ContragentPlace extends Place {
	public static final String VIEW_HISTORY_TOKEN = "contragent";
	
	public ContragentPlace() { }
	
	@Prefix(value = VIEW_HISTORY_TOKEN)
	public static class Tokenizer implements PlaceTokenizer<ContragentPlace> {

		@Override
		public ContragentPlace getPlace(String token) {
			return new ContragentPlace();
		}

		@Override
		public String getToken(ContragentPlace place) {
			return "";
		}
	}
}
