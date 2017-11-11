package com.patterns.rest;

import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@ApplicationPath("/")
@Path("users")
public class Users2 extends Application {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers() {
		ArrayList<User> allUsers = this.findAllUsers();
		JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();
		for (User user : allUsers) {
			jsonArrayBuilder.add(Json.createObjectBuilder()
					.add("id", user.getId())
					.add("firstname", user.getFirstName())
					.add("lastname", user.getLastName())
			);
		}
		return Response.ok(jsonArrayBuilder.build()).build();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@PathParam("id") String id){
		User user = this.findUser(id);
		JsonArrayBuilder jsonArrayBuilder = Json.createArrayBuilder();
		jsonArrayBuilder.add(
				Json.createObjectBuilder()
				.add("id", user.getId())
				.add("firstname", user.getFirstName())
				.add("lastname", user.getLastName())
		);
		return Response.ok(jsonArrayBuilder.build()).build();
	}

	/*logic*/
	private ArrayList<User> findAllUsers() {
		ArrayList<User> allUsers = new ArrayList<>();
		allUsers.add(new User(123456, "Alex", "Theedom"));
		allUsers.add(new User(456789, "Murat", "Yener"));
		return allUsers;
	}

	private User findUser(String id){
		return new User(123452,"Pavel","Tsekhanovich");
	}
}