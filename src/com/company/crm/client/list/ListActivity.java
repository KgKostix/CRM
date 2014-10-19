package com.company.crm.client.list;

import java.util.ArrayList;
import java.util.List;

import com.company.crm.client.ClientFactory;
import com.company.crm.client.Message.MessageBus;
import com.company.crm.client.activity.AbstractMainActivity;
import com.company.crm.client.remoteservice.CallServerComand;
import com.company.crm.client.remoteservice.ServiceCallback;
import com.company.crm.shared.dom.ListItem;
import com.company.crm.shared.remoteservice.ComandType;
import com.company.crm.shared.remoteservice.ItemType;
import com.company.crm.shared.remoteservice.RemoteResponse;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.Range;

public abstract class ListActivity extends AbstractMainActivity  {
	private ClientFactory clientFactory;
	private MessageBus messageBus;
	private String title = "Edit list";
	

	public ListActivity(ClientFactory clientFactory, MessageBus messageBus) {
		super();
		this.clientFactory = clientFactory;
		this.messageBus = messageBus;
	}

	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		applyCurrentLinkStyle(getLinkId());
		
		final  ListView view = new ListView(this);	
		container.setWidget(view.asWidget());
	}
	
	public AsyncDataProvider<ListItem> getAsyncDataProvider() {
		AsyncDataProvider<ListItem> asyncDataProvider = new AsyncDataProvider<ListItem>() {

			@Override
			protected void onRangeChanged(HasData<ListItem> display) {
				final Range visibleRange = display.getVisibleRange();
				int firstRec = visibleRange.getStart();
				int lastRec = visibleRange.getStart() + visibleRange.getLength();
				
				CallServerComand remoteComand = new CallServerComand(clientFactory);
				remoteComand.setComandType(ComandType.GET_ITEM_LIST);
				remoteComand.setItem(getItemType());
				remoteComand.execute(new ServiceCallback() {
					@Override
					public void processResult(RemoteResponse result) {
						List<ListItem> list = new ArrayList<ListItem>();
						//for (Object rec : result.getListObject()) {
						//	list.add((ListItem) rec);
						//}
						updateRowData(visibleRange.getStart(), list);
						updateRowCount(list.size(), true);
						
					}
				});
			}
		};
		return asyncDataProvider;
	}	

	public void editListItem(ListItem listItem) {
		
	}

	public void addListItem() {
		
	}
	
	public void deleteListItem(ListItem listItem) {
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract String getLinkId();
	
	/*��� ������ */
	public abstract ItemType getItemType();
}
