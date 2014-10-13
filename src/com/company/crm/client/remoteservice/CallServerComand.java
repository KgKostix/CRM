package com.company.crm.client.remoteservice;

import com.company.crm.client.ClientFactory;
import com.company.crm.shared.remoteservice.ComandType;
import com.company.crm.shared.remoteservice.ItemType;
import com.company.crm.shared.remoteservice.RemoteComand;

public class CallServerComand {
	private ClientFactory clientFactory;
	private ComandType comandType;
	private ItemType itemType;
	private Object target;
	
	public CallServerComand(ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
	}

	public ComandType getComandType() {
		return comandType;
	}

	public void setComandType(ComandType comandType) {
		this.comandType = comandType;
	}
	
	public ItemType getItem() {
		return itemType;
	}

	public void setItem(ItemType itemType) {
		this.itemType = itemType;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public void execute(ServiceCallback serviceCallback) {
		AppServiceAsync appService = clientFactory.getAppServiceAsync();
		RemoteComand remoteComand = new RemoteComand();
		remoteComand.setComandType(comandType);
		remoteComand.setItemType(itemType);
		appService.callRemoteComand(remoteComand, serviceCallback);
	}
}
