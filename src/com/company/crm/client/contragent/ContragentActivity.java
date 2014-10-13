package com.company.crm.client.contragent;

import com.company.crm.client.AppConstants;
import com.company.crm.client.ClientFactory;
import com.company.crm.client.Message.MessageBus;
import com.company.crm.client.list.ListActivity;
import com.company.crm.shared.remoteservice.ItemType;

public class ContragentActivity extends ListActivity {

	public ContragentActivity(ClientFactory clientFactory,
			MessageBus messageBus) {
		super(clientFactory, messageBus);
		setTitle("Contragent");
	}

	@Override
	public String getLinkId() {
		return AppConstants.CONTRAGENT_LINK_ID;
	}

	@Override
	public ItemType getItemType() {
		return ItemType.CONTRAGENT;
	}

}
