package com.ds.interview.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by zachncst on 8/31/16.
 */
@Path("/")
public class HelloController {

    @GET
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
