package com.company.crm.client.remoteservice;

import com.company.crm.shared.remoteservice.RemoteComand;
import com.company.crm.shared.remoteservice.RemoteResponse;
import com.google.gwt.user.client.rpc.AsyncCallback;


public interface AppServiceAsync {

	void callRemoteComand(RemoteComand remoteComand,
			AsyncCallback<RemoteResponse> callback);

}
