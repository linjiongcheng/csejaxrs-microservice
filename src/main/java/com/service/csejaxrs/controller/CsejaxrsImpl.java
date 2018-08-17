package com.service.csejaxrs.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2018-08-10T06:10:22.801Z")


@RestSchema(schemaId = "csejaxrs")
@Path("/csejaxrs")

@Produces({ "application/json" })
public class CsejaxrsImpl  {

    @Autowired
    private CsejaxrsDelegate csejaxrsDelegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return csejaxrsDelegate.helloworld(name);
    }
}

