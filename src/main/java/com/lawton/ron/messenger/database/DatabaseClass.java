package com.lawton.ron.messenger.database;
/*
 * created by rlawton
 * This class serves as the database for this project. Static maps are used to
 * store message and project objects
 */
import java.util.HashMap;
import java.util.Map;
import com.lawton.ron.messenger.model.Message;
import com.lawton.ron.messenger.model.Profile;

public class DatabaseClass {
	
	private DatabaseClass() {
		
	}
	// Static Maps
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();
	// Getter methods
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
}
