package org.pagare.javaBrains.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.pagare.javaBrains.messenger.model.MessageModel;
import org.pagare.javaBrains.messenger.model.ProfileModel;

public class DatabaseClass {

	public static Map<Integer,MessageModel> messages = new HashMap<>();
	public static Map<String,ProfileModel> profiles = new HashMap<>();

	public static Map<Integer, MessageModel> getMessages() {
		return messages;
	}

	public static Map<String, ProfileModel> getProfiles() {
		return profiles;
	}

	
	
	
	
}
