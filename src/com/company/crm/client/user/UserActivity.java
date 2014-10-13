package com.company.crm.client.user;

import com.company.crm.client.AppConstants;
import com.company.crm.client.ClientFactory;
import com.company.crm.client.Message.MessageBus;
import com.company.crm.client.list.ListActivity;
import com.company.crm.shared.remoteservice.ItemType;

public class UserActivity extends ListActivity {

	public UserActivity(ClientFactory clientFactory,
			MessageBus messageBus) {
		super(clientFactory, messageBus);
		setTitle("User");
	}

	@Override
	public String getLinkId() {
		return AppConstants.USER_LINK_ID;
	}

	@Override
	public ItemType getItemType() {
		return ItemType.USER;
	}
}
