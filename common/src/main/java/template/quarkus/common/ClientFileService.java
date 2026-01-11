package template.quarkus.common;

import jakarta.ws.rs.*;

// Used by Client
@Path("/files")
public interface ClientFileService {

    @POST
    @Path("/")
    int write(String name, byte[] file);

    @GET
    @Path("/{file}")
    byte[] read(@PathParam("file") String file);
}
