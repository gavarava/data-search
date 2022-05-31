package org.datasearch.adapters.api;

import org.datasearch.adapters.api.dto.SearchResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/search")
public class DataSearchResource {

    @Path("/{keyword}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public SearchResponse hello(@PathParam("keyword") String keyword) {
        long startTime = System.currentTimeMillis();
        if (keyword.equalsIgnoreCase("Tom")) {
            throw new NotFoundException(keyword + " was not found");
        }
        return SearchResponse.builder()
                .searchResult(List.of(keyword))
                .searchTimeInMilliseconds(System.currentTimeMillis() - startTime)
                .build();
    }
}
