package template.quarkus.server.resource;

import jakarta.inject.Inject;

import template.quarkus.common.ClientFileService;
import template.quarkus.server.service.FileService;

public class ClientFileServiceResource implements ClientFileService {

    @Inject
    private FileService fileService;

    public ClientFileServiceResource() {}

    @Override
    public int write(String name, byte[] file) {
        return fileService.writeThrough(name, file);
    }

    @Override
    public byte[] read(String file) {
        return fileService.read(file);
    }
}
