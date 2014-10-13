package com.company.crm.client.contact;

import com.company.crm.client.AppConstants;
import com.company.crm.client.ClientFactory;
import com.company.crm.client.Message.MessageBus;
import com.company.crm.client.list.ListActivity;
import com.company.crm.shared.remoteservice.ItemType;

public class ContactActivity extends ListActivity {

	public ContactActivity(ClientFactory clientFactory,
			MessageBus messageBus) {
		super(clientFactory, messageBus);
		setTitle("Contact");
	}

	@Override
	public String getLinkId() {
		return AppConstants.CONTACT_LINK_ID;
	}

	@Override
	public ItemType getItemType() {
		return ItemType.CONTACT;
	}
}
