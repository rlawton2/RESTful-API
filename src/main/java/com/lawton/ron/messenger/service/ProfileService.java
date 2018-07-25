package com.lawton.ron.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.lawton.ron.messenger.database.DatabaseClass;
import com.lawton.ron.messenger.model.Profile;

public class ProfileService {
	
	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService() {
		profiles.put("Rowdy", new Profile(1L, "Rowdy", "Ron", "Lawton"));
		profiles.put("JJ", new Profile(2L, "JJ", "Jimmy", "Jackson"));
	}
	
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile) {
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile message) {
		if (message.getId() <= 0) {
			return null;
		}
		profiles.put(message.getProfileName(), message);
		return message;
	}
	
	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
	}
	
}
