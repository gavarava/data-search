package org.datasearch.adapters.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/search")
public class DataSearchResource {

    @Path("/{keyword}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("keyword")String keyword) {
        if (keyword.equalsIgnoreCase("Tom")) {
            throw new NotFoundException(keyword + " was not found");
        }
        // FIXME Implement
        return keyword;
    }
}