package com.flexicore.interfaces;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface RestServicePlugin extends com.wizzdi.flexicore.boot.jaxrs.interfaces.RestServicePlugin {
}
