package com.billgren.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;

import com.billgren.bean.User;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

public class UserService {		
	
	public List<User> getAllUsers() {
		//Converts java objects from xml data retrived by REST service
		
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/backend-labb2/UserService/users");
		List<User> users =resource.get(new GenericType<List<User>>() {});

		return users;
	}
	
	//convert user bean to xml and forward to REST service
	public String addNewUser(User user) {
		
		ArrayList<User> userToAdd = new ArrayList<>();
		userToAdd.add(user);
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/backend-labb2/UserService/submit");
		ClientResponse response = resource.type(MediaType.APPLICATION_XML).post(ClientResponse.class, new GenericEntity<List<User>>(userToAdd) {});
		return String.valueOf(response.getStatus());
		
	}
}
