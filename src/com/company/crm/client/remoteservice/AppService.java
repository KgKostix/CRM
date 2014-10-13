package com.company.crm.client.remoteservice;


import com.company.crm.shared.exception.AppServerException;
import com.company.crm.shared.remoteservice.RemoteComand;
import com.company.crm.shared.remoteservice.RemoteResponse;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("appservice")
public interface AppService extends RemoteService {
	public RemoteResponse callRemoteComand(RemoteComand remoteComand) throws AppServerException;
}
