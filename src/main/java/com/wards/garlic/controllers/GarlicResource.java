package com.wards.garlic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wards.garlic.domain.Profile;
import com.wards.garlic.service.GarlicService;


@RestController
public class GarlicResource {

	@Autowired
	private GarlicService garlicService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(){
		return "Hi! I'm garlic";
	}
	
	@RequestMapping(value="/profiles", method=RequestMethod.POST)
	public void createProfile(@RequestBody Profile profile){
		garlicService.createProfile(profile);
	}
	
	@RequestMapping(value="/profiles/{profileId}", method=RequestMethod.DELETE)
	public void deleteProfile(@PathVariable("profileId") String profileId){
		garlicService.deleteProfile(profileId);
	}
	
	@RequestMapping(value="/profiles/{profileId}", method=RequestMethod.PUT)
	public void updateProfile(@PathVariable("profileId") String profileId, @RequestBody Profile profile){
		Profile found = garlicService.getProfileById(profileId);
		if(found !=null){
			profile.setId(found.getId());
			found = profile;
			garlicService.updateProfile(found);
		}
	}
	
	@RequestMapping(value="/profiles", method=RequestMethod.GET)
	public List<Profile> getProfiles(){
		return garlicService.getAllProfile();
	}
	
	@RequestMapping(value="/profiles/{profileId}", method=RequestMethod.GET)
	public Profile getProfile(@PathVariable("profileId") String profileId){
		return garlicService.getProfileById(profileId);
	}
	
}
