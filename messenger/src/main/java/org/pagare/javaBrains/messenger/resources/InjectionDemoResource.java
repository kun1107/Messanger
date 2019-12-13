package org.pagare.javaBrains.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/injectionDemo")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class InjectionDemoResource {

	@GET
	@Path("annotations")
	public String getParamStringAnnotations(@HeaderParam("HeaderParam") String headerValue) {
		return "Header Param value "+headerValue;
	}
}
