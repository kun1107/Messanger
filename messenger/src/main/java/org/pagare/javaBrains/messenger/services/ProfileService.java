package org.pagare.javaBrains.messenger.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.pagare.javaBrains.messenger.database.DatabaseClass;
import org.pagare.javaBrains.messenger.model.ProfileModel;

public class ProfileService {

	Map<String,ProfileModel> profiles = DatabaseClass.getProfiles();
	public ProfileService() {
		profiles.put("Kunal", new ProfileModel(1,"admin","Kunal","Pagare"));
		profiles.put("admin2", new ProfileModel(2,"admin2","Tarjani","Pagare"));
	}
	
	public List<ProfileModel> getAllProfiles() {
		return new ArrayList<ProfileModel>(profiles.values());
	}
	
	
	public List<ProfileModel> getAllProfilesByYear(int year){
		List<ProfileModel>profilesByYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for(ProfileModel pro:profiles.values()) {
			cal.setTime(pro.getCreated());
			if(cal.get(Calendar.YEAR) == year) {
				profilesByYear.add(pro);
			}
		}
		return profilesByYear;
		
	}
	public ProfileModel getProfile(String pName) {
		return profiles.get(pName);
	}
	
	public ProfileModel addProfiles(ProfileModel profile) {
		profile.setpId(profiles.size()+1);
		return profiles.put(profile.getProfileName(), profile);
	}
	
	public ProfileModel updateProfiles(ProfileModel profile) {
		if(profile.getProfileName().isEmpty()) {
			return null;
		}
		return profiles.put(profile.getProfileName(),profile); 
	}
	
	public ProfileModel deleteProfiles(String profileName) {
		return profiles.remove(profileName);
	}
}
