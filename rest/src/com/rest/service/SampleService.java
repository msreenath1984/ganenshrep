package com.rest.service;

//just sake of git

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/sampleService")
public class SampleService {
	
	@GET
	@Path("/{name}")
	public String generateMessage(@PathParam("name") String name){
		return "this is rest service: "+name;
	}
}
