package com.company.crm.client.list;

import com.company.crm.shared.dom.ListItem;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SelectionChangeEvent.Handler;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.Label;

public class ListView extends Composite {
	interface ListViewUiBinder extends UiBinder<Widget, ListView> {}
	private static ListViewUiBinder uiBinder = GWT
			.create(ListViewUiBinder.class);
	@UiField(provided=true) DataGrid<ListItem> listGrid = new DataGrid<ListItem>();
	@UiField SimplePager simplePagerListGrid;
	@UiField Button button;
	@UiField Label title;

	private ListActivity presenter;
	private ListItem selectRec;
	
	public ListView(ListActivity listActivity) {
		super();
		presenter = listActivity;
		init();
	}
	
	public void init() {
		initWidget(uiBinder.createAndBindUi(this));		
		
		addColumn();
		
	    final SingleSelectionModel<ListItem> selectionModel = new SingleSelectionModel<ListItem>();
	    selectionModel.addSelectionChangeHandler(new Handler() {			
			@Override
			public void onSelectionChange(SelectionChangeEvent event) {
				selectRec = selectionModel.getSelectedObject();
			}
		});	    
	    listGrid.setSelectionModel(selectionModel);

		simplePagerListGrid.setDisplay(listGrid);
		simplePagerListGrid.setPageSize(50);
		
		listGrid.addDomHandler(new DoubleClickHandler() {
			@Override
			public void onDoubleClick(DoubleClickEvent event) {
				presenter.editListItem(selectRec);
			}
		}, DoubleClickEvent.getType());
		
		title.setText(presenter.getTitle());		
		
		this.presenter.getAsyncDataProvider().addDataDisplay(listGrid);
		listGrid.setVisibleRange(0, 50);
	}
		
	private void addColumn() {
		TextColumn<ListItem> recIdColumn = new TextColumn<ListItem>() {
			@Override
			public String getValue(ListItem object) {
				String id = "";
				if (object != null) {
					id = object.getId().toString();
				}
				return id;
			}
		};

		TextColumn<ListItem> nameColumn = new TextColumn<ListItem>() {
			@Override
			public String getValue(ListItem object) {
				String name = "";
				if (object != null) {
					name = object.getMnemo();
				}
				return name;
			}
		};

		listGrid.addColumn(recIdColumn, "ID");
		listGrid.addColumn(nameColumn, "Name");
		listGrid.setColumnWidth(recIdColumn, "20%");
	}
	
	@UiHandler("button")
	void onButtonClick(ClickEvent event) {
		presenter.addListItem();
		
	}
}