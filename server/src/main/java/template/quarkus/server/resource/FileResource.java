package template.quarkus.server.resource;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/file")
@ApplicationScoped
public class FileResource {

    private String fileContent = "initial content";

    @GET
    @Path("/read")
    @Produces(MediaType.TEXT_PLAIN)
    public String read() {
        return fileContent;
    }

    @POST
    @Path("/write")
    @Consumes(MediaType.TEXT_PLAIN)
    public Response write(String newContent) {
        fileContent = newContent;
        return Response.ok().build();
    }
}

