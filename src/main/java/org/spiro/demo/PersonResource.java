package org.spiro.demo;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.panache.common.Sort;
@Path("/person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class PersonResource {
    @GET
    public List<Person> getAll() throws Exception {
        return Person.findAll(Sort.ascending("last_name")).list();

    }
}
