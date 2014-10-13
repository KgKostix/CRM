package com.company.crm.client.edit;

public enum EditMode {	
	ADD("Add"), EDIT("Edit"), VIEW("View");
	
	private final String editTitle;

	EditMode(String editTitle) {
		this.editTitle = editTitle;
	}
		
	public String getTitle() {
		return editTitle;
	}
}
