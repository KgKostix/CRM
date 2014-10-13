package com.company.crm.client.remoteservice;

import com.company.crm.shared.exception.AppServerException;
import com.company.crm.shared.remoteservice.RemoteResponse;
import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class ServiceCallback implements
		AsyncCallback<RemoteResponse> {

	@Override
	public void onFailure(Throwable caught) {
		if (caught instanceof AppServerException) {
			if (((AppServerException) caught).getExceptionCode() == "202") {
				
			}
		} 
		processFailure(caught);
	}

	@Override
	public void onSuccess(RemoteResponse result) {
		processResult(result);
	}
	
	public void processFailure(Throwable caught) {
		
	}
	
	public abstract void processResult(RemoteResponse result);
}
