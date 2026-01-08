package template.quarkus.server.resource;

import jakarta.inject.Inject;

import template.quarkus.common.SyncFileRESTService;
import template.quarkus.common.UpdatePackage;
import template.quarkus.server.service.FileService;

public class SyncFileServiceResource implements SyncFileRESTService {

    @Inject
    private FileService fileService;

    public SyncFileServiceResource() {}

    @Override
    public int sync(UpdatePackage updatePackage) {
        return fileService.store(updatePackage);
    }
}
