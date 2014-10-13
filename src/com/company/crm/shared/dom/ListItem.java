package com.company.crm.shared.dom;

import com.google.gwt.user.client.rpc.IsSerializable;

public interface ListItem extends IsSerializable {

	public Long getId();
	
	public String getMnemo();
}
