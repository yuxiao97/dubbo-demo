package com.yuxiao.dubbo.demo.service;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("")
@Produces(MediaType.APPLICATION_JSON)
public interface DemoService {

    @GET
    @Path("say")
    String say(@QueryParam("name") String name);
}
