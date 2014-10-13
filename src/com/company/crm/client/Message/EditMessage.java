package com.company.crm.client.Message;

import com.company.crm.client.edit.EditMode;

public class EditMessage extends Message {
	private EditMode editMode;
	
	public EditMessage(Object value) {
		super(value);
	}

	public EditMessage(EditMode editMode, Long id) {
		this(id);
		setEditMode(editMode);
	}

	public EditMode getEditMode() {
		return editMode;
	}

	public void setEditMode(EditMode editMode) {
		this.editMode = editMode;
	}
}
