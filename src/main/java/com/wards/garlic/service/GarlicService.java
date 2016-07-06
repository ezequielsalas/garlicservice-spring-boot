package com.wards.garlic.service;

import java.util.List;

import com.wards.garlic.domain.Profile;

public interface GarlicService {
	
	
	public void createProfile(Profile profile);
	public void deleteProfile(String id);
	public void updateProfile(Profile profile);
	public List<Profile> getAllProfile();
	public Profile getProfileById(String id);
	

}
