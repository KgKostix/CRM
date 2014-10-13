package com.company.crm.client.Message;

import java.util.HashMap;

public class MessageBus {
	private HashMap<String, Message> messageMap = null;

	public MessageBus() {
		messageMap = new HashMap<String, Message>();
	}

	public void putValue(String key, Message value) {
		if (messageMap == null) {			
			messageMap = new HashMap<String, Message>();
		}
		messageMap.put(key, value);
	}

	public Message getValue(String key) {
		if (messageMap != null) {
			return messageMap.get(key);
		} else {
			return null;
		}
	}
}
