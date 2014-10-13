package com.company.crm.server.remoteservice;

import com.company.crm.client.remoteservice.AppService;
import com.company.crm.shared.dom.User;
import com.company.crm.shared.exception.AppServerException;
import com.company.crm.shared.remoteservice.RemoteComand;
import com.company.crm.shared.remoteservice.RemoteResponse;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class AppServiceImpl extends RemoteServiceServlet implements AppService {
	private User curentUser;
	
	@Override
	public RemoteResponse callRemoteComand(RemoteComand remoteComand) throws AppServerException {
		if (curentUser == null) {
			AppServerException appServerException = new AppServerException("401 Unauthorized");
			appServerException.setExceptionCode("401");
			throw appServerException;
		} 
		return new RemoteResponse();
	}


}
