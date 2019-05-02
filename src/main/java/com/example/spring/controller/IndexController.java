package com.example.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class IndexController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, String> doGet() {
		Map<String, String> result = new HashMap<>();
		result.put("status", "OK");
		return result;
	}

}
