package org.pagare.javaBrains.messenger.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.pagare.javaBrains.messenger.model.ProfileModel;
import org.pagare.javaBrains.messenger.services.ProfileService;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/profiles")
public class ProfileResource {

	ProfileService profileService = new ProfileService();

	@GET
	public List<ProfileModel> getAllProfiles() {
		return new ArrayList<ProfileModel>(profileService.getAllProfiles());
	}

	@GET
	@Path("{/profileName}")
	public ProfileModel getProfile(@PathParam("profileName") String profilesName) {
		return profileService.getProfile(profilesName);
	}

	@POST
	public ProfileModel addProfile(ProfileModel profile) {
		return profileService.addProfiles(profile);
	}
	
	@PUT
	@Path("/{profileName}")
	public ProfileModel updateProfile(@PathParam("profileName")String profilesName,ProfileModel profile) {
		profile.setProfileName(profilesName);
		return profileService.updateProfiles(profile);		
	}
	@DELETE
	@Path("/{profileName}")
	public void deleteProfile(@PathParam("profileName") String profileName) {
		profileService.deleteProfiles(profileName);
	}
		
	}
	

