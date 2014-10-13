package com.company.crm.shared.remoteservice;

import java.io.Serializable;

public class RemoteComand implements Serializable {
	private static final long serialVersionUID = 3912945649036394396L;
	
	private ComandType comandType;
	private ItemType itemType;
	
	public RemoteComand() {
		super();
	}

	public ComandType getComandType() {
		return comandType;
	}

	public void setComandType(ComandType comandType) {
		this.comandType = comandType;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	
	
}
