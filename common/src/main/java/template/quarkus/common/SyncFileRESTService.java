package template.quarkus.common;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

// Used internal by Servers
@Path("/sync")
public interface SyncFileRESTService extends SyncFileService {

    @Override
    @POST
    @Path("/")
    int sync(UpdatePackage updatePackage);
}
