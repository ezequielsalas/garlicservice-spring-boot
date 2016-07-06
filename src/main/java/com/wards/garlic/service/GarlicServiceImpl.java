package com.wards.garlic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wards.garlic.domain.Profile;
import com.wards.garlic.repository.ProfileRepository;

@Service
public class GarlicServiceImpl implements GarlicService{
	
	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public void createProfile(Profile profile) {
		// TODO Auto-generated method stub
		profileRepository.insert(profile);
	}

	@Override
	public void deleteProfile(String id) {
		// TODO Auto-generated method stub
		profileRepository.delete(id);
	}

	@Override
	public void updateProfile(Profile profile) {
		// TODO Auto-generated method stub
		profileRepository.save(profile);
	}

	@Override
	public List<Profile> getAllProfile() {
		// TODO Auto-generated method stub
		return profileRepository.findAll();
	}

	@Override
	public Profile getProfileById(String id) {
		// TODO Auto-generated method stub
		return profileRepository.findOne(id);
	}

}
