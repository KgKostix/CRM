package com.company.crm.client.contacttype;

import com.company.crm.client.AppConstants;
import com.company.crm.client.ClientFactory;
import com.company.crm.client.Message.MessageBus;
import com.company.crm.client.list.ListActivity;
import com.company.crm.shared.dom.ContactType;
import com.company.crm.shared.dom.ListItem;
import com.company.crm.shared.remoteservice.ItemType;

public class ContactTypeActivity extends ListActivity {

	public ContactTypeActivity(ClientFactory clientFactory,
			MessageBus messageBus) {
		super(clientFactory, messageBus);
		setTitle("Contact type");
	}

	@Override
	public String getLinkId() {
		return AppConstants.CONTACT_TYPE_LINK_ID;
	}

	@Override
	public ItemType getItemType() {
		return ItemType.CONTACT_TYPE;
	}
}
